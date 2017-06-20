package com.delivery.backend.beans.requests;

import java.util.Date;

/**
 * @author Ram K Bharathi
 * @created Jun 13, 2017
 */
public class DeliveryStatusUpdateRequestBean {
	private boolean delivered;
	private String liveId;
	private String awbNo;
	private String orgSvc;
	private String dstSvc;
	private String statusCode;
	private String deliveryEmpCode;
	private Date statusDate;
	private String statusTime;
	private String revdBy;
	private String phoneNo;
	private int relationId;
	private int id;
	private String idNo;
	private String remarks;
	private String latitude;
	private String longitude;
	private String signatureImg;
	private String scanImg;
	private boolean edpFlag;
	private int importFlag;
	private String eempCode;
	
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
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
	public int getRelationId() {
		return relationId;
	}
	public void setRelationId(int relationId) {
		this.relationId = relationId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getSignatureImg() {
		return signatureImg;
	}
	public void setSignatureImg(String signatureImg) {
		this.signatureImg = signatureImg;
	}
	public String getScanImg() {
		return scanImg;
	}
	public void setScanImg(String scanImg) {
		this.scanImg = scanImg;
	}
	public String getLiveId() {
		return liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}
	public String getOrgSvc() {
		return orgSvc;
	}
	public void setOrgSvc(String orgSvc) {
		this.orgSvc = orgSvc;
	}
	public String getDstSvc() {
		return dstSvc;
	}
	public void setDstSvc(String dstSvc) {
		this.dstSvc = dstSvc;
	}
	public boolean isEdpFlag() {
		return edpFlag;
	}
	public void setEdpFlag(boolean edpFlag) {
		this.edpFlag = edpFlag;
	}
	public int getImportFlag() {
		return importFlag;
	}
	public void setImportFlag(int importFlag) {
		this.importFlag = importFlag;
	}
	public String getEempCode() {
		return eempCode;
	}
	public void setEempCode(String eempCode) {
		this.eempCode = eempCode;
	}
}
