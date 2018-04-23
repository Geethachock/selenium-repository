package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeintoexcelsheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D://Geetha//qa training//write.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("sheet1");
		
		Row r = ws.createRow(0);
		r.createCell(0).setCellValue("Testing");
		r = ws.createRow(1);
		 r.createCell(0).setCellValue("EAD");
		 r = ws.createRow(2);
		 r.createCell(0).setCellValue("USICS");
		 r= ws.createRow(3);
		 r.createCell(0).setCellValue("h14");
		 FileOutputStream f1 = new FileOutputStream("D://Geetha//qa training//write.xlsx") ;
        wb.write(f1);
        f1.close();
	}

}
