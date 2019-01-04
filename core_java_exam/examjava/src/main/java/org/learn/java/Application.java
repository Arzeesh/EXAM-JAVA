package org.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Application {
	
	static {
		
	}

	public static void main(String[] args) {
		//TODO: create a list of students (may be five items)
		//TODO: sort the list using last name of the student
		//TODO: sort the list using the zip code of the mailing address
		//TODO: find a student(s) by the last name which contain a given string
		
		
		//TODO: create a set of students (may be five items) where unique student should be defined by their
		//1)last name, 2)first name and 3)permanent address
		//TODO: remove all of the addresses (may be set it to null) of all students and return them in a lis
		
		// ist student mail n perm
		Address a0 = new Address(32, "Dhanmondi", "Dhaanmondi", "Dhaka","Dhaka",1234);
		Address a1 = new Address(33, "Atlantic", "Gregory", "Bridgeport","CT",1244);
		
		// 2nd student mail n perm
		
		Address a2 = new Address(34, "Lewis",  "Stamford","Old Road","CT",1254);
		Address a3 = new Address(35, "Stratford",  "Milford"," New road", "NY",1265);
		
		// 3rd student  mail n perm
		
		Address a4 = new Address(36, "Laurel",  "Wood Ave","Clinton","NH",1204);
		Address a5 = new Address(37, "Vine",  "Prospect"," Hanover", "MD",1222);
		
		
		
		Student s0 = new Student("Daud","Ibrahim",a0,a1);
		Student s1 = new Student("Arzeesh","Zaman",a2,a3);
		Student s2 = new Student("Courtney","Gayle",a4,a5);
		
	        
		 List<Student> students = Arrays.asList(new Student[] { s0, s1,s2});
		 
	        
	        System.out.println("Before sorting ----");
	      System.out.println( students);
	        
	        Comparator<Student> myStudentComparator = new StudentLastNameComparator();
			Collections.sort(students, myStudentComparator);
			System.out.println("after  sorting   -----");
			 System.out.println( students);
		        
		  
	//
			 List<Student> a = Arrays.asList(new Student[] {s0,s1,s2 });
			 System.out.println(a);
			
			 			 
			 for( Student student : a){
				 Address del = new Address(0, null, null, null, null, 0);
				 Student s = new Student(student.getFirstName(),student.getLastName(),del,del);
				 System.out.println(a.add(s));
			 }
			 
			
		
	}
	
	
	public static void sqrt() {
		Scanner user =new Scanner(System.in);
		
		System.out.println("Enter a number to find the square-root : ");
        int root = user.nextInt();
        System.out.println("Square root is : "+(int)Math.sqrt(root));
        
	}
	
		public static void reversenumber() {
			
			Scanner user =new Scanner(System.in);
			
			System.out.println("Enter number to reverse: ");
			int reverse = user.nextInt();
			
			StringBuilder sb = new StringBuilder();
			sb.append(reverse);
			for (int i = sb.length()-1; i >=0 ; i--) {
				
				System.out.print(sb.charAt(i));
			}
			
			
			
			
			
		}

}