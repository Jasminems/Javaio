/*A Java Program to writing data to Excel*/
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
class File11 
{
   public static void main(String[] args) throws Exception
   {
      XSSFWorkbook wb = new XSSFWorkbook();
      XSSFSheet sh = wb.createSheet( " Employee Information ");
      XSSFRow row;
      Map < String, Object[] > empinfo = new TreeMap < String, Object[] >();
      empinfo.put( "1", new Object[] {
         "EMP ID", "EMP NAME", "DESIGNATION" });
      
      empinfo.put( "2", new Object[] {
         "JA1", "Jasmine", "Technical Manager" });
      
      empinfo.put( "3", new Object[] {
         "JA2", "Mithun", "Asssociate" });
      
      empinfo.put( "4", new Object[] {
         "JA3", "Santhosh", "Technical Executive" });
      
      empinfo.put( "5", new Object[] {
         "JA4", "Gokul", "Supervisor" });
      
      empinfo.put( "6", new Object[] {
         "JA5", "Claire", "Associate Director" });
      Set < String > keyid = empinfo.keySet();
      int rowid = 0;
      for (String key : keyid)
      {
         row = sh.createRow(rowid++);
         Object [] objectArr = empinfo.get(key);
         int cellid = 0;
         for (Object obj : objectArr)
         {
            Cell cell = row.createCell(cellid++);
            cell.setCellValue((String)obj);
         }
      }
      FileOutputStream out = new FileOutputStream(
         new File("C:\\Users\\Jasmine\\Desktop/Employees.xlsx"));
      
      wb.write(out);
      out.close();
      System.out.println("Datas are added in Excel");
   }
}