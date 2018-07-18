package com.nt.test;

import java.util.ArrayList;
import java.util.HashSet;

import com.nt.domain.Employee;

public class Test {

	public static void main(String[] args) {
		Employee b1 = new Employee();
		b1.setEmployeeId(1);
		b1.setName("sai");
		b1.setDesignation("tester");
		b1.setSalary(25000.0);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(b1);
		//Employee b1 = new Employee(1, "sai", "developer", 15000.0);
		/*Employee b2 = new Employee(2, "kiran", "tester", 18000.0);
		Employee b3 = new Employee(3, "saikiran", "manager", 30000.0);
		Employee b4 = new Employee(4, "sai", "Hr", 25000.0);
		Employee b5 = new Employee(5, "naidu", "TeamLead", 35000.0);
		Employee b6 = new Employee(6, "sai", "developer", 35000.0);

		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);*/
		System.out.println("Employee Details :");
		System.out.println();
		for (Employee s1 : list) {

			System.out.println(
					s1.getEmployeeId() + "," + s1.getName() + "," + s1.getDesignation() + "," + s1.getSalary());

		}

	}

}
