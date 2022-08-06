package com.a68;

public class ThrowEx 
{
	
	static void validate(int age)
	{
		
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			try 
			{
				throw new MyException();
			}
			catch (MyException e) 
			{
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		
		System.out.println("aaa");
		
		
	}
	
	public static void main(String[] args) 
	{
		validate(12);
	}
}
