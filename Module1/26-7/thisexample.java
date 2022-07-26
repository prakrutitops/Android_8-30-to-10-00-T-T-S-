package com.a267;

public class thisexample 
{
	
	int id;
	String name;
	
	
	public thisexample(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		thisexample t1 =new thisexample(101,"Yash");
		thisexample t2 =new thisexample(102,"Shama");
		
		t1.display();
		t2.display();
	}
}
