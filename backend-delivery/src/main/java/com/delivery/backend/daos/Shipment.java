package com.delivery.backend.daos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ram K Bharathi
 * @created Jun 30, 2017
 */
@Entity
@Table(name="dbo.SHIPMENT", catalog="NONCOMP")
public class Shipment {
	@Id
	@Column(name="AWBNO")
	private String awbNo;
	@Column(name="PROD_CODE")
	private String prodCode;
	@Column(name="ORG_AREA")
	private String orgArea;
	@Column(name="ORG_SVC")
	private String orgSvc;
	@Column(name="DST_AREA")
	private String dstArea;
	@Column(name="PBAG_NO")
	private String pbagNo;
	@Column(name="CARGO_MODE")
	private String cargoMode;
	@Column(name="CUST_CODE")
	private String custCode;
	@Column(name="CUST_ADD1")
	private String custAdd1;
	@Column(name="CUST_ADD2")
	private String custAdd2;
	@Column(name="CUST_ADD3")
	private String custAdd3;
	@Column(name="CUST_PIN")
	private String custPin;
	@Column(name="CUST_TEL")
	private String custTel;
	@Column(name="CONEE_NAME")
	private String coneeName;
	@Column(name="CONEE_CONTACT")
	private String coneeContact;
	@Column(name="CCNEECODE")
	private String ccneeCode;
	@Column(name="CCNEE_ADD1")
	private String ccneeAdd1;
	@Column(name="CCNEE_ADD2")
	private String ccneeAdd2;
	@Column(name="PIN_CODE")
	private String pinCode;
	@Column(name="TEL")
	private String tel;
	@Column(name="PCS")
	private Integer pcs;
	@Column(name="ACT_WGT")
	private float actWgt;
	@Column(name="VOL_WGT")
	private float volWgt;
	@Column(name="DECLARE_VALUE")
	private float declareValue;
	@Column(name="TYPE_OF_PCKGS")
	private String typeOfPackages;
	@Column(name="PO_NO")
	private String poNo;
	@Column(name="TIN_NO")
	private String tinNo;
	@Column(name="HANDLING_CHARGES")
	private float handlingCharges;
	@Column(name="DIMPLOMAT_CHARGES")
	private float dimplomatCharges;
	@Column(name="OTHER_CHARGES")
	private float otherCharges;
	@Column(name="CMDTY_CODE")
	private String cmdtyCode;
	@Column(name="PICKUP_DATE")
	private Date pickUpDate;
	@Column(name="PICKUP_TIME")
	private String pickUpTime;
	@Column(name="PICKUP_EMPCODE")
	private String pickUpEmpCode;
	@Column(name="REMARKS")
	private String remarks;
	@Column(name="NETWORK_AREA_CODE")
	private String networkAreaCode;
	@Column(name="DENTRY", nullable=false, columnDefinition="BIT")
	private boolean dentry;
	@Column(name="INCLUDE_BAG", nullable=false, columnDefinition="BIT")
	private boolean includeBag;
	@Column(name="PBAG_CLOSE", nullable=false, columnDefinition="BIT")
	private boolean pbagClose;
	@Column(name="ORG_INSCAN", nullable=false, columnDefinition="BIT")
	private boolean orgInScan;
	@Column(name="ORG_OUTSCAN", nullable=false, columnDefinition="BIT")
	private boolean orgOutScan;
	@Column(name="DST_INSCAN", nullable=false, columnDefinition="BIT")
	private boolean dstInScan;
	@Column(name="DST_OUTSCAN", nullable=false, columnDefinition="BIT")
	private boolean dstOutScan;
	@Column(name="OVERAGE", nullable=false, columnDefinition="BIT")
	private boolean overage;
	@Column(name="DELIVERY_PRINT", nullable=false, columnDefinition="BIT")
	private boolean deliveryPrint;
	@Column(name="NETWORK", nullable=false, columnDefinition="BIT")
	private boolean network;
	@Column(name="EDP_FLAG", nullable=false, columnDefinition="BIT")
	private boolean edpFlag;
	@Column(name="BULK_ENTRY", nullable=false, columnDefinition="BIT")
	private boolean bulkEntry;
	@Column(name="REFERENCE_NO")
	private String referenceNo;
	@Column(name="IMPORT_FLAG")
	private Integer importFlag;
	@Column(name="CASH_AMOUNT")
	private float cashAmount;
	@Column(name="COD_AMOUNT")
	private float codAmount;
	@Column(name="REV_PICKUP_SVC")
	private String revPickUpSvc;
	@Column(name="REV_PICKUP_ADD")
	private String revPickUpAdd;
	@Column(name="PRINT_ORDER")
	private float printOrder;
	@Column(name="DELIVERY_PRINT_NO")
	private String deliveryPrintNo;
	@Column(name="COMMODITY")
	private String commodity;
	
