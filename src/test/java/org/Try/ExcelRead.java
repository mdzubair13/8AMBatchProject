package org.Try;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\zubee\\eclipse-workspace\\11AmBatch\\TestData\\SampleData.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("Sheet1");

		int phyRows = s.getPhysicalNumberOfRows();
		System.out.println("Physical Rows:" + phyRows);
		Row r = s.getRow(1);

		int phycells = r.getPhysicalNumberOfCells();
		System.out.println("phyical cells:" + phycells);
		//Cell c = r.getCell(4);
	
	}

}
