package com.a68;


abstract class Tops
{
	abstract void studentdetail();
	
	void a()
	{
		System.out.println("aa");
	}
	
}

class Tops2 extends Tops
{

	@Override
	void studentdetail() 
	{
		// TODO Auto-generated method stub
		System.out.println("student detail accessed");
	}
	
}
public class AbstractEx 
{
	public static void main(String[] args) 
	{
		Tops2 t =new Tops2();
		t.studentdetail();
		t.a();
		
		
	
		
	}
}
