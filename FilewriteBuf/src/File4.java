/*A Java Program to write text to "Text4.txt" using BufferedOutputStream*/
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class File4
{
    public static void main(String[] args) 
    {
    	String data = "Hi\r\n" + 
    			"This is an example for writing text in file using BufferedOutputStream";
    	try 
    	{
            FileOutputStream fp = new FileOutputStream("C:\\Users\\Jasmine\\Desktop\\Text4.txt");
            BufferedOutputStream out = new BufferedOutputStream(fp);
            byte[] array = data.getBytes();
            out.write(array);
            out.close();
        }
    	catch (Exception e) 
    	{
            e.getStackTrace();
        }
    }
}