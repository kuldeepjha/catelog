package com.catalog.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalog.dto.CategoryDto;
import com.catalog.entity.CategoryAttributesEntity;
import com.catalog.entity.CategoryEntity;
import com.catalog.repo.CategoryRepository;
import com.catalog.service.CategoryInterface;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@Service
public class CategoryService implements CategoryInterface {

	private static final Logger logger = LoggerFactory.getLogger(CategoryService.class);
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {

		logger.info("Create Category Service");
		CategoryEntity categoryEntity = new CategoryEntity();
		List<CategoryAttributesEntity> CategoryAttributesEntity = new ArrayList<>();
		
		BeanUtils.copyProperties(categoryEntity, categoryDto);
		BeanUtils.copyProperties(CategoryAttributesEntity, categoryDto.getCategoryAttributesDto());
		categoryEntity.setCategoryAttributesEntity(CategoryAttributesEntity);
		
		categoryRepository.save(categoryEntity);
		return categoryDto;
	}

}
