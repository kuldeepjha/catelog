package com.catalog.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalog.dto.CategoryAttributesDto;
import com.catalog.entity.CategoryAttributesEntity;
import com.catalog.repo.CategoryAttributesRepository;
import com.catalog.service.CategoryAttributesInterface;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@Service
public class CategoryAttributesService implements CategoryAttributesInterface {

	private static final Logger logger = LoggerFactory.getLogger(CategoryAttributesService.class);

	@Autowired
	CategoryAttributesRepository categoryAttributesRepository;

	@Override
	public CategoryAttributesDto createCategoryAttributes(CategoryAttributesDto categoryAttributesDto) {

		logger.info("Create Category Attributes service");
		CategoryAttributesEntity categoryAttributes = new CategoryAttributesEntity();
		BeanUtils.copyProperties(categoryAttributes, categoryAttributesDto);
		categoryAttributesRepository.save(categoryAttributes);
		return categoryAttributesDto;
	}

}
