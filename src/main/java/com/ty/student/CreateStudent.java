package com.ty.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.student.dao.StudentDao;
import com.ty.student.dto.Student;

public class CreateStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		super.doGet(req, resp);
//		
//		System.out.println("------Hi I am a Create Student Http-servlet");
//		
//		String name=req.getParameter("stuName");
//	     String email=req.getParameter("stuEmail");
//	     String password=req.getParameter("stuPass");
//	     
//	     System.out.println("Name is :"+name);
//	     System.out.println("Email is :"+email);
//	     System.out.println("Password is:"+password);
//	     
//	     Student student=new Student();
//	     student.setName(name);
//	     student.setEmail(email);
//	     student.setPassword(password);
//	     
//	     StudentDao dao=new StudentDao();
//	     dao.saveStudent(student);
	     
	     PrintWriter pout=resp.getWriter();
//	     String message=name+"details are Strored";
	     pout.println("<html><body><h1>I am a get Method</h1></body></html>");
	  
	}
}
