package com.cg.service.customer;

import com.cg.bean.controller.CustomerBean;
import com.cg.dao.customer.CustomerImplDao;
import com.cg.dao.customer.IcustomerDao;

public class CustomerServiceImpl {
IcustomerDao dao=new CustomerImplDao();
public int addDetails(CustomerBean bean){
	return dao.addDetails(bean);
}
}
