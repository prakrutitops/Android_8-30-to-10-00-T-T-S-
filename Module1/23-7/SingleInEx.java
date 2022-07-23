package com.a237;

class A
{
	void data()
	{
		System.out.println("Data Accessed from A");
	}
}
class B extends A
{
	void data2()
	{
		System.out.println("Data Accessed from B");
	}
}

public class SingleInEx 
{
	public static void main(String[] args) 
	{
		
		B b1 = new B();
		
		b1.data();
		b1.data2();
	}
}
