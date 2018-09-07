package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Message;

@RestController
public class HelloController {

	@RequestMapping(value="/")
	public String sayHello() {
		
		return "Hello from spring back controller";
		
	}
	
	@RequestMapping(value="/Message")
	public Message sendMessage() {
		
		Message msg=new Message();
		msg.setText("hello from back controller method message");
		return msg;
		
	}
}
