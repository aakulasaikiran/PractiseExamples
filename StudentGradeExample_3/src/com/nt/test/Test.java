package com.nt.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.nt.domain.Student;

public class Test {

	public static void main(String[] args) {
		
		Student e1 = new Student(1, "saikiran", "10", 75);
		Student e2 = new Student(2, "nishanth", "10", 85);
		Student e3 = new Student(3, "sravan", "10", 95);
		Student e4 = new Student(4, "sathish", "10", 55);
		Student e5 = new Student(5, "rafi", "10", 30);
		Student e6 = new Student(6, "sunil", "10", 45);
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		for (Student s1 : list) {

			// System.out.println(s1.getRollno() + "," + s1.getName() + "," + s1.getStudy()
			// + "," + s1.getMarks());

			if (s1.getMarks() > 85) {
				s1.setGrade('A');

			} else if (s1.getMarks() <= 85 && s1.getMarks() > 70) {
				s1.setGrade('B');

			}

			else if (s1.getMarks() <= 70 && s1.getMarks() > 55) {
				s1.setGrade('C');

			} else if (s1.getMarks() <= 55 && s1.getMarks() > 40) {
				s1.setGrade('D');

			} else if (s1.getMarks() <= 40) {
				s1.setGrade('F');

			}

		}
		System.out.println("Student Data Display: ");

		for (Student s2 : list) {
			System.out.println();
			System.out.println("RoolNo : "+s2.getRollno() + " , " +"Student Name :"+ s2.getName() + " , " +"Student Class :"+ s2.getStudy() + " , " +"Stdent Marks :"+ s2.getMarks() +"Student Grade :"+ " ===> "
					+ s2.getGrade());

		}

	}

}
