package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FetchServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int empId=Integer.parseInt(request.getParameter("name"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/test","root","Ashu@123");
			PreparedStatement pst=con.prepareStatement("Select* from fetch where empid=?");
			pst.setInt(1, empId);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				pw.println(rs.getInt(1)+" "+rs.getString(2));
			}
			pst.close();
			
			
		}
		catch(Exception e) {
			
		}
		}
	}
