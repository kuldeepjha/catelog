package com.catalog.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
public class CategoryDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	String categoryName;

	private List<CategoryAttributesDto> categoryAttributesDto;

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

	public List<CategoryAttributesDto> getCategoryAttributesDto() {
		return categoryAttributesDto;
	}

	public void setCategoryAttributesDto(List<CategoryAttributesDto> categoryAttributesDto) {
		this.categoryAttributesDto = categoryAttributesDto;
	}

}
