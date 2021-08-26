package com.catalog.dto;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
public class CategoryAttributesDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int id;

	String categoryAttributesName;

	String categoryAttributesType;

	int categoryAttributesSize;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryAttributesName() {
		return categoryAttributesName;
	}

	public void setCategoryAttributesName(String categoryAttributesName) {
		this.categoryAttributesName = categoryAttributesName;
	}

	public String getCategoryAttributesType() {
		return categoryAttributesType;
	}

	public void setCategoryAttributesType(String categoryAttributesType) {
		this.categoryAttributesType = categoryAttributesType;
	}

	public int getCategoryAttributesSize() {
		return categoryAttributesSize;
	}

	public void setCategoryAttributesSize(int categoryAttributesSize) {
		this.categoryAttributesSize = categoryAttributesSize;
	}

}
