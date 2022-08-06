package com.a68;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIoEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		String s="welcome";
		FileOutputStream fout =new FileOutputStream("E://Prakruti.txt");
		fout.write(s.getBytes());
		System.out.println("success");
		
	}
}
