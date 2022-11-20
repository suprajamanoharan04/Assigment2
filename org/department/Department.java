package org.department;

import org.collegeass2.College;

public class Department extends College {
	public void deptName()
	{
		System.out.println("CSE");
		System.out.println("ECE");
		System.out.println("EEE");
		System.out.println("MECH");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dep=new Department();
		dep.collegeCode();
		dep.collegeName();
		dep.collegeRank();
		dep.deptName();

	}

}
