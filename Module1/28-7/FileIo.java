package polymorphism;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo 
{
	//File Read Write

	//FileOutputStream-Write
	//FileInputStream-Read
	
	public static void main(String[] args) throws IOException
	{
		String s="welcome to tops";
		FileOutputStream fout =new FileOutputStream("D://Yash.txt");
		fout.write(s.getBytes());
		System.out.println("success");
		
	}
}
