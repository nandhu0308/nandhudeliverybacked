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
@Table(name="delivery_print", catalog="noncomp")
public class DeliveryPrint {
	@Id
	@Column(name="DELIVERY_PRINT_NO")
	private String deliveryPrintNo;
	@Column(name="EMPLOYEE_CODE")
	private String employeeCode;
	@Column(name="DRS_DATE_TIME")
	private Date drsDateTime;
	@Column(name="DRS_CLOSE", nullable=false, columnDefinition="BIT")
	private boolean drsClose;
	@Column(name="START_KM")
	private float startKm;
	@Column(name="END_KM")
	private float endKm;
	@Column(name="NO_OF_SHIPMENTS")
	private Integer noOfShipments;
	@Column(name="EDP_FLAG", nullable=false, columnDefinition="BIT")
	private boolean edpFlag;
	@Column(name="DRS_PRINT", nullable=false, columnDefinition="BIT")
	private boolean drsPrint;
	@Column(name="IMPORT_FLAG", nullable=false, columnDefinition="BIT")
	private boolean importFlag;
	@Column(name="DST_SVC")
	private String dstSvc;
	
	public String getDeliveryPrintNo() {
		return deliveryPrintNo;
	}
	public void setDeliveryPrintNo(String deliveryPrintNo) {
		this.deliveryPrintNo = deliveryPrintNo;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public Date getDrsDateTime() {
		return drsDateTime;
	}
	public void setDrsDateTime(Date drsDateTime) {
		this.drsDateTime = drsDateTime;
	}
	public boolean isDrsClose() {
		return drsClose;
	}
	public void setDrsClose(boolean drsClose) {
		this.drsClose = drsClose;
	}
	public float getStartKm() {
		return startKm;
	}
	public void setStartKm(float startKm) {
		this.startKm = startKm;
	}
	public float getEndKm() {
		return endKm;
	}
	public void setEndKm(float endKm) {
		this.endKm = endKm;
	}
	public Integer getNoOfShipments() {
		return noOfShipments;
	}
	public void setNoOfShipments(Integer noOfShipments) {
		this.noOfShipments = noOfShipments;
	}
	public boolean isEdpFlag() {
		return edpFlag;
	}
	public void setEdpFlag(boolean edpFlag) {
		this.edpFlag = edpFlag;
	}
	public boolean isDrsPrint() {
		return drsPrint;
	}
	public void setDrsPrint(boolean drsPrint) {
		this.drsPrint = drsPrint;
	}
	public boolean isImportFlag() {
		return importFlag;
	}
	public void setImportFlag(boolean importFlag) {
		this.importFlag = importFlag;
	}
	public String getDstSvc() {
		return dstSvc;
	}
	public void setDstSvc(String dstSvc) {
		this.dstSvc = dstSvc;
	}
}