	public String getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getOrgArea() {
		return orgArea;
	}
	public void setOrgArea(String orgArea) {
		this.orgArea = orgArea;
	}
	public String getOrgSvc() {
		return orgSvc;
	}
	public void setOrgSvc(String orgSvc) {
		this.orgSvc = orgSvc;
	}
	public String getDstArea() {
		return dstArea;
	}
	public void setDstArea(String dstArea) {
		this.dstArea = dstArea;
	}
	public String getPbagNo() {
		return pbagNo;
	}
	public void setPbagNo(String pbagNo) {
		this.pbagNo = pbagNo;
	}
	public String getCargoMode() {
		return cargoMode;
	}
	public void setCargoMode(String cargoMode) {
		this.cargoMode = cargoMode;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public String getCustAdd1() {
		return custAdd1;
	}
	public void setCustAdd1(String custAdd1) {
		this.custAdd1 = custAdd1;
	}
	public String getCustAdd2() {
		return custAdd2;
	}
	public void setCustAdd2(String custAdd2) {
		this.custAdd2 = custAdd2;
	}
	public String getCustAdd3() {
		return custAdd3;
	}
	public void setCustAdd3(String custAdd3) {
		this.custAdd3 = custAdd3;
	}
	public String getCustPin() {
		return custPin;
	}
	public void setCustPin(String custPin) {
		this.custPin = custPin;
	}
	public String getCustTel() {
		return custTel;
	}
	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
	public String getConeeName() {
		return coneeName;
	}
	public void setConeeName(String coneeName) {
		this.coneeName = coneeName;
	}
	public String getConeeContact() {
		return coneeContact;
	}
	public void setConeeContact(String coneeContact) {
		this.coneeContact = coneeContact;
	}
	public String getCcneeCode() {
		return ccneeCode;
	}
	public void setCcneeCode(String ccneeCode) {
		this.ccneeCode = ccneeCode;
	}
	public String getCcneeAdd1() {
		return ccneeAdd1;
	}
	public void setCcneeAdd1(String ccneeAdd1) {
		this.ccneeAdd1 = ccneeAdd1;
	}
	public String getCcneeAdd2() {
		return ccneeAdd2;
	}
	public void setCcneeAdd2(String ccneeAdd2) {
		this.ccneeAdd2 = ccneeAdd2;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getPcs() {
		return pcs;
	}
	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}
	public float getActWgt() {
		return actWgt;
	}
	public void setActWgt(float actWgt) {
		this.actWgt = actWgt;
	}
	public float getVolWgt() {
		return volWgt;
	}
	public void setVolWgt(float volWgt) {
		this.volWgt = volWgt;
	}
	public float getDeclareValue() {
		return declareValue;
	}
	public void setDeclareValue(float declareValue) {
		this.declareValue = declareValue;
	}
	public String getTypeOfPackages() {
		return typeOfPackages;
	}
	public void setTypeOfPackages(String typeOfPackages) {
		this.typeOfPackages = typeOfPackages;
	}
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public String getTinNo() {
		return tinNo;
	}
	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}
	public float getHandlingCharges() {
		return handlingCharges;
	}
	public void setHandlingCharges(float handlingCharges) {
		this.handlingCharges = handlingCharges;
	}
	public float getDimplomatCharges() {
		return dimplomatCharges;
	}
	public void setDimplomatCharges(float dimplomatCharges) {
		this.dimplomatCharges = dimplomatCharges;
	}
	public float getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(float otherCharges) {
		this.otherCharges = otherCharges;
	}
	public String getCmdtyCode() {
		return cmdtyCode;
	}
	public void setCmdtyCode(String cmdtyCode) {
		this.cmdtyCode = cmdtyCode;
	}
	public Date getPickUpDate() {
		return pickUpDate;
	}
	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}
	public String getPickUpTime() {
		return pickUpTime;
	}
	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}
	public String getPickUpEmpCode() {
		return pickUpEmpCode;
	}
	public void setPickUpEmpCode(String pickUpEmpCode) {
		this.pickUpEmpCode = pickUpEmpCode;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getNetworkAreaCode() {
		return networkAreaCode;
	}
	public void setNetworkAreaCode(String networkAreaCode) {
		this.networkAreaCode = networkAreaCode;
	}
	public boolean isDentry() {
		return dentry;
	}
	public void setDentry(boolean dentry) {
		this.dentry = dentry;
	}
	public boolean isIncludeBag() {
		return includeBag;
	}
	public void setIncludeBag(boolean includeBag) {
		this.includeBag = includeBag;
	}
	public boolean isPbagClose() {
		return pbagClose;
	}
	public void setPbagClose(boolean pbagClose) {
		this.pbagClose = pbagClose;
	}
	public boolean isOrgInScan() {
		return orgInScan;
	}
	public void setOrgInScan(boolean orgInScan) {
		this.orgInScan = orgInScan;
	}
	public boolean isOrgOutScan() {
		return orgOutScan;
	}
	public void setOrgOutScan(boolean orgOutScan) {
		this.orgOutScan = orgOutScan;
	}
	public boolean isDstInScan() {
		return dstInScan;
	}
	public void setDstInScan(boolean dstInScan) {
		this.dstInScan = dstInScan;
	}
	public boolean isDstOutScan() {
		return dstOutScan;
	}
	public void setDstOutScan(boolean dstOutScan) {
		this.dstOutScan = dstOutScan;
	}
	public boolean isOverage() {
		return overage;
	}
	public void setOverage(boolean overage) {
		this.overage = overage;
	}
	public boolean isDeliveryPrint() {
		return deliveryPrint;
	}
	public void setDeliveryPrint(boolean deliveryPrint) {
		this.deliveryPrint = deliveryPrint;
	}
	public boolean isNetwork() {
		return network;
	}
	public void setNetwork(boolean network) {
		this.network = network;
	}
	public boolean isEdpFlag() {
		return edpFlag;
	}
	public void setEdpFlag(boolean edpFlag) {
		this.edpFlag = edpFlag;
	}
	public boolean isBulkEntry() {
		return bulkEntry;
	}
	public void setBulkEntry(boolean bulkEntry) {
		this.bulkEntry = bulkEntry;
	}
	public String getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
	public Integer getImportFlag() {
		return importFlag;
	}
	public void setImportFlag(Integer importFlag) {
		this.importFlag = importFlag;
	}
	public float getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(float cashAmount) {
		this.cashAmount = cashAmount;
	}
	public float getCodAmount() {
		return codAmount;
	}
	public void setCodAmount(float codAmount) {
		this.codAmount = codAmount;
	}
	public String getRevPickUpSvc() {
		return revPickUpSvc;
	}
	public void setRevPickUpSvc(String revPickUpSvc) {
		this.revPickUpSvc = revPickUpSvc;
	}
	public String getRevPickUpAdd() {
		return revPickUpAdd;
	}
	public void setRevPickUpAdd(String revPickUpAdd) {
		this.revPickUpAdd = revPickUpAdd;
	}
	public float getPrintOrder() {
		return printOrder;
	}
	public void setPrintOrder(float printOrder) {
		this.printOrder = printOrder;
	}
	public String getDeliveryPrintNo() {
		return deliveryPrintNo;
	}
	public void setDeliveryPrintNo(String deliveryPrintNo) {
		this.deliveryPrintNo = deliveryPrintNo;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
}
