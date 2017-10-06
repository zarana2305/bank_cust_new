package com.cg.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.controller.CustomerBean;
import com.cg.dao.customer.CustomerImplDao;
import com.cg.dao.customer.IcustomerDao;

@WebServlet("*.obj")
public class HomeController extends HttpServlet {
      
	       
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			CustomerBean bean=new CustomerBean();
			IcustomerDao service=new CustomerImplDao();
			String path=request.getServletPath();
			String target=null;
			switch(path){
			case "/customer.obj":
			String consumerNo=request.getParameter("conNo");
			int consNo=Integer.parseInt(consumerNo);
			String consumerName=request.getParameter("conName");
			String consumerEmail=request.getParameter("email");
			String consumerPhone=request.getParameter("phone");
			
			bean.setConsumerNo(consNo);
			bean.setConsumerName(consumerName);
			bean.setConsumerEmail(consumerEmail);
			bean.setPhoneNo(consumerPhone);
			 int res=service.addDetails(bean);
			 System.out.println(res);
			 if(res==1){
				 target="Success.html";
			 }
			 else{
				 target="Error.html";
			 }
			break;}
			RequestDispatcher rd=request.getRequestDispatcher(target);
			rd.forward(request,response);
		}

	}

