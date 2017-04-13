package com.lovo.framestudy.aspectjs;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

import com.lovo.framestudy.beans.Client;
import com.lovo.framestudy.beans.OrderForm;

@Component
@Aspect
public class LogAspectj {
	/**
	 * 前置通知，初始化需要被AOP类管理的类或者方法
	 * @param jp 
	 */
	@Before(value="execution(* com.lovo.framestudy.service.impl.*.*(..))")
	public void before(JoinPoint jp){
		Object obj = jp.getTarget();
		Class cla = obj.getClass();
		
		System.out.println(obj);
		System.out.println(cla);
	}
	
	/**
	 * 后置返回通知，运行在目标方法返回之后
	 * 也就是目标方法return之后
	 * JoinPoint jp这个参数必须要写在所有参数之前
	 * @param jp
	 */
	@AfterReturning(returning="rvt", pointcut="execution(* com.lovo.framestudy.service.impl.*.*(..))")
	public void afterReturning(JoinPoint jp, Object rvt){
		Object obj = jp.getTarget();	//目标对象
		Class<?> cla = obj.getClass();	//目标对象的class对象
		
		if(cla.getCanonicalName().equals("com.lovo.framestudy.service.impl.ClientServiceImpl")){
			String method = jp.getSignature().getName();	//目标方法
			Object[] objParams = jp.getArgs(); 	//目标参数
			
			Client client = null;
			OrderForm orderForm = null;
			for (int i = 0; i < objParams.length; i++) {
//				if(objParams[i] instanceof Client){
//					client = (Client) objParams[i];	//如何用下标获取client对象？？
//				}else{
//					orderForm = (OrderForm) objParams[i];	//如何用下标获取client对象？？
//				}
				client = (Client) objParams[0];	//下标获取对象
				orderForm = (OrderForm) objParams[1];	//下标获取对象
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String time = sdf.format(new Date()); 
			
			if(method.equals("addOrderForm") && rvt.toString().equals("1")){
				System.out.println(client.getName()+"在"+time+"时间,"
						+client.getAddress()+"地点，新增订单"
						+orderForm.getOfname());
				
			}else if(method.equals("updateOrderForm") && rvt.toString().equals("1")){
				System.out.println(client.getName()+"在"+time+"时间,"
						+client.getAddress()+"地点，更新订单"
						+orderForm.getOfname());
				
			}else if(method.equals("delOrderForm") && rvt.toString().equals("1")){
				System.out.println(client.getName()+"在"+time+"时间,"
						+client.getAddress()+"地点，删除订单"
						+orderForm.getOfname());
			}
		}
		
	}
	
}
