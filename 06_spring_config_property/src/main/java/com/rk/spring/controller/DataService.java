package com.rk.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
	
	@Autowired
	public MultipleProperty multipleProperty;
	
	public MultipleProperty getProperties() {
		return multipleProperty;
	}
	
	public String getUrlName() {
		return multipleProperty.getUrl();
	}

}
