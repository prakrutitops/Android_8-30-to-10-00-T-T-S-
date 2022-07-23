package com.a237;

class A11
{
	void a11()
	{
		System.out.println("a11 accessed");
	}
}
class B11 extends A11
{
	void b11()
	{
		System.out.println("b11 accessed");
	}
}
interface C11
{
	void c11();
}
class D11 extends B11 implements C11
{
	void d11()
	{
		System.out.println("d11 accessed");
	}

	@Override
	public void c11() 
	{
		// TODO Auto-generated method stub
		System.out.println("c11 accessed");
	}
}

public class HybridEx 
{
	public static void main(String[] args) {
		
		D11 d =new D11();
		d.a11();
		d.b11();
		d.c11();
		d.d11();
		
	}
}
