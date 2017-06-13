package com.delivery.backend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.backend.beans.IdBean;
import com.delivery.backend.beans.RelationBean;
import com.delivery.backend.beans.requests.UserLoginRequestBean;
import com.delivery.backend.beans.responses.UserLoginResponseBean;
import com.delivery.backend.beans.responses.errors.UserLoginErrorResponseBean;
import com.delivery.backend.services.UserService;

/**
 * @author Ram K Bharathi
 * @created May 2, 2017
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value="/login", method=RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<?> userLogin(@RequestBody UserLoginRequestBean requestBean){
		UserService service = new UserService();
		System.out.println("req : " + requestBean.getUsername());
		UserLoginResponseBean responseBean = service.userLogin(requestBean);
		if(responseBean!=null){
			return new ResponseEntity<UserLoginResponseBean>(responseBean, HttpStatus.OK);
		}
		UserLoginErrorResponseBean errorResponseBean = new UserLoginErrorResponseBean();
		errorResponseBean.setMessage("Login Unsuccessful");
		return new ResponseEntity<UserLoginErrorResponseBean>(errorResponseBean, HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/get/relation/list", method=RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<?> getUserRelationList(){
		UserService service = new UserService();
		List<RelationBean> beanList = service.getRelations();
		if(beanList!=null && beanList.size()>0){
			return new ResponseEntity<List<RelationBean>>(beanList, HttpStatus.OK);
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/get/id/list", method=RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<?> getUserIdLIst(){
		UserService service = new UserService();
		List<IdBean> beanList = service.getIdsList();
		if(beanList!=null && beanList.size()>0){
			return new ResponseEntity<List<IdBean>>(beanList, HttpStatus.OK);
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
	}
	
}
