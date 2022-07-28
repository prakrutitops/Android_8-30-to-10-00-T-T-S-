package polymorphism;

import java.util.Calendar;

public class Overloadingex 
{
	static int cal(int a,int b)
	{
		return a+b;
	}
	

	static int cal(int a,int b,int c)
	{
		return a*b*c;
	}
	
	public static void main(String[] args) 
	{
			System.out.println(cal(2, 3));
			System.out.println(cal(2, 3, 4));
	}
	
	
}
