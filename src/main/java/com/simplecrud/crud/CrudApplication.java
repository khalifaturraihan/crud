package com.simplecrud.crud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//import java.util.ArrayList;
//import java.util.Collections;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

//	@Bean
//	public Docket swaggerConfiguration(){
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.paths(PathSelectors.ant("/contact/*"))
//				.apis(RequestHandlerSelectors.basePackage("com.simplecrud.crud"))
//				.build()
//				.apiInfo(apiCustomData());
//	}

//	private ApiInfo apiCustomData(){
//		return new ApiInfo(
//				"Contact API Application",
//				"Contact Documentation",
//				"1.0",
//				"Contact Service Terms",
//				new Contact("Esha Puri", "http://simplecrud.com",
//						"contact@simplecrud.com"),
//				"Think Constructive License",
//				"http://simplecrud.com",
//				Collections.emptyList()
//		);
//	}
}