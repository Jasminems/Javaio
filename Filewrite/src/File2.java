/*A Java Program to write text to "Text2.txt" file using OutputStream*/
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class File2 
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
        String fp ="C:\\Users\\Jasmine\\Desktop/Text2.txt";
        try (FileOutputStream fos = new FileOutputStream(fp)) 
        {
            String text = "Hello World";
            byte[] mybytes = text.getBytes();
            fos.write(mybytes);
        }
    }
}