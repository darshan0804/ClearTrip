package com.autodisk.genriclibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Darshan M R
 *
 */
public class ExcelLib {

	String filepath="./TestData/TestScriptForClearTrip.xlsx";
	
	public String GetDataFromExcel(String sheetName, int rowNum, int colNum) throws Throwable, IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
				Workbook wb = WorkbookFactory.create(fis);
				
				Sheet sh = wb.getSheet(sheetName);
		
				Row rn = sh.getRow(rowNum);
		
				return	rn.getCell(colNum).getStringCellValue();
	
		
		
		
	}
	
	
	
	
	
	
	
}
