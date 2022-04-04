package org.mavenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\soft\\excel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet("sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String cellvalue = cell.getStringCellValue();
		int celltype = cell.getCellType();
		
		if (cellvalue.equals("Maven Testing") ) {
			cell.setCellValue("Java Selenium Maven Framework class");
			System.out.println(cell);
		}
		FileOutputStream stream1 = new FileOutputStream(file);
		wb.write(stream1);
		
	}
}
