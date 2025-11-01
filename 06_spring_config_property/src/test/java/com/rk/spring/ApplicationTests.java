package com.rk.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rk.spring.controller.DataService;
import com.rk.spring.controller.MultipleProperty;
import com.rk.spring.controller.ProfileController;

@SpringBootTest
class ApplicationTests {

	@Mock
	DataService dataService ;
	
	@InjectMocks
	private ProfileController profileController;
	
	
	
	@Test
	void test_getMultipleProperty_endpoint() {
		String serviceName = "test service name";
		
		MultipleProperty mockMultipleProperty = new MultipleProperty();
		mockMultipleProperty.setName(serviceName);
		when(dataService.getProperties()).thenReturn(mockMultipleProperty);
		MultipleProperty multipleProperty = profileController.getMultipleProperty();
		assertEquals(multipleProperty.getName(), serviceName);
		
	}
	
	@Test
	void test_getUrlName_endpoint() {
		
		String url = "test url";
		
		when(dataService.getUrlName()).thenReturn(url);
		
		String urlName = profileController.getUrlName();
		assertEquals(urlName, url);
	}

}
