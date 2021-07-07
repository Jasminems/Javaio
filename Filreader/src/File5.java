/*A Java Program to read text from "Text5.txt" using FileReader*/
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
class File5
{
    public static void main(String[] args)
    {
        File fp = new File("C:\\Users\\Jasmine\\Desktop/Text5.txt");
        try (FileReader fr = new FileReader(fp))
        {
            int content;
            while ((content = fr.read()) != -1) 
            {
                System.out.print((char) content);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}