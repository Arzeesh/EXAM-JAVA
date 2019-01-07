package org.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.DocFlavor.INPUT_STREAM;
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
		Student s3 = new Student("Jaladala","Ibrahim",a0,a1);
			
	       
		/*
		 List<Student> students = Arrays.asList(new Student[] { s0, s1,s2, s3});
		   // unique last name set
		 
	Set <Student> lastname = students
			.stream()
			.distinct()
			.collect(Collectors.toSet());
	
	lastname.forEach(System.out::println);
	
	// remove all the address infor
	System.out.println("REmove Address");
	
	List<Student> removeAddress = lastname
			.stream()
			.map(x -> {return new Student(x.getFirstName(),x.getLastName(),null,null);})
			.collect(Collectors.toList());
	        
	removeAddress.forEach(System.out::println);*/
	
		Scanner  input =  new Scanner(System.in);
		System.out.println("Enter number to see  Nth sequence");
		int a = input.nextInt();
	System.out.println(NthFibonaci(a));
		

	System.out.println(findGCD(6, 4));
	        
	      // TO BE CONTINUED
	        
	  //      Comparator<Student> myStudentComparator = 
	//		Collections.sort(students, new StudentLastNameComparator());
//			System.out.println("after  sorting   -----");
//			 students.forEach(System.out::println);
//			 
//			 List<Student> students1 = Arrays.asList(new Student[] { s0, s1,s3});
//			 Collections.sort(students1, 
//					 (x1, x2) -> x1.getMailingAddress().getZipcode().compareTo(x2.getMailingAddress().getZipcode()));
//			 System.out.println("zip sorting ----");		
//			 students1.forEach(System.out::println);
//			 System.out.println(" sorting BASED ON NAME ----");	
//			 
//			 
//			 // find student based on their name
//			 List<Student> student2 = Arrays.asList(new Student[] { s0, s1,s2 , s3});
////			 List<Student> findStudent = student2
////					 .stream()  // allows to to some manipulation on the list object
////					 .filter(x -> x.getLastName().equalsIgnoreCase("ibrahim")) // filter it by going through last name and ignoring case
////					 .collect(Collectors.toList()); // put stream in list to display it
////			 findStudent.forEach(System.out::println);
	        
//			 //  without using stream
//			 for(Student findStudent1 : student2) {
//				 if(findStudent1.getLastName() != null && findStudent1.getLastName().equalsIgnoreCase("Ibrahim")) {
//					 System.out.println(findStudent1);
//				 }

			
			 }
	
	private static  int NthFibonaci(  int  i) { 
		//base case 
	
		if(i == 1 || i ==2){
			
		return 1;
		
		}		
		return (NthFibonaci(i-1)+ NthFibonaci( i-2));

	}
	
	private static int findGCD(int number1, int number2) { 
		//base case 
		if(number2 == 0)
		{ return number1; } 
		
		return findGCD(number2, number1%number2);
		
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
