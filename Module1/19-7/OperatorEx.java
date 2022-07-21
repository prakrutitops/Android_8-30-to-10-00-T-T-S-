package com.a197;

import java.util.Scanner;

public class OperatorEx 
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number 1");
		int a=sc.nextInt();
		
		System.out.println("Enter Number 2");
		int b=sc.nextInt();
		
		System.out.println("Enter Choice \n \n 1->Addition \n 2->Substraction \n 3->Multiplication");
		int choice=sc.nextInt();
		int c=0;
		switch(choice)
		{
		
			case 1:
					c=a+b;
					System.out.println("Your Addition is "+c);
			break;
			
			case 2:
				c=a-b;
				System.out.println("Your Substraction is "+c);
			break;
		
			case 3:
				c=a*b;
				System.out.println("Your Multiplication is "+c);
			break;
			default:
				System.out.println("Your Number is not valid");
				break;

		}
	}
}
