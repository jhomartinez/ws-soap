package com.codigoj.com.categoriaws;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.codigoj.webservice.ws.impl.CategoriaWSImpl;

@SpringBootApplication
//@ImportResource({ "classpath:META-INF/cxf/cxf.xml" })
public class CategoriawsApplication extends SpringBootServletInitializer {
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//return super.configure(builder);
		return builder.sources(CategoriawsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CategoriawsApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean serveletSoap() {
		ServletRegistrationBean servletSoap = new ServletRegistrationBean(new CXFServlet(), "/ws/*");
		servletSoap.setLoadOnStartup(1);
		return servletSoap;
	}
	
	@Bean( name = Bus.DEFAULT_BUS_ID )
	public SpringBus springBus() {
		return new SpringBus();
	}
	
	@Bean
	public Endpoint endpoint() {
		EndpointImpl cxfEndPoint = new EndpointImpl(springBus(), new CategoriaWSImpl());
		cxfEndPoint.publish("/soap");
		return cxfEndPoint;
	} 

}
