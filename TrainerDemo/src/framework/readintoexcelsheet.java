package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readintoexcelsheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D://Geetha//qa training//Book1.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("sheet1");
		Iterator <Row>row=ws.iterator();
		while(row.hasNext())
		{
		       //@SuppressWarnings("unchecked")
		       Row r= row.next();
		       Iterator <Cell>cell=r.iterator();
		       while(cell.hasNext())
		       {
		              Cell c=cell.next();
		              if(c.getCellType()==c.CELL_TYPE_NUMERIC)
		              {
		                     System.out.println(c.getNumericCellValue());
		              }
		              else if(c.getCellType()==c.CELL_TYPE_STRING)
		              {
		                     System.out.println(c.getStringCellValue());
		              }
		             
		       }
		      
		      
		}
		 
	}

}
