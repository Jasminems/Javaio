/*A Java Program to read data from excel file*/
import java.io.File;  
import java.io.FileInputStream;  
import java.util.Iterator;  
//Importing required packages
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
class File10 
{  
	public static void main(String[] args)   
	{  
		try  
		{  
			File f = new File("C:\\Users\\Jasmine\\Desktop/Data.xlsx"); 
			FileInputStream fis = new FileInputStream(f);    
			XSSFWorkbook wb = new XSSFWorkbook(fis);   
			XSSFSheet sh = wb.getSheetAt(0);       
			Iterator<Row> itr = sh.iterator();    
			while (itr.hasNext())                 
			{  
				Row row = itr.next();  
				Iterator<Cell> cellIterator = row.cellIterator();    
				while (cellIterator.hasNext())   
				{  
					Cell cell = cellIterator.next();  
					switch (cell.getCellType())               
					{  
						case Cell.CELL_TYPE_STRING:      
							System.out.print(cell.getStringCellValue() +"\t\t\t");  
							break;  
						case Cell.CELL_TYPE_NUMERIC:     
							System.out.print(cell.getNumericCellValue() +"\t\t\t");  
							break;  
					default:  
					}  
				}  
				System.out.println("");
			}  
		}  
		catch(Exception e)  
		{  
			e.printStackTrace();  
		}  
}
}