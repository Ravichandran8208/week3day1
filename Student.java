package org.Student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Krish");
		

	}
	public void studentDept() {
		System.out.println("Mech");

	}
	public void studentId() {
		System.out.println(23);
		

	}
	public static void main(String[] args) {
		Student sd=new Student();
		sd.cllogeCode();
		sd.collegeName();
		sd.collegeRank();
		sd.departmentName();
		sd.studentDept();
		sd.studentId();
		sd.studentName();
		
	}
	
	
	

}
