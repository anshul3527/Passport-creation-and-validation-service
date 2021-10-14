package com.triconinfotech.passportPortal.configuration;

import org.springframework.context.annotation.Bean;

import com.triconinfotech.passportPortal.service.RestClient;
import com.triconinfotech.passportPortal.service.impl.RestClientImpl;

public class AppContext {

	@Bean
	public RestClient getRestClient() {
		return new RestClientImpl();
	}
}
