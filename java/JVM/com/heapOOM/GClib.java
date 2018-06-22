package com.heapOOM;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
// 方法区溢出
// 借助GCLib演示内存溢出
// enhancer包需要自己下载cglib-3.2.5.jar
public class GClib {

	public static void main(String[] args)
	{
		while(true)
		{
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(OOMObject.class);
			enhancer.setUseCache(false);
			// please be careful of structure 
			enhancer.setCallback
			(
					new MethodInterceptor() 
					{
						@Override
						public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
								throws Throwable {
							// TODO Auto-generated method stub
							return proxy.invokeSuper(obj, args);
						}
					}
			);
			enhancer.create();
		}
	}
	
	static class OOMObject
	{
		
	}

}
