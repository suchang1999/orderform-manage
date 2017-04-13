package com.lovo.framestudy.dao.impl;

import org.springframework.stereotype.Service;

import com.lovo.framestudy.beans.Client;
import com.lovo.framestudy.beans.OrderForm;
import com.lovo.framestudy.dao.IClientDao;

@Service
public class ClientDaoImpl implements IClientDao {

	public int addOrderForm(Client client, OrderForm orderForm) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("客户："+client.getName()+"新增了一条订单："+orderForm.getOfname());
		return 1;
	}

	public int updateOrderForm(Client client, OrderForm orderForm) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("客户："+client.getName()+"更新了一条订单："+orderForm.getOfname());
		return 1;
	}

	public int delOrderForm(Client client, OrderForm orderForm) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("客户："+client.getName()+"删除了一条订单："+orderForm.getOfname());
		return 1;
	}

}
