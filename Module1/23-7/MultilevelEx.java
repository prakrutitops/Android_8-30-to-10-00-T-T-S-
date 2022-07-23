package com.a237;

class A1
{
	void a1()
	{
		System.out.println("Data Accessed From A");
	}
}
class B1 extends A1
{
	void b1()
	{
		System.out.println("Data Accessed From B");
	}
}
class C1 extends B1
{
	void c1()
	{
		System.out.println("Data Accessed From C");
	}
}
class D1 extends C1
{
	void d1()
	{
		System.out.println("Data Accessed From D");
	}
}

public class MultilevelEx 
{
	public static void main(String[] args) 
	{
		D1 d =new D1();
		
		d.a1();
		d.b1();
		d.c1();
		d.d1();
	}
}
