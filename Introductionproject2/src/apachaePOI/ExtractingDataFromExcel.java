package apachaePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExtractingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//to fetch data from excel sheet,Fileinputstream is a class passing the path of the excel sheet
		FileInputStream fis = new FileInputStream("D:\\DataFromExcel.xlsx");
		//XSSWorkbook is a class in poi for intiating excel sheet, passing the object in it.
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("script");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(2);
		String value = cell.getStringCellValue();
		System.out.println(value);

	}

}
