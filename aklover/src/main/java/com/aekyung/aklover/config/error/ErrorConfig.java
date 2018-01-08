package com.aekyung.aklover.config.error;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorConfig extends ServerProperties{

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		super.customize(container);
		container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/errors"));
		container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/errors"));
		container.addErrorPages(new ErrorPage("/errors"));
	}

	
}
