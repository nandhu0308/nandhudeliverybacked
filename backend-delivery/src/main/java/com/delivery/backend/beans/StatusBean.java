package com.delivery.backend.beans;

/**
 * @author Ram K Bharathi
 * @created May 4, 2017
 */
public class StatusBean {
	private String statusCode;
	private String statusDesc;
	private boolean statusFlag;
	private String remarks;
	private boolean noInfoFlag;
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public boolean isStatusFlag() {
		return statusFlag;
	}
	public void setStatusFlag(boolean statusFlag) {
		this.statusFlag = statusFlag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public boolean isNoInfoFlag() {
		return noInfoFlag;
	}
	public void setNoInfoFlag(boolean noInfoFlag) {
		this.noInfoFlag = noInfoFlag;
	}
}
