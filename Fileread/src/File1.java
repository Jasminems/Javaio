/*A Java Program to read text from "Text1.txt" file using InputStream*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class File1 
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
        String fp = "C:\\Users\\Jasmine\\Desktop/Text1.txt";
        try (FileInputStream fis = new FileInputStream(fp)) 
        {
        	int i; 
            while ((i = fis.read()) != -1) 
            {
                System.out.print((char) i);
            }
        }        
        System.out.println();
    }
}