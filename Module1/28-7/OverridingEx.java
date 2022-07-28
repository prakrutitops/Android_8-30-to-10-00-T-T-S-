package polymorphism;

class Bank
{
	int rate()
	{
		return 0;
	}
}
class Sbi extends Bank
{
	int rate()
	{
		return 7;
	}
}
class Icici extends Bank
{
	int rate()
	{
		return 8;
	}
}
class Axis extends Bank
{
	int rate()
	{
		return 9;
	}
}

public class OverridingEx 
{
	public static void main(String[] args) {
		
		/*
		 * Sbi s = new Sbi(); 
		 * Icici i =new Icici(); 
		 * Axis a =new Axis();
		 * 
		 * System.out.println(s.rate()); 
		 * System.out.println(i.rate());
		 * System.out.println(a.rate());
		 */
		
		Bank b;//refrence variable
		
		b=new Sbi();//initialization
		System.out.println(b.rate());
		b=new Icici();
		System.out.println(b.rate());
		b=new Axis();
		System.out.println(b.rate());
		
		
		
	}
}
