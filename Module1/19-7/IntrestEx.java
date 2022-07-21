package com.a197;

import java.util.Scanner;

public class IntrestEx 
{
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter prin.. amount");
		int pri=sc.nextInt();
		
		System.out.println("Enter ROI");
		float rate=sc.nextFloat();
		
		System.out.println("Enter Year");
		int year=sc.nextInt();
		
		double ans= pri*rate*year;
		double ans2=ans/100;
		
		System.out.println("Your Intrest is "+ans2);
	}
}
