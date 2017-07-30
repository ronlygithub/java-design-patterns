package com.iluwatar.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceJDKProxy implements InvocationHandler{
	
	private Object target;
	
	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理方法将开始执行");
		Object result = method.invoke(target, args);
		System.out.println("代理方法将执行结束");
		
		return result;
	}
	
	public static void main(String[] args) {
		HelloServiceJDKProxy handler = new HelloServiceJDKProxy();
		HelloService proxy = (HelloService) handler.bind(new HelloServiceImpl());
		proxy.Hello("duanmenghua");
	}

}
