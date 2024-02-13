package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements IEmployeeService{

	
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		//EmployeeBean bean1=new EmployeeBean();
		dao.insertEmployee(bean);
		
	}
    public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		//EmployeeBean bean1=new EmployeeBean();
		dao.updateEmployee(bean);
		
	}
	public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		//EmployeeBean bean1=new EmployeeBean();
		dao.selectEmployee(bean);
		
	}
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		//EmployeeBean bean1=new EmployeeBean();
		dao.deleteEmployee(bean);
		
	}


	
		
}
