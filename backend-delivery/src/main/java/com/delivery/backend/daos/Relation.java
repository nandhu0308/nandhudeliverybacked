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
@Table(name="dbo.MST_RELATION", catalog="NONCOMP")
public class Relation {
	@Id
	@GeneratedValue
	@Column(name="RELATION_ID")
	private Integer relationId;
	@Column(name="RELATION_DESCRIPTION")
	private String relationDescription;
	public Integer getRelationId() {
		return relationId;
	}
	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}
	public String getRelationDescription() {
		return relationDescription;
	}
	public void setRelationDescription(String relationDescription) {
		this.relationDescription = relationDescription;
	}
}
