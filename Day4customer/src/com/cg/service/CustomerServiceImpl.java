package com.cg.service;

import com.cg.bean.CustomerBean;
import com.cg.dao.CustomerImplDao;
import com.cg.dao.IcustomerDao;


public class CustomerServiceImpl {

	IcustomerDao dao=new CustomerImplDao();
	public int addDetails(CustomerBean bean){
		return dao.addDetails(bean);
	}
	
	
}
