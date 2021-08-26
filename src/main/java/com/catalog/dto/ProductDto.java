package com.catalog.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
public class ProductDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	String productName;

	private List<CategoryDto> categoryDto;

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

	public List<CategoryDto> getCategoryDto() {
		return categoryDto;
	}

	public void setCategoryDto(List<CategoryDto> categoryDto) {
		this.categoryDto = categoryDto;
	}

}
