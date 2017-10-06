package com.cg.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.CustomerBean;
import com.cg.dao.CustomerImplDao;
import com.cg.dao.IcustomerDao;
/**
 * Servlet implementation class HomeController
 */
@WebServlet("*.obj")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerBean bean=new com.cg.bean.CustomerBean();
		IcustomerDao service=new CustomerImplDao();
		String path=request.getServletPath();
		String target=null;
		switch(path){
		case "/Servlet.obj":
			target="NewCustomer.html";
			break;
		case "/customer.obj":
		//String custid=request.getParameter("custid");
		String custname=request.getParameter("custname");
		String phoneno=request.getParameter("phoneno");
		String pwd=request.getParameter("pwd");
		String rpwd=request.getParameter("rpwd");	
		
		

		//bean.setCustid(custid);
		bean.setCustname(custname);
		bean.setPhoneno(phoneno);
		bean.setPwd(pwd);
		bean.setRpwd(rpwd);
		 int res=service.addDetails(bean);
		 
		 HttpSession session=request.getSession();
		 session.setAttribute("seqid",res);
		 target="success.jsp";
		 break;
		 
		 //System.out.println(res);
		 /*if(res==1){
			 target="Success.html";
		 }
		 else{
			 target="error.html";
		 }
		break;}*/
		case "/paybill.obj":
		
			target="calc.jsp";
			break;
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request,response);
		
		
		
	}}
	

