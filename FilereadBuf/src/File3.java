/*A Java Program to read text from "Text3.txt" using BufferedInputStream*/
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class File3
{
	public static void main(String[] args) 
	{
         File fp = new File("C:\\Users\\Jasmine\\Desktop\\Text3.txt");
         BufferedInputStream b = null;
         FileInputStream fin = null;
         try 
         {
            fin = new FileInputStream(fp);
            b = new BufferedInputStream(fin);
            byte[] contents = new byte[1024];
            int bytesRead=0;
            String s;
            while ((bytesRead = b.read(contents)) != -1) 
            {
                s = new String(contents, 0, bytesRead);
                System.out.print(s);
            }
 
        }
        catch (FileNotFoundException e) 
        {
        	System.out.println("File not found" + e);
        }
        catch (IOException ioe) 
        {
        	System.out.println("Exception while reading file " + ioe);
        }
        finally 
        {
        	try 
        	{
                if (fin != null) 
                {
                    fin.close();
                }
                if (b != null) 
                {
                    b.close();
                }
            }
            catch (IOException ioe) 
        	{
                System.out.println("Error while closing stream : " + ioe);
            }
        }
    }
}