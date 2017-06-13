package com.delivery.backend.services;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.delivery.backend.beans.IdBean;
import com.delivery.backend.beans.RelationBean;
import com.delivery.backend.beans.requests.UserLoginRequestBean;
import com.delivery.backend.beans.responses.UserLoginResponseBean;
import com.delivery.backend.daos.MST_ID;
import com.delivery.backend.daos.Relation;
import com.delivery.backend.daos.Users;
import com.delivery.backend.utils.HibernateUtil;

/**
 * @author Ram K Bharathi
 * @created May 2, 2017
 */
public class UserService {
	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public UserLoginResponseBean userLogin(UserLoginRequestBean requestBean){
		System.out.println("user login");
		UserLoginResponseBean responseBean = null;
		Session session = null;
		Transaction transaction = null;
		try{
			System.out.println("username = " + requestBean.getUsername());
			System.out.println("password = " + requestBean.getPassword());
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			
			Users user = (Users) session
					.get("com.delivery.backend.daos.Users", requestBean.getUsername());
			if(user!=null){
				if(user.getPassword().equals(requestBean.getPassword())){
					responseBean = new UserLoginResponseBean();
					responseBean.setCod(user.isCod());
					responseBean.setEmployeeCode(user.getEmployeeCode());
					responseBean.setFileOperation(user.isFileOperation());
					responseBean.setInBound(user.isInBound());
					responseBean.setOutBound(user.isOutBound());
					responseBean.setReport(user.isReport());
					responseBean.setSetting(user.isSetting());
					responseBean.setStatusFlag(user.isStatusFlag());
					responseBean.setUsername(user.getUserName());
					String tempToken = requestBean.getUsername()+":"+requestBean.getPassword();
					String userAuthToken = Base64.getEncoder().encodeToString(tempToken.getBytes());
					System.out.println("auth token : " + userAuthToken);
					responseBean.setUserAuthToken(userAuthToken);
				}
			}
			transaction.commit();
		}
		catch(RuntimeException re){
			if(transaction!=null){
				transaction.rollback();
			}
			System.err.println("user login failed : " + re);
			re.printStackTrace();
			throw re;
		}
		finally {
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
		return responseBean;
	}
	
	public boolean userAuthenticate(String authTokenFromHeader){
		System.out.println("auth user");
		boolean authOk = false;
		Session session = null;
		Transaction transaction = null;
		try{
			byte[] authTokenBytes = Base64.getDecoder().decode(authTokenFromHeader);
			String authToken = new String(authTokenBytes);
			String[] authTokenArray = authToken.split(":");
			if(authTokenArray.length!=2){
				return authOk;
			}
			String username = authTokenArray[0];
			String password = authTokenArray[1];
			
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			
			Users user = (Users) session
					.get("com.delivery.backend.daos.Users", username);
			if(user!=null){
				if(password.equals(user.getPassword())){
					authOk = true;
				}
				else{
					authOk = false;
				}
			}
			else{
				authOk = false;
			}
			transaction.commit();
		}
		catch(RuntimeException re){
			if(transaction!=null){
				transaction.rollback();
			}
			System.err.println("user auth failed : " + re);
			re.printStackTrace();
			throw re;
		}
		finally {
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
		return authOk;
	}
	
	public List<RelationBean> getRelations(){
		System.out.println("getting relations list");
		List<RelationBean> relationList = null;
		Session session = null;
		Transaction transaction = null;
		try{
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			
			Criteria criteria = session.createCriteria(Relation.class);
			List<Relation> relationsList = criteria.list();
			System.out.println("relations size : " + relationsList.size()); 
			if(relationsList.size()>0){
				relationList = new ArrayList<RelationBean>();
				for(Relation relation : relationsList){
					RelationBean bean = new RelationBean();
					bean.setRelationId(relation.getRelationId());
					bean.setRelationDescription(relation.getRelationDescription());
					relationList.add(bean);
					bean = null;
				}
			}
			transaction.commit();
		}
		catch(RuntimeException re){
			if(transaction!=null){
				transaction.rollback();
			}
			System.err.println("getting relations failed : " + re);
			re.printStackTrace();
			throw re;
		}
		finally {
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
		return relationList;
	}
	
	public List<IdBean> getIdsList(){
		System.out.println("getting ids list");
		List<IdBean> idsList = null;
		Session session = null;
		Transaction transaction = null;
		try{
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			
			Criteria criteria = session.createCriteria(MST_ID.class);
			List<MST_ID> idList = criteria.list();
			System.out.println("id list size : " + idList.size());
			if(idList.size()>0){
				idsList = new ArrayList<IdBean>();
				for(MST_ID id : idList){
					IdBean bean = new IdBean();
					bean.setId(id.getId());
					bean.setIdDescription(id.getDescription());
					idsList.add(bean);
					bean = null;
				}
			}
			transaction.commit();
		}
		catch(RuntimeException re){
			if(transaction!=null){
				transaction.rollback();
			}
			System.err.println("getting ids failed : " + re);
			re.printStackTrace();
			throw re;
		}
		finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
		return idsList;
	}
	
}
