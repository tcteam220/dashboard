package com.tcteam.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcteam.dashboard.service.IHellowWorldService;

@Controller
@RequestMapping("/views")
public class HelloWorldController {

	@Autowired
	private IHellowWorldService hellowWorldService;
	
	@ResponseBody
    @RequestMapping(value="/helloWorld",method = RequestMethod.GET)
	public  String say(){
		return hellowWorldService.say();
	}
	
}
