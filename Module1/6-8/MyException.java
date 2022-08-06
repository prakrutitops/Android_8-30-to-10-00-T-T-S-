package com.a68;

public class MyException extends Exception
{
	
	public MyException()
	{
		System.out.println("error executed");
	}
	
	public static void main(String[] args) {
		
		
		MyException m1 =new MyException();
	}
	
	
}
