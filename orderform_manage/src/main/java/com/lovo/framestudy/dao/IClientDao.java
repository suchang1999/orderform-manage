package com.lovo.framestudy.dao;

import com.lovo.framestudy.beans.Client;
import com.lovo.framestudy.beans.OrderForm;

public interface IClientDao {
	public int addOrderForm(Client client,OrderForm orderForm) throws Exception;
	public int updateOrderForm(Client client,OrderForm orderForm) throws Exception;
	public int delOrderForm(Client client,OrderForm orderForm) throws Exception;
}
