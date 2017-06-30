package com.delivery.backend.beans;

import com.delivery.backend.daos.Shipment;

/**
 * @author Ram K Bharathi
 * @created Jun 13, 2017
 */
public class LiveStatusBean {
	private String liveId;
	private String awbNo;
	private String cityCode;
	private String svcCode;
	private String scanDtTime;
	private String statusCode;
	private String empCode;
	private String eempCode;
	private boolean edpFlag;
	private int importFlag;
	private String deliveryPrintNo;
	private int printOrder;
	private Shipment shipment;
	
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
	public String getScanDtTime() {
		return scanDtTime;
	}
	public void setScanDtTime(String scanDtTime) {
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
	public String getEempCode() {
		return eempCode;
	}
	public void setEempCode(String eempCode) {
		this.eempCode = eempCode;
	}
	public String getDeliveryPrintNo() {
		return deliveryPrintNo;
	}
	public void setDeliveryPrintNo(String deliveryPrintNo) {
		this.deliveryPrintNo = deliveryPrintNo;
	}
	public int getPrintOrder() {
		return printOrder;
	}
	public void setPrintOrder(int printOrder) {
		this.printOrder = printOrder;
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
	public Shipment getShipment() {
		return shipment;
	}
	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
}
