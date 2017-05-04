package com.delivery.backend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.backend.beans.AWBNOListBean;
import com.delivery.backend.beans.StatusBean;
import com.delivery.backend.services.OpsService;

/**
 * @author Ram K Bharathi
 * @created May 4, 2017
 */
@RestController
@RequestMapping("/ops")
public class OpsController {
	@RequestMapping(value="/get/status/list", method=RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<?> getStatusList(){
		OpsService service = new OpsService();
		List<StatusBean> statusList = service.getStatusList();
		if(statusList.size()>0 && statusList!=null){
			return new ResponseEntity<List<StatusBean>>(statusList, HttpStatus.OK);
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/get/awbno/list/{empCode}", method=RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<?> getAwbNoList(@PathVariable("empCode") String empCode) throws Exception{
		OpsService service = new OpsService();
		AWBNOListBean bean = service.getAwbNoList(empCode);
		if(bean!=null){
			return new ResponseEntity<AWBNOListBean>(bean, HttpStatus.OK);
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
	}
	
}
