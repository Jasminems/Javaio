/*A Java Program to write text to "Text8.txt" using BufferedWriter*/
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class File8
{
    public static void main(String[] args)
    {
        try 
        {
              String content = "Hello World";
              File fp = new File("C:\\Users\\Jasmine\\Desktop/Text8.txt");
              if (!fp.exists()) 
              {
            	  fp.createNewFile();
              }
              FileWriter fw = new FileWriter(fp);
              BufferedWriter b = new BufferedWriter(fw);
              b.write(content);
              b.close();
  
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}