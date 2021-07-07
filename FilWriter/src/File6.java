/*A Java Program to write text to "Text6.txt" using FileWriter*/
import java.io.FileWriter;   
import java.io.IOException;  
class File6 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fw = new FileWriter("C:\\Users\\Jasmine\\Desktop/Text6.txt");
			fw.write("Writing Text to file using FileWriter!");
			fw.close();
			System.out.println("Successfully wrote to the file.");
		} 
		catch (IOException e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
  }}
