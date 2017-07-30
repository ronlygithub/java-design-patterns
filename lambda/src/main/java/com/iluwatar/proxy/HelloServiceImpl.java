package com.iluwatar.proxy;

public class HelloServiceImpl implements HelloService{

	@Override
	public void Hello(String name) {
		System.out.println("Hello "+name);		
	}

}
