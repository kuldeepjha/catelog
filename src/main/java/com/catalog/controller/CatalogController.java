package com.catalog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.dto.CategoryDto;
import com.catalog.dto.ProductDto;
import com.catalog.dto.SuccessResponseDto;
import com.catalog.service.CategoryAttributesInterface;
import com.catalog.service.CategoryInterface;
import com.catalog.service.ProductInterface;

import io.swagger.annotations.Api;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@RestController
@Api(tags = { "Catalog API Resources" })
@RequestMapping("/Catalog")
public class CatalogController {

	private static final Logger logger = LoggerFactory.getLogger(CatalogController.class);

	@Autowired
	ProductInterface productService;

	@Autowired
	CategoryInterface categoryService;

	@Autowired
	CategoryAttributesInterface categoryAttributesService;

	/**
	 * 
	 * @param categoryDto
	 * @return
	 */
	@PostMapping(path = "/createCategory", produces = { MediaType.APPLICATION_JSON_VALUE })
	public SuccessResponseDto createCategory(@RequestBody CategoryDto categoryDto) {

		logger.info(" Create Category Controller");
		SuccessResponseDto successResponseDto = new SuccessResponseDto();
		try {
			CategoryDto category = categoryService.createCategory(categoryDto);
			successResponseDto.setCode(200);
			successResponseDto.setMessage("success!!");
			successResponseDto.setResponseBody(category);
			return successResponseDto;
		} catch (Exception ex) {
			logger.error("Error in Create Category Controller: {}", ex);
		}
		successResponseDto.setCode(200);
		successResponseDto.setMessage("please try after some time");
		return successResponseDto;
	}

	/**
	 * 
	 * @param productDto
	 * @return
	 */
	@PostMapping(path = "/createProduct", produces = { MediaType.APPLICATION_JSON_VALUE })
	public SuccessResponseDto createProduct(@RequestBody ProductDto productDto) {

		logger.info(" Create Category Controller");
		SuccessResponseDto successResponseDto = new SuccessResponseDto();
		try {
			ProductDto product = productService.createProduct(productDto);
			successResponseDto.setCode(200);
			successResponseDto.setMessage("success!!");
			successResponseDto.setResponseBody(product);
			return successResponseDto;
		} catch (Exception ex) {
			logger.error("Error in Create Category Controller: {}", ex);
		}
		successResponseDto.setCode(200);
		successResponseDto.setMessage("please try after some time");
		return successResponseDto;
	}
	
	/**
	 * 
	 * @param productDto
	 * @return
	 */
	@GetMapping(path = "/getProduct", produces = { MediaType.APPLICATION_JSON_VALUE })
	public SuccessResponseDto createProduct(@RequestParam int productId) {

		logger.info(" get product Controller");
		SuccessResponseDto successResponseDto = new SuccessResponseDto();
		try {
			ProductDto product = productService.getProduct(productId);
			successResponseDto.setCode(200);
			successResponseDto.setMessage("success!!");
			successResponseDto.setResponseBody(product);
			return successResponseDto;
		} catch (Exception ex) {
			logger.error("Error in Create Category Controller: {}", ex);
		}
		successResponseDto.setCode(200);
		successResponseDto.setMessage("please try after some time");
		return successResponseDto;
	}
	
}
