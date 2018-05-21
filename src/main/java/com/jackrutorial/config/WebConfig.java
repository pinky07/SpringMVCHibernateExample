package com.jackrutorial.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.theme.ThemeChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.jackrutorial" })
public class WebConfig extends WebMvcConfigurerAdapter {
 
 @Override
 public void addResourceHandlers(ResourceHandlerRegistry registry) {
  registry.addResourceHandler("resources/**").addResourceLocations("/resources/");
 }
 
 @Bean
 public InternalResourceViewResolver viewResolver(){
  InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
  viewResolver.setViewClass(JstlView.class);
  viewResolver.setPrefix("/WEB-INF/jsp/");
  viewResolver.setSuffix(".jsp");
  
  return viewResolver;
 }
 
 @Bean
 public ResourceBundleMessageSource  messageSource() {
	 ResourceBundleMessageSource source = new ResourceBundleMessageSource();
	 source.setBasename("messages");
	 source.setDefaultEncoding("UTF-8");
	 source.setUseCodeAsDefaultMessage(true);
    return source;
 }

 

 
}