package com.delivery.backend.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Junction;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.delivery.backend.beans.AWBNOListBean;
import com.delivery.backend.beans.LiveStatusBean;
import com.delivery.backend.beans.StatusBean;
import com.delivery.backend.beans.requests.DeliveryStatusUpdateRequestBean;
import com.delivery.backend.beans.responses.DeliveryStatusUpdateResponseBean;
import com.delivery.backend.daos.DeliveryPrint;
import com.delivery.backend.daos.DeliveryStatus;
import com.delivery.backend.daos.LiveStatus;
import com.delivery.backend.daos.MstStatus;
import com.delivery.backend.daos.UnDeliveryStatus;
import com.delivery.backend.utils.HibernateUtil;

/**
 * @author Ram K Bharathi
 * @created May 4, 2017
 */
public class OpsService {
	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public List<StatusBean> getStatusList() {
		System.out.println("getting status list");
		List<StatusBean> statusList = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();

			Criteria criteria = session.createCriteria(MstStatus.class);
			List<MstStatus> mstStatusList = criteria.list();
			System.out.println("status list size : " + mstStatusList.size());
			if (mstStatusList.size() > 0) {
				statusList = new ArrayList<StatusBean>();
				for (MstStatus status : mstStatusList) {
					StatusBean bean = new StatusBean();
					bean.setStatusCode(status.getStatusCode());
					bean.setStatusDesc(status.getStatusDesc());
					bean.setStatusFlag(status.isStatusFlag());
					bean.setRemarks(status.getRemarks());
					bean.setNoInfoFlag(status.isNoInfoFlag());
					statusList.add(bean);
					bean = null;
				}
			}
			transaction.commit();
		} catch (RuntimeException re) {
			if (transaction != null) {
				transaction.rollback();
			}
			System.err.println("getting status list failed : " + re);
			re.printStackTrace();
			throw re;
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return statusList;
	}

	public AWBNOListBean getAwbNoList(String employeeCode) throws Exception {
		System.out.println("getting awbno list");
		AWBNOListBean listBean = null;

		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			String startDateString = sdf.format(calendar.getTime()) + " 00:00:00";
			System.out.println("starting date : " + startDateString);
			String endDateString = sdf.format(calendar.getTime()) + " 23:59:59";
			System.out.println("ending date : " + endDateString);
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
			Date startDate = sdf2.parse(startDateString);
			Date endDate = sdf2.parse(endDateString);
			List<String> awbNoList = new ArrayList<String>();
			Criteria criteria = session.createCriteria(DeliveryPrint.class);
			// criteria.add(Restrictions.eq("employeeCode", employeeCode));
			Junction condition = Restrictions.conjunction().add(Restrictions.eq("employeeCode", employeeCode))
					.add(Restrictions.gt("drsDateTime", startDate)).add(Restrictions.lt("drsDateTime", endDate));
			criteria.add(condition);
			List<DeliveryPrint> printList = criteria.list();
			System.out.println("print size : " + printList.size());
			if (printList.size() > 0) {
				for (DeliveryPrint print : printList) {
					Criteria criteria2 = session.createCriteria(LiveStatus.class);
					criteria2.add(Restrictions.eq("deliveryPrintNo", print.getDeliveryPrintNo()));
					List<LiveStatus> liveList = criteria2.list();
					System.out.println("live status list size : " + liveList.size());
					if (liveList.size() > 0) {
						for (LiveStatus live : liveList) {
							Criteria criteria3 = session.createCriteria(DeliveryStatus.class);
							criteria3.add(Restrictions.eq("awbNo", live.getAwbNo()));
							List<DeliveryStatus> statusList = criteria3.list();
							System.out.println("delivery status list size : " + statusList.size());
							if (statusList.isEmpty()) {
								awbNoList.add(live.getAwbNo());
							}
						}
					}
				}
				listBean = new AWBNOListBean();
				listBean.setAwbNoList(awbNoList);
			}
			transaction.commit();
		} catch (RuntimeException re) {
			if (transaction != null) {
				transaction.rollback();
			}
			System.err.println("getting awbno list failed : " + re);
			re.printStackTrace();
			throw re;
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return listBean;
	}
	
