package com.cg.bean;

public class CustomerBean {
//private String custid;
private String custname;
private String phoneno;
private String pwd;
private String rpwd;

public CustomerBean(String custid, String custname, String phoneno, String pwd,
		String rpwd) {
	super();
	//this.custid = custid;
	this.custname = custname;
	this.phoneno = phoneno;
	this.pwd = pwd;
	this.rpwd = rpwd;
}

public CustomerBean() {
	//super();
	// TODO Auto-generated constructor stub
}

/*public String getCustid() {
	return custid;
}

public void setCustid(String custid) {
	this.custid = custid;
}*/

public String getCustname() {
	return custname;
}

public void setCustname(String custname) {
	this.custname = custname;
}

public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getRpwd() {
	return rpwd;
}

public void setRpwd(String rpwd) {
	this.rpwd = rpwd;
}



}
