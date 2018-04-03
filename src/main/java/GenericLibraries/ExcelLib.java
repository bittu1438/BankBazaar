package GenericLibraries;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	
	public static String getExceldata(String sheetname, int rownum, int colnum) throws Throwable 
	{
	String path="E:\\javabasics\\BankBazaar\\src\\test\\resources\\Resources\\testdata.xlsx";
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh= wb.getSheet(sheetname);
	Row row= sh.getRow(rownum);
	String data=row.getCell(colnum).getStringCellValue();
	return data;
	}
}
