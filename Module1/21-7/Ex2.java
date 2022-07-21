package com.a217;

public class Ex2 
{
	int id;
	String name;
	
	public Ex2(int i,String n) 
	{
		id=i;
		name=n;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		Ex2 e1 =new Ex2(101,"Yash");
		Ex2 e2 =new Ex2(102,"Shama");
		
		
		e1.display();
		e2.display();
	}
}
