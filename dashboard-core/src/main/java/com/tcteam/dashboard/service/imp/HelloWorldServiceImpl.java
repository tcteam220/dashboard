package com.tcteam.dashboard.service.imp;

import org.springframework.stereotype.Service;

import com.tcteam.dashboard.service.IHellowWorldService;

@Service("hellowWorldService")
public class HelloWorldServiceImpl implements IHellowWorldService{

	@Override
	public String say() {
		return "hello world! welcone to dashboard!";
	}

	
	
}
