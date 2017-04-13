package com.lovo.framestudy.service;

import com.lovo.framestudy.beans.Client;
import com.lovo.framestudy.beans.OrderForm;

public interface IClientService {
	public int addOrderForm(Client client,OrderForm orderForm) throws Exception;
	public int updateOrderForm(Client client,OrderForm orderForm) throws Exception;
	public int delOrderForm(Client client,OrderForm orderForm) throws Exception;
}
