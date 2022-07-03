package com.jitesh.driver;

import com.jitesh.model.AdminDepartment;
import com.jitesh.model.HrDepartment;
import com.jitesh.model.Super;
import com.jitesh.model.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
	AdminDepartment admin= new AdminDepartment();
	System.out.println("Welcome to "+admin.departmentName());
     System.out.println(admin.getTodaysWork());
     System.out.println(admin.getWorkDeadline());
     System.out.println(admin.isTodayAHoliday());
     System.out.println();
     
     HrDepartment hr= new HrDepartment();
     System.out.println("welcome to " +hr.departmentName());
     System.out.println(hr.getTodaysWork());
     System.out.println(hr.getWorkDeadline());
     System.out.println(hr.doActivity());
     System.out.println(hr.isTodayAHoliday());
     System.out.println();
     
     TechDepartment tech= new TechDepartment();
     System.out.println("Welcome to "+ tech.departmentName());
     System.out.println(tech.getTodaysWork());
     System.out.println(tech.getWorkDeadline());
     System.out.println(tech.getTechStackInformation());
     System.out.println(tech.isTodayAHoliday());
     
     
	}

}
