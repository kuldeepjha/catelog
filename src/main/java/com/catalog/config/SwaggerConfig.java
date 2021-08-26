
package com.catalog.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).paths(PathSelectors.any()).build()
				.pathMapping("/*").apiInfo(apiInfo()).useDefaultResponseMessages(false)
				.tags(new Tag("API Resources", null));

	}

	private ApiInfo apiInfo() {
		return new ApiInfo("open API Documentation", "REST API", "API TOS", null,
				new Contact("Catalog", null, null), " Connect API Version : 1", null, Collections.emptyList());
	}

	@Bean
	public UiConfiguration uiConfig() {
		return UiConfigurationBuilder.builder().operationsSorter(OperationsSorter.METHOD).build();
	}

}
