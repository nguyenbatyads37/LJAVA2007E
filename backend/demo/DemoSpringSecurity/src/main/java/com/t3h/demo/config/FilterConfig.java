package com.t3h.demo.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.t3h.demo.filters.DemoFilter;

@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean<Filter> loggingFilter() {
		FilterRegistrationBean<Filter> result =
				new FilterRegistrationBean<Filter>();
		result.setFilter(new DemoFilter());
		result.addUrlPatterns("/demoFilter/*");
		return result;
	}
}
