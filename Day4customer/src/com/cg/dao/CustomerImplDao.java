package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import com.cg.bean.CustomerBean;
import com.cg.dbutil.DBUtil;


public class CustomerImplDao implements IcustomerDao {

	static Connection conn=null;
	int row=0;
	int value=0;
	
	
	@Override
	public int addDetails(CustomerBean bean) {
		
		try{
			conn=DBUtil.getConnection();
			System.out.println(conn);
			PreparedStatement ps=conn.prepareStatement
					("insert into cust values(cust_id.nextval,?,?,?,?)");
			
			//ps.setString(1,bean.getCustid());
			ps.setString(1,bean.getCustname());
			ps.setString(2,bean.getPhoneno());
			ps.setString(3,bean.getPwd());
			ps.setString(4,bean.getRpwd());
			 row=ps.executeUpdate();
			 
			 PreparedStatement ps1=conn.prepareStatement("select cust_id.currval from dual");
				ResultSet rs=ps1.executeQuery();
				while(rs.next())
				{
					value=rs.getInt(1);
				}
			 
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return value;
		}
		
		
		
	}


