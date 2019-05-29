package org.sample.testexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltask {
	public static void main(String[] args) throws IOException {
		//file loc
		/*File loc=new File("C:\\\\Users\\\\Manikandan\\\\eclipse-workspace\\\\Day1greenstech\\\\Mavnsample\\\\Excel\\\\hello.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("sheet1");
		Row r = s.createRow(0);
		Cell c= r.createCell(0);
		c.setCellValue("java");
		FileOutputStream o=new FileOutputStream(loc);
		w.write(o);
		System.out.println("donee");*/	
		File loc=new File("C:\\Users\\Manikandan\\eclipse-workspace\\Day1greenstech\\Mavnsample\\Excel\\New Microsoft Excel Worksheet.xlsx");
		//convert object
		FileInputStream stream=new FileInputStream(loc);
		//workbook
		Workbook w=new XSSFWorkbook(stream);
		//sheet
		Sheet s=w.getSheet("Sheet1");
	    Row r = s.getRow(2);
	    Cell c = r.getCell(1);
	    String name = c.getStringCellValue();
	    if(name.equals("thuraipakkam")) {
	    	c.setCellValue("chennai");
	    }
	    FileOutputStream o=new FileOutputStream(loc);
	    w.write(o);
	    System.out.println("donee....");
		//Rows
		/*for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r=s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			//System.out.println(c);
			//1-text, 0-number
			int type = c.getCellType();
			if(type==1) {
				String name = c.getStringCellValue();
				System.out.println(name);
			}
			if(type==0) {
				if(DateUtil.isCellDateFormatted(c)) {
					Date date = c.getDateCellValue();
					SimpleDateFormat s1=new SimpleDateFormat("dd-MM-yyyy");
					String name = s1.format(date);
					System.out.println(name);
				}else {
					//double d = c.getNumericCellValue();
			//double to long
				//long l=(long)d;
		    //long to string
				String name=String.valueOf((long)c.getNumericCellValue());
				System.out.println(name);
			}
			}
		}
		}
	}
		}*/
	}
}

