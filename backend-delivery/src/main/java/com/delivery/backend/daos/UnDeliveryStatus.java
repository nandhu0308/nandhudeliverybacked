package com.delivery.backend.daos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ram K Bharathi
 * @created May 3, 2017
 */
@Entity
@Table(name="dbo.UN_DELIVERY_STATUS", catalog="NONCOMP")
public class UnDeliveryStatus {
	@Column(name="LIVE_ID")
	private String LIVE_ID;
	@Id
	@Column(name="AWBNO")
	private String awbNo;
	@Column(name="ORG_SVC")
	private String orgSvc;
	@Column(name="DST_SVC")
	private String dstSvc;
	@Column(name="STATUS_CODE")
	private String statusCode;
	@Column(name="DENTRY_DATE")
	private String dentryDate;
	@Column(name="DELIVERY_EMPCODE")
	private String deliveryEmpCode;
	@Column(name="STATUS_DATE")
	private Date statusDate;
	@Column(name="STATUS_TIME")
	private String statusTime;
	@Column(name="REVD_BY")
	private String revdBy;
	@Column(name="PHONE_NO")
	private String phoneNo;
	@Column(name="RELATION")
	private String relation;
	@Column(name="REMARKS")
	private String remarks;
	@Column(name="DENTRY_EMPCODE")
	private String dentryEmpCode;
	@Column(name="STATUS_CLOSE", nullable=false, columnDefinition="BIT")
	private boolean statusClose;
	@Column(name="EDP_FLAG", nullable=false, columnDefinition="BIT")
	private boolean edpFlag;
	@Column(name="IMPORT_FLAG")
	private Integer importFlag;
	@Column(name="ONLINE_FLAG")
	private Integer onlineFlag;
	
	public String getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
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
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getDentryDate() {
		return dentryDate;
	}
	public void setDentryDate(String dentryDate) {
		this.dentryDate = dentryDate;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDentryEmpCode() {
		return dentryEmpCode;
	}
	public void setDentryEmpCode(String dentryEmpCode) {
		this.dentryEmpCode = dentryEmpCode;
	}
	public boolean isStatusClose() {
		return statusClose;
	}
	public void setStatusClose(boolean statusClose) {
		this.statusClose = statusClose;
	}
	public boolean isEdpFlag() {
		return edpFlag;
	}
	public void setEdpFlag(boolean edpFlag) {
		this.edpFlag = edpFlag;
	}
	public Integer getImportFlag() {
		return importFlag;
	}
	public void setImportFlag(Integer importFlag) {
		this.importFlag = importFlag;
	}
	public Integer getOnlineFlag() {
		return onlineFlag;
	}
	public void setOnlineFlag(Integer onlineFlag) {
		this.onlineFlag = onlineFlag;
	}
	public String getLIVE_ID() {
		return LIVE_ID;
	}
	public void setLIVE_ID(String lIVE_ID) {
		LIVE_ID = lIVE_ID;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
}
