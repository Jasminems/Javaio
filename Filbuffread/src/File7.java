/*A Java Program to read text from "Text7.txt" using BufferedReader*/
import java.io.*;
public class File7
{
	public static void main(String[] args)throws Exception
	{
		File fp = new File("C:\\Users\\Jasmine\\Desktop/Text7.txt");
		BufferedReader b = new BufferedReader(new FileReader(fp));
		String s;
		while ((s = b.readLine()) != null)
			System.out.println(s);
	}
}