package com.spring.rest.webservice.restful_web_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServiceApplication.class, args);
	}

}

/*
 * OPENAPI provides API definition (SCHEMAS,RESOURCE LOCATION ...etc) and Swagger UI helps to visualize it and can also view the request and response format (Dependency needed to be added in pom.xml)
 * CONTENT NEGOTIATION : It is a negotiation b/w consumer and provider what kind of representation they want XML or JSON from the same resource(API), (Dependency needed to be added in pom.xml) Also in request specify the 'Accept' header
 * il8n-Internationalization - The response might be getting consumed by different people around the world in different language, the Accept-Language header specifies it defined in an API request.
 */

//Using plural nouns in REST resource URLs (for example, /users, /posts) is a common industry practice and improves readability and clarity.

//What is a web application ?
//W3C Definition- S/W System design to support interoperable machine to machine interaction over a N/W
/*
 * Auto Configuration: Automated configuration for your app
	Decided based on:
	Which frameworks are in the Class Path?
	What is the existing configuration (Annotations etc)?
	Example: Spring Boot Starter Web
	Dispatcher Servlet (DispatcherServletAutoConfiguration)
	Embedded Servlet Container - Tomcat is the default
	(EmbeddedWebServerFactoryCustomizerAutoConfiguration)
	Default Error Pages (ErrorMvcAutoConfiguration)
	Bean<->JSON
	(JacksonHttpMessageConvertersConfiguration)



*/









