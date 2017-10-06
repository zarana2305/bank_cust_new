package com.cg.dao.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.bean.controller.CustomerBean;
import com.cg.dbutil.java.DBUtil;

public class CustomerImplDao implements IcustomerDao {
	static Connection conn=null;
	int row=0;
public int addDetails(CustomerBean bean){
	try{
		conn=DBUtil.getConnection();
		System.out.println(conn);
		PreparedStatement ps=conn.prepareStatement
				("insert into billdetails values(?,?,?,?)");
		ps.setInt(1,bean.getConsumerNo());
		ps.setString(2,bean.getConsumerName());
		ps.setString(3,bean.getConsumerEmail());
		ps.setString(4,bean.getPhoneNo());
		
		 row=ps.executeUpdate();
		
}
	catch(SQLException e){
		System.out.println(e.getMessage());
	}
	return row;
	}
}
