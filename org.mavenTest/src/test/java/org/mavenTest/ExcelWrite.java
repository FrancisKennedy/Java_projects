package org.mavenTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\soft\\excel.xlsx");
		FileOutputStream stream = new FileOutputStream(file);
		Workbook wb = new XSSFWorkbook();
		Sheet createSheet = wb.createSheet();
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Maven FrameWork Class");
		System.out.println(createCell);
		wb.write(stream);		
	}

}
