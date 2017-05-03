package com.delivery.backend.daos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ram K Bharathi
 * @created May 3, 2017
 */
@Entity
@Table(name="dbo.MST_ID", catalog="NONCOMP")
public class MST_ID {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	@Column(name="ID_DESCRIPTION")
	private String description;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
