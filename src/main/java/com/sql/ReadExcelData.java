package com.sql;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcelData {
	
	public static  String getparticularCell() throws InvalidFormatException,IOException {
	File file = new File("C:\\Users\\PRABHAKARAM\\3D Objects\\Book11.xlsx");
	Workbook book=new XSSFWorkbook(file);
	
	Sheet Sheet=book.getSheetAt(1);
	
	Row row=Sheet.getRow(1);
	
	Cell cell=row.getCell(2);
	
	
	DataFormatter dataformat=new DataFormatter();
	String data= dataformat.formatCellValue(cell);
	System.out.println();
	return data; 
	}  
	
	private void getparticularcellmultiplerow() {		
		
	}  
	
	private void getAllData() {	
		
	}
	
	

		

	
	public static void main(String[] args) throws InvalidFormatException,IOException {
		
		ReadExcelData R = new ReadExcelData(); 
			
			ReadExcelData.getparticularCell(); 
				 }
			
		
		}
	
	
			 
			
			
			
		
	
	
	
	
	
	



