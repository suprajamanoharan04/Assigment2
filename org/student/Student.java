package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("subbu");
	}
	public void studentDept() {
		System.out.println("CSE");
	}
	public void studentId() {
		System.out.println("CBS3456");
	}

	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
		Department dep=new Department();
		dep.collegeCode();

	}

}
