/*A Java Program to read data from properties file*/
import java.util.*;  
import java.io.*;  
public class File9
{  
	public static void main(String[] args)throws Exception
	{  
		FileReader fr=new FileReader("C:\\Users\\Jasmine\\Desktop/db.properties.txt"); 
		Properties p=new Properties();  
		p.load(fr);  
		System.out.println(p.getProperty("user"));  
		System.out.println(p.getProperty("password"));
	}  
}  
