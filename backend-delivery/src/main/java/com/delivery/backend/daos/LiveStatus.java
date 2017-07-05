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
@Table(name="live_status", catalog="noncomp")
public class LiveStatus {
	@Id
	@Column(name="LIVE_ID")
	private String liveId;
	@Column(name="AWBNO")
	private String awbNo;
	@Column(name="CITY_CODE")
	private String cityCode;
	@Column(name="SVC_CODE")
	private String svcCode;
	@Column(name="SCAN_DT_TIME")
	private Date scanDtTime;
	@Column(name="STATUS_CODE")
	private String statusCode;
	@Column(name="EMP_CODE")
	private String empCode;
	@Column(name="PBAG_NO")
	private String pbagNo;
	@Column(name="EEMP_CODE")
	private String eempCode;
	@Column(name="EDP_FLAG", nullable=false, columnDefinition="BIT")
	private boolean edpFlag;
	@Column(name="IMPORT_FLAG")
	private Integer importFlag;
	@Column(name="DELIVERY_PRINT_NO")
	private String deliveryPrintNo;
	@Column(name="PRINT_ORDER")
	private Integer printOrder;
	
	public String getLiveId() {
		return liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}
	public String getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getSvcCode() {
		return svcCode;
	}
	public void setSvcCode(String svcCode) {
		this.svcCode = svcCode;
	}
	public Date getScanDtTime() {
		return scanDtTime;
	}
	public void setScanDtTime(Date scanDtTime) {
		this.scanDtTime = scanDtTime;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getPbagNo() {
		return pbagNo;
	}
	public void setPbagNo(String pbagNo) {
		this.pbagNo = pbagNo;
	}
	public String getEempCode() {
		return eempCode;
	}
	public void setEempCode(String eempCode) {
		this.eempCode = eempCode;
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
	public String getDeliveryPrintNo() {
		return deliveryPrintNo;
	}
	public void setDeliveryPrintNo(String deliveryPrintNo) {
		this.deliveryPrintNo = deliveryPrintNo;
	}
	public Integer getPrintOrder() {
		return printOrder;
	}
	public void setPrintOrder(Integer printOrder) {
		this.printOrder = printOrder;
	}
}
