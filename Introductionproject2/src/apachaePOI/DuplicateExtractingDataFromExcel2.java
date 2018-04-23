package apachaePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DuplicateExtractingDataFromExcel2 {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	static String value;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//to fetch data from excel sheet,Fileinputstream is a class passing the path of the excel sheet
		DuplicateExtractingDataFromExcel2 de = new DuplicateExtractingDataFromExcel2();
		String value = de.celldata(2, 2);
		System.out.println(value);

	}
	
	public String celldata(int rownum, int col) throws IOException
	{  fis = new FileInputStream("D:\\DataFromExcel.xlsx");
		 wb = new XSSFWorkbook(fis);
		 sheet = wb.getSheet("script");
		 row = sheet.getRow(2);
		 cell = row.getCell(2);
		 cell.setCellValue("hi");
		 value = cell.getStringCellValue();
		return value;

	}

}
