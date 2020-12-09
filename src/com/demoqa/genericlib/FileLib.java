package com.demoqa.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String getPropKeyValue(String propPath,String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String propValue=prop.getProperty(key, "IncorrectKey");
		return propValue;
	}
public String getCellData(String excelPath,String sheetName,int row, int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(fis);
	String excelValue=wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
	return excelValue;
	
}
public int getRowCount(String excelPath,String sheetName) throws IOException
{
	FileInputStream fis=new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(fis);
	int rowCount=wb.getSheet(sheetName).getLastRowNum();
	return rowCount;
}

public void setCellData(String excelPath,String sheetName, String data, int row,int cell) throws Throwable
{
	FileInputStream fis=new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
	
	FileOutputStream fos=new FileOutputStream(excelPath);
	wb.write(fos);
}


}

