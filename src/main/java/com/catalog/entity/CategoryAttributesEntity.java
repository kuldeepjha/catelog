package com.catalog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@Entity
@Table(name = "CategoryAttributes")
public class CategoryAttributesEntity {

	@Id
	@Column(name = "Id", length = 11)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "CategoryAttributesName")
	String categoryAttributesName;

	@Column(name = "CategoryAttributesType")
	String categoryAttributesType;

	@Column(name = "CategoryAttributesSize")
	int categoryAttributesSize;

	@ManyToOne
	@JoinColumn(name = "CategoryId")
	private CategoryEntity categoryEntity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public CategoryEntity getCategoryEntity() {
		return categoryEntity;
	}

	public void setCategoryEntity(CategoryEntity categoryEntity) {
		this.categoryEntity = categoryEntity;
	}

}
