package com.catalog.service;

import com.catalog.dto.ProductDto;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
public interface ProductInterface {

	public ProductDto createProduct(ProductDto productDto);
	
	public ProductDto getProduct(int productId);
}
