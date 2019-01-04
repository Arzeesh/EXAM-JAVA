package org.learn.java;

import java.util.Comparator;

public class StudentLastNameComparator implements Comparator<Student>{

	public int compare(Student o1, Student o2) {

		// TODO Auto-generated method stub
		return  o1.getLastName().compareTo(o2.getLastName());
	}

	

	
	
}
