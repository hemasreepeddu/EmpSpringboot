package com.spring.boot.application;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;


public class EmployeeDao {


		@Resource(name="jdbcTemplate")
		private JdbcTemplate jdbcTemplate;  
		
		
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
		    this.jdbcTemplate = jdbcTemplate;  
		} 
		
		public int add(Employee emp) {
			// TODO Auto-generated method stub
			System.out.println("JDBC"+this.jdbcTemplate);
			String sql="insert into employee_table(email_id,user_password,username,profession) values('"+emp.getEmail()+"','"+emp.getPassword()+"','"+emp.getUsername()+"','"+emp.getProfession()+"')";  
			return jdbcTemplate.update(sql); 
		}


}
