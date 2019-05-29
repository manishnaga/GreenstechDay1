package org.sample.testexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Createxcel {
	public static void main(String[] args) {
		File loc=new File("C:\\\\Users\\\\Manikandan\\\\eclipse-workspace\\\\Day1greenstech\\\\Mavnsample\\\\Excel\\\\hello.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("sheet1");
		Row r = s.createRow(0);
		Cell c= r.createCell(0);
		c.setcellvalue("java");
		FileOutputStream o=new FileOutputStream(loc);
		w.write(o);
		
		
	}

}
