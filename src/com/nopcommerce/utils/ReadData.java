package com.nopcommerce.utils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static String Getdata(String file, int row, int col) throws Exception {
		String Filepath = ".//testdata//" + file + ".xlsx";
		FileInputStream instream = new FileInputStream(Filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}

	public static List<String> Getdata(String file, int row) throws Exception {
		String Filepath = ".//testdata//" + file + ".xlsx";
		FileInputStream instream = new FileInputStream(Filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int cellscount = sheet.getRow(row).getLastCellNum();
		List<String> rowdata = new ArrayList<String>();
		for (int i = 0; i < cellscount; i++) {
			String data = sheet.getRow(row).getCell(i).getStringCellValue();
			rowdata.add(data);

		}
		return rowdata;
	}

	public static String[][] Getdata(String file) throws Exception {
		String Filepath = ".//testdata//" + file + ".xlsx";
		FileInputStream instream = new FileInputStream(Filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rows = sheet.getLastRowNum();
		System.out.println("rows:" + rows);
		int cellscount = sheet.getRow(0).getLastCellNum();
		System.out.println("Cells count:" + cellscount);
		String info[][] = new String[rows][cellscount];
		int k = 0, l = 0;
		for (int i = 1; i <= rows; i++) {
			l = 0;

			for (int j = 0; j < cellscount; j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				info[k][l] = data;
				l++;
			}
			k++;
		}
		return info;
	}

	public static String GetLocator(String file, String key) throws Exception {
		String Filepath = ".//Locators//" + file + ".properties";
		FileInputStream instream = new FileInputStream(Filepath);
		Properties pro = new Properties();
		pro.load(instream);
		return pro.getProperty(key);
	}
}
