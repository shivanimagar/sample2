package crud;

import java.util.Scanner;
import java.lang.*;
public class assignment2 {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Student Details in'roll:name:marks' pattern");
	String details = sc.nextLine();
	String[] StrAry = details.split(":", 5);
	String result;
	//for (String word : arrOfStr)
		String name=StrAry[1];
		String roll=StrAry[0];
		int marks=Integer.valueOf(StrAry[2]);
		if(marks>=500) {
			result="Pass";
		}	else {
			result="Fail";
		}
		System.out.print("Student Roll is : "+roll+'\n'+ "Student Name is :"+name+'\n'
				+ "Student Marks is : "+marks+'\n'
				+ "Student Result is : "+result);
		

		
	}
	} 



