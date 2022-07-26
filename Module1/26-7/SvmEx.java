package com.a267;

public class SvmEx 
{
	int id;
	String name;
	static String college="Atmiya";

	public SvmEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
	}
	void display()
	{
			System.out.println(id+" "+name+" "+college);
	}
	 static void change()
	{
		college="VVP";
	}
	public static void main(String[] args)
	{
		
		SvmEx s1 =new SvmEx(101,"Yash");
		SvmEx s2 =new SvmEx(102,"Shama");
		change();
		s1.display();
		s2.display();
	
	}
}
