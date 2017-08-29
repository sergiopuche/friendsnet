/*
 * Created at 24-ago-2017 by Fran Periago
 */
package com.everis.alicante.courses.beca.summer17.controller.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * The Class WebMvcConfigurerAdapterCustom.
 */
@EnableWebMvc
@Configuration
public class WebMvcConfigurerAdapterCustom extends WebMvcConfigurerAdapter {

	/**
	 * The type Custom Web mvc configurer adapter.
	 *
	 * @param registry the registry
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/swagger/v2/api-docs", "/v2/api-docs").setKeepQueryParams(true);
		registry.addRedirectViewController("/swagger/swagger-resources", "/swagger-resources");
		registry.addRedirectViewController("/swagger/swagger-resources/configuration/ui",
				"/swagger-resources/configuration/ui");
		registry.addRedirectViewController("/swagger/swagger-resources/configuration/security",
				"/swagger-resources/configuration/security");
		registry.addRedirectViewController("/swagger", "/swagger/swagger-ui.html");
		registry.addRedirectViewController("/swagger/", "/swagger/swagger-ui.html");
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry)
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/swagger/**").addResourceLocations("classpath:/META-INF/resources/");
	}
}