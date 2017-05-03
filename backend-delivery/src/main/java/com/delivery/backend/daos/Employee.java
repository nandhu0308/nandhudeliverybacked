package com.delivery.backend.daos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ram K Bharathi
 * @created May 3, 2017
 */
@Entity
@Table(name="dbo.MST_EMPLOYEE", catalog="NONCOMP")
public class Employee {
	@Id
	@Column(name="EMPLOYEE_CODE")
	private String employeeCode;
	@Column(name="EMPLOYEE_NAME")
	private String employeeName;
	@Column(name="DESIGNATION_CODE")
	private Integer designationCode;
	@Column(name="CITY_CODE")
	private String cityCode;
	@Column(name="SVC_CODE")
	private String svcCode;
	@Column(name="MAILID")
	private String mailId;
	@Column(name="BIRTH_DT")
	private String birthDate;
	@Column(name="DTOFJOIN")
	private String dateOfJoin;
	@Column(name="QUALIFICATION")
	private String qualification;
	@Column(name="PHONENO")
	private String phoneNo;
	@Column(name="EMP_OUTDATE")
	private String empOutdate;
	@Column(name="DL_TYPE")
	private String dlType;
	@Column(name="DL_NO")
	private String dlNo;
	@Column(name="VEHICLE_NO")
	private String vechileNo;
	@Column(name="REF_BY_NAME")
	private String refByName;
	@Column(name="REF_BY_PHONE")
	private String refByPHone;
	@Column(name="COMM_ADDRESS")
	private String commAddress;
	@Column(name="PER_ADDRESS")
	private String permanentAddress;
	@Column(name="EMP_TYPE")
	private Integer empType;
	@Column(name="VENDOR_EMP_CODE")
	private String vendorEmpCode;
	@Column(name="FILE_TYPE")
	private String fileType;
	@Column(name="D_FILE_TYPE")
	private String dFileType;
	@Column(name="REPORTS")
	private String reports;
	@Column(name="STATUS_FLAG", nullable=false, columnDefinition="BIT")
	private boolean statusFlag;
	
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getDesignationCode() {
		return designationCode;
	}
	public void setDesignationCode(Integer designationCode) {
		this.designationCode = designationCode;
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
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmpOutdate() {
		return empOutdate;
	}
	public void setEmpOutdate(String empOutdate) {
		this.empOutdate = empOutdate;
	}
	public String getDlType() {
		return dlType;
	}
	public void setDlType(String dlType) {
		this.dlType = dlType;
	}
	public String getDlNo() {
		return dlNo;
	}
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	public String getVechileNo() {
		return vechileNo;
	}
	public void setVechileNo(String vechileNo) {
		this.vechileNo = vechileNo;
	}
	public String getRefByName() {
		return refByName;
	}
	public void setRefByName(String refByName) {
		this.refByName = refByName;
	}
	public String getRefByPHone() {
		return refByPHone;
	}
	public void setRefByPHone(String refByPHone) {
		this.refByPHone = refByPHone;
	}
	public String getCommAddress() {
		return commAddress;
	}
	public void setCommAddress(String commAddress) {
		this.commAddress = commAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public Integer getEmpType() {
		return empType;
	}
	public void setEmpType(Integer empType) {
		this.empType = empType;
	}
	public String getVendorEmpCode() {
		return vendorEmpCode;
	}
	public void setVendorEmpCode(String vendorEmpCode) {
		this.vendorEmpCode = vendorEmpCode;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getdFileType() {
		return dFileType;
	}
	public void setdFileType(String dFileType) {
		this.dFileType = dFileType;
	}
	public String getReports() {
		return reports;
	}
	public void setReports(String reports) {
		this.reports = reports;
	}
	public boolean isStatusFlag() {
		return statusFlag;
	}
	public void setStatusFlag(boolean statusFlag) {
		this.statusFlag = statusFlag;
	}
}
