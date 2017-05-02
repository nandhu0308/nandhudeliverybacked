package com.delivery.backend.beans.responses;

/**
 * @author Ram K Bharathi
 * @created May 2, 2017
 */
public class UserLoginResponseBean {
	private String username;
	private boolean inBound;
	private boolean outBound;
	private boolean report;
	private boolean fileOperation;
	private boolean setting;
	private boolean cod;
	private String employeeCode;
	private boolean statusFlag;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
