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
@Table(name="mst_status", catalog="noncomp")
public class MstStatus {
	@Id
	@Column(name="STATUS_CODE")
	private String statusCode;
	@Column(name="STATUS_DESC")
	private String statusDesc;
	@Column(name="STATUS_FLAG", nullable=false, columnDefinition="BIT")
	private boolean statusFlag;
	@Column(name="REMARKS")
	private String remarks;
	@Column(name="NOINFO_FLAG", nullable=false, columnDefinition="BIT")
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
