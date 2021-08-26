package com.catalog.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@Entity
@Table(name = "Product")
public class ProductEntity {

	@Id
	@Column(name = "Id", length = 11)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "ProductName")
	String productName;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(updatable = false, insertable = false, name = "ProductId")
	private List<CategoryEntity> categoryEntity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<CategoryEntity> getCategoryEntity() {
		return categoryEntity;
	}

	public void setCategoryEntity(List<CategoryEntity> categoryEntity) {
		this.categoryEntity = categoryEntity;
	}

}
