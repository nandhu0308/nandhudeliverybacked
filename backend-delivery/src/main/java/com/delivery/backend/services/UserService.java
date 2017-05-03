package com.delivery.backend.services;

import java.util.Base64;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.delivery.backend.beans.requests.UserLoginRequestBean;
import com.delivery.backend.beans.responses.UserLoginResponseBean;
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
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			
			Users user = (Users) session
					.get("com.delivery.backend.daos.Users", requestBean.getUsername());
			if(user!=null){
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
}
