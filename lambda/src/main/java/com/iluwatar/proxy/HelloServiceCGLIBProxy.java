package com.iluwatar.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class HelloServiceCGLIBProxy implements MethodInterceptor{
	
	private Object target;
	
	public Object getInstance(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("CGLIB代理方法将开始执行");
		Object result = proxy.invokeSuper(object, args);
		System.out.println("CGLIB代理方法将执行结束");
		return result;
	}
	
	public static void main(String[] args) {
		HelloServiceCGLIBProxy handler = new HelloServiceCGLIBProxy();
		HelloService proxy = (HelloService) handler.getInstance(new HelloServiceImpl());
		proxy.Hello("duanmenghua");
	}

	

}
