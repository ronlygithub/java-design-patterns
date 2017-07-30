package com.iluwatar.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射
 * @author duanmenghua
 *
 */
public class ReflectService {
	public void Hello(String name) {
		System.out.println("hello word "+ name);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Object service = Class.forName(ReflectService.class.getName()).newInstance();
		Method method = service.getClass().getMethod("Hello", String.class);
		method.invoke(service, "duanmenghua");
	}
	
}
