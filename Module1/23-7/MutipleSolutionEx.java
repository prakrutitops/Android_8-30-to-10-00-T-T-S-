package com.a237;

interface Print
{
	void print();
}
interface Show
{
	void show();
}

public class MutipleSolutionEx implements Print,Show
{

	@Override
	public void show() 
	{
			System.out.println("Showing");
		
	}

	@Override
	public void print() {
		
		System.out.println("Printing");
	}
	
	public static void main(String[] args) 
	{
		MutipleSolutionEx m1 =new MutipleSolutionEx();
		
		m1.print();
		m1.show();
	}
}
