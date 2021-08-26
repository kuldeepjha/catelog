package com.catalog.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalog.dto.CategoryDto;
import com.catalog.dto.ProductDto;
import com.catalog.entity.CategoryEntity;
import com.catalog.entity.ProductEntity;
import com.catalog.repo.ProductEntityRepository;
import com.catalog.service.ProductInterface;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@Service
public class ProductService implements ProductInterface {

	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

	@Autowired
	ProductEntityRepository productEntityRepository;

	/**
	 * 
	 */
	@Override
	public ProductDto createProduct(ProductDto productDto) {

		logger.info("Create Product Service");

		ProductEntity productEntity = new ProductEntity();
		List<CategoryEntity> categoryEntity = new ArrayList<>();

		BeanUtils.copyProperties(productEntity, productDto);
		BeanUtils.copyProperties(categoryEntity, productDto.getCategoryDto());
		productEntity.setCategoryEntity(categoryEntity);

		productEntityRepository.save(productEntity);
		return productDto;
	}

	/**
	 * 
	 */
	@Override
	public ProductDto getProduct(int productId) {

		logger.info("Get Product Details Service");
		ProductDto productDto = new ProductDto();
		Optional<ProductEntity> productEntity = productEntityRepository.findById(productId);

		List<CategoryDto> categoryDto = new ArrayList<>();
		BeanUtils.copyProperties(productEntity.get(), productDto);
		BeanUtils.copyProperties(categoryDto, productEntity.get().getCategoryEntity());
		productDto.setCategoryDto(categoryDto);

		return productDto;
	}

}
