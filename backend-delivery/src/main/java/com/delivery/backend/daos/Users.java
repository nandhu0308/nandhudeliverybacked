package com.delivery.backend.daos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ram K Bharathi
 * @created May 2, 2017
 */
@Entity
@Table(name="users", catalog="noncomp")
public class Users {
	@Id
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="INBOUND", nullable=false, columnDefinition="BIT")
	private boolean inBound;
	@Column(name="OUTBOUND", nullable=false, columnDefinition="BIT")
	private boolean outBound;
	@Column(name="REPORT", nullable=false, columnDefinition="BIT")
	private boolean report;
	@Column(name="FILE_OPERATION", nullable=false, columnDefinition="BIT")
	private boolean fileOperation;
	@Column(name="SETTING", nullable=false, columnDefinition="BIT")
	private boolean setting;
	@Column(name="COD", nullable=false, columnDefinition="BIT")
	private boolean cod;
	@Column(name="EMPLOYEE_CODE")
	private String employeeCode;
	@Column(name="STATUS_FLAG", nullable=false, columnDefinition="BIT")
	private boolean statusFlag;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isInBound() {
		return inBound;
	}
	public void setInBound(boolean inBound) {
		this.inBound = inBound;
	}
	public boolean isOutBound() {
		return outBound;
	}
	public void setOutBound(boolean outBound) {
		this.outBound = outBound;
	}
	public boolean isReport() {
		return report;
	}
	public void setReport(boolean report) {
		this.report = report;
	}
	public boolean isFileOperation() {
		return fileOperation;
	}
	public void setFileOperation(boolean fileOperation) {
		this.fileOperation = fileOperation;
	}
	public boolean isSetting() {
		return setting;
	}
	public void setSetting(boolean setting) {
		this.setting = setting;
	}
	public boolean isCod() {
		return cod;
	}
	public void setCod(boolean cod) {
		this.cod = cod;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public boolean isStatusFlag() {
		return statusFlag;
	}
	public void setStatusFlag(boolean statusFlag) {
		this.statusFlag = statusFlag;
	}
}
