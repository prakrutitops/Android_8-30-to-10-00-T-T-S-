package com.a138;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEx 
{
	public static void main(String[] args)
	{
		try 
		{
			Student s = new Student(101,"shama");
			FileOutputStream fout =new FileOutputStream("E://shama.txt");
			ObjectOutputStream out =new ObjectOutputStream(fout);
			out.writeObject(s);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");
	}
}
