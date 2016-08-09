package com.csr.csrportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
	@PropertySource(value="classpath:test.properties", ignoreResourceNotFound=true),
	@PropertySource(value="classpath:message.properties", ignoreResourceNotFound=true),
	@PropertySource(value="file:C:\\Workspaces\\springboot\\src\\main\\java\\test1.properties", ignoreResourceNotFound=true)
})
public class CsrPortalApplication  extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CsrPortalApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(CsrPortalApplication.class, args);
	}
}
