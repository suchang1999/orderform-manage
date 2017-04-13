package com.lovo.framestudy.test;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lovo.framestudy.beans.Client;
import com.lovo.framestudy.beans.OrderForm;
import com.lovo.framestudy.service.IClientService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:springAnnotation.xml"})
public class TestOrderForm {
	@Resource
	private IClientService clientServiceImpl;
	
	private Client client;
	private OrderForm orderForm;
	private ApplicationContext ac;		//这里注意别导错了包！！
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("classpath*:springAnnotation.xml");
		client = (Client) ac.getBean("client");
		orderForm = (OrderForm) ac.getBean("orderForm");	//有没有其他方式获取到client和orderForm实例？
	}
	
	@Test
	public void test(){
		try {
			clientServiceImpl.addOrderForm(client, orderForm);	
			clientServiceImpl.updateOrderForm(client, orderForm);
			clientServiceImpl.delOrderForm(client, orderForm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
