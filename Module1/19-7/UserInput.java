package com.a197;

import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);//get value from user through scanner
		
			System.out.println("Enter your id");
			int id=sc.nextInt();
			
			System.out.println("Enter your name");
			String name=sc.next();
			
			System.out.println("Enter your salary");
			double salary=sc.nextDouble();
	
			
			System.out.println("Your id is:"+id);
			System.out.println("Your name is:"+name);
			System.out.println("Your salary is:"+salary);
			
			
			if(salary<50000)
			{
				System.out.println("Not Good");
			}
			else
			{
				System.out.println("Good Progress");
			}
			
	}
}
