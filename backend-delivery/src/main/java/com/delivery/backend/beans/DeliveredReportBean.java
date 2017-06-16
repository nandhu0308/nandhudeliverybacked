package com.delivery.backend.beans;

import java.util.Date;

/**
 * @author Ram K Bharathi
 * @created Jun 16, 2017
 */
public class DeliveredReportBean {
	private String awbNo;
	private String statusCode;
	private String deliveryEmpCode;
	private Date statusDate;
	private String statusTime;
	private String revdBy;
	private String phoneNo;
	
	public String getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getDeliveryEmpCode() {
		return deliveryEmpCode;
	}
	public void setDeliveryEmpCode(String deliveryEmpCode) {
		this.deliveryEmpCode = deliveryEmpCode;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public String getStatusTime() {
		return statusTime;
	}
	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}
	public String getRevdBy() {
		return revdBy;
	}
	public void setRevdBy(String revdBy) {
		this.revdBy = revdBy;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
