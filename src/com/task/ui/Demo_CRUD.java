package com.task.ui;
import com.task.service.*;

import com.task.bean.EmployeeBean;
import java.sql.SQLException;
import java.util.Scanner;


public class Demo_CRUD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your option");
		System.out.println("1.insert");//Create
		System.out.println("2.update");//update
		System.out.println("3.Select");//read
		System.out.println("4.Delete");//delete
		int option=sc.nextInt();
		switch(option){
			case 1:
			{
				insertEmployee();
				break;
			}
			case 2:
			{
				updateEmployee();
				break;
			}
			case 3:
			{
				selectEmployee();
				break;
			}
			case 4:
			{
			  deleteEmployee();
			  break;
			}
			default:
			{
				System.out.println("your entered option is not match");
			}
		}
	}	
	
	private static void insertEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		bean.setEmpid(101);
		bean.setEmpname("Ajju");
		bean.setEmpaddress("mpt");
		service.insertEmployee(bean);
		
	}
	private static void updateEmployee() throws ClassNotFoundException,SQLException {
	EmployeeServiceImpl service = new EmployeeServiceImpl();
	  EmployeeBean bean = new EmployeeBean();
	    bean.setEmpid(101);
	    bean.setEmpname("Ashu");
	    bean.setEmpaddress("hyd");
	    service.updateEmployee(bean);
	}
	 
	private static void selectEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		bean.setEmpid(101);
		bean.setEmpname("Ajju");
		bean.setEmpaddress("mpt");
		service.selectEmployee(bean);
	}
	private static void deleteEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		bean.setEmpid(101);
		bean.setEmpname("Ajju");
		bean.setEmpaddress("mpt");
		
		service.deleteEmployee(bean);
	}
	
    
		
	
}

