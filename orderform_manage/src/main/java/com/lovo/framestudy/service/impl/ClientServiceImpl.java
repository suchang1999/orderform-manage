package com.lovo.framestudy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lovo.framestudy.beans.Client;
import com.lovo.framestudy.beans.OrderForm;
import com.lovo.framestudy.dao.IClientDao;
import com.lovo.framestudy.service.IClientService;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Resource
	private IClientDao clientDaoImpl;
	public int addOrderForm(Client client, OrderForm orderForm) throws Exception {
		// TODO Auto-generated method stub
		clientDaoImpl.addOrderForm(client, orderForm);
		return 1;
	}

	public int updateOrderForm(Client client, OrderForm orderForm) throws Exception {
		// TODO Auto-generated method stub
		clientDaoImpl.updateOrderForm(client, orderForm);
		return 1;
	}

	public int delOrderForm(Client client, OrderForm orderForm) throws Exception {
		// TODO Auto-generated method stub
		clientDaoImpl.delOrderForm(client, orderForm);
		return 1;
	}

}