	public LiveStatusBean getAwbNoLiveStatus(String awbNo){
		LiveStatusBean statusBean = null;
		Session session = null;
		Transaction transaction = null;
		try{
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			
			Criteria criteria = session.createCriteria(LiveStatus.class);
			criteria.add(Restrictions.eq("awbNo", awbNo));
			criteria.addOrder(Order.desc("scanDtTime"));
			List<LiveStatus> statusList = criteria.list();
			System.out.println("status list size: "+statusList.size());
			if(statusList.size()>0){
				LiveStatus instance = statusList.get(0);
				statusBean = new LiveStatusBean();
				statusBean.setLiveId(instance.getLiveId());
				statusBean.setAwbNo(instance.getAwbNo());
				statusBean.setCityCode(instance.getCityCode());
				statusBean.setDeliveryPrintNo(instance.getDeliveryPrintNo());
				statusBean.setEempCode(instance.getEempCode());
				statusBean.setEmpCode(instance.getEmpCode());
				statusBean.setPrintOrder(instance.getPrintOrder());
				statusBean.setScanDtTime(instance.getScanDtTime().toString());
				statusBean.setStatusCode(instance.getStatusCode());
				statusBean.setSvcCode(instance.getSvcCode());
			}
			transaction.commit();
		} catch(RuntimeException re){
			if (transaction != null) {
				transaction.rollback();
			}
			System.err.println("getting live status failed : " + re);
			re.printStackTrace();
			throw re;
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return statusBean;
	}

	public DeliveryStatusUpdateResponseBean updateDeiveryStatus(DeliveryStatusUpdateRequestBean requestBean) {
		DeliveryStatusUpdateResponseBean responseBean = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			if (requestBean.isDelivered()) {
				DeliveryStatus status = new DeliveryStatus();
				status.setAwbNo(requestBean.getAwbNo());
				status.setOrgSvc(requestBean.getOrgSvc());
				status.setDstSvc(requestBean.getDstSvc());
				status.setDeliveryEmpCode(requestBean.getDeliveryEmpCode());
				status.setStatusCode(requestBean.getStatusCode());
				status.setStatusDate(requestBean.getStatusDate());
				status.setStatusTime(requestBean.getStatusTime());
				status.setRevdBy(requestBean.getRevdBy());
				status.setPhoneNo(requestBean.getPhoneNo());
				status.setId(requestBean.getId());
				status.setIdNo(requestBean.getIdNo());
				status.setRelationId(requestBean.getRelationId());
				status.setRemarks(requestBean.getRemarks());
				status.setLatitude(requestBean.getLatitude());
				status.setLongitude(requestBean.getLongitude());
				status.setSignatureImg(requestBean.getSignatureImg());
				status.setScanImg(requestBean.getScanImg());
				session.persist(status);
				responseBean = new DeliveryStatusUpdateResponseBean();
				responseBean.setMessage("Success");
			} else {
				UnDeliveryStatus status = new UnDeliveryStatus();
				status.setLIVE_ID(requestBean.getLiveId());
				status.setAwbNo(requestBean.getAwbNo());
				status.setOrgSvc(requestBean.getOrgSvc());
				status.setDstSvc(requestBean.getDstSvc());
				status.setStatusCode(requestBean.getStatusCode());
				status.setDeliveryEmpCode(requestBean.getDeliveryEmpCode());
				status.setStatusDate(requestBean.getStatusDate());
				status.setStatusTime(requestBean.getStatusTime());
				status.setRemarks(requestBean.getRemarks());
				session.persist(status);
				responseBean = new DeliveryStatusUpdateResponseBean();
				responseBean.setMessage("Success");
			}
			transaction.commit();
		} catch (RuntimeException re) {
			if (transaction != null) {
				transaction.rollback();
			}
			System.err.println("updating status failed : " + re);
			re.printStackTrace();
			throw re;
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return responseBean;
	}

}
