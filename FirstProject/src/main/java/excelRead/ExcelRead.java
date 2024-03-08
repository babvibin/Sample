package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
static FileInputStream f;
static XSSFWorkbook w;
static XSSFSheet sh;

public static String getStringData(int x,int y) throws IOException
{
	
	f=new FileInputStream("C:\\Users\\user\\Desktop\\SampleExcelRead.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	XSSFRow r=sh.getRow(x);
	XSSFCell c=r.getCell(y);
	return c.getStringCellValue();
}

public static String getIntegerData(int x,int y) throws IOException
{
	
	f=new FileInputStream("C:\\Users\\user\\Desktop\\SampleExcelRead.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	XSSFRow r=sh.getRow(x);
	XSSFCell c=r.getCell(y);
	int z=(int) c.getNumericCellValue();
	return String.valueOf(z);
	
	
	
}




}
