/*
 * After adding this file, no web.xml or springmvc-servlet.xml is necessary.
 * If Eclipse complains about a missing web.xml, add this section to the pom.xml file:
    <properties>
    	<failOnMissingWebXml>false</failOnMissingWebXml>
    </properties>
 */
package com.techelevator;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
@ComponentScan
public class BasicWebMVCInit implements WebMvcConfigurer, WebApplicationInitializer{
	
	@Override
	public void onStartup(ServletContext servletContext) {			
		AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
		dispatcherContext.register(BasicWebMVCInit.class);
			
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
		dispatcher.addMapping("/");
	}
	
	//This method enables pass through of requests not handled by the dispatcher servlet (for static assets, for example).
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	
	
}
