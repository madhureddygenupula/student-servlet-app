package com.ty.student;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StudentRegister extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

     String name=req.getParameter("stuName");
     String email=req.getParameter("stuEmail");
     String password=req.getParameter("stuPass");
     
     System.out.println("Name is :"+name);
     System.out.println("Email is :"+email);
     System.out.println("Password is:"+password);
		
	}

}
