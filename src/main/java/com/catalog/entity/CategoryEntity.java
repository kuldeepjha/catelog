package com.catalog.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@Entity
@Table(name = "Category")
public class CategoryEntity {

	@Id
	@Column(name = "Id", length = 11)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "CategoryName")
	String categoryName;

	@ManyToOne
	@JoinColumn(name = "ProductId")
	private ProductEntity productEntity;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(updatable = false, insertable = false, name = "CategoryId")
	private List<CategoryAttributesEntity> categoryAttributesEntity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	public List<CategoryAttributesEntity> getCategoryAttributesEntity() {
		return categoryAttributesEntity;
	}

	public void setCategoryAttributesEntity(List<CategoryAttributesEntity> categoryAttributesEntity) {
		this.categoryAttributesEntity = categoryAttributesEntity;
	}

}
