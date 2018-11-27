package com.apps.testpackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 

public class WritingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
			  try {
			  // Specify the file path which you want to create or write
			  File src=new File("/Users/saidinesh/workspace/JavaProject/Inputdata/Credentials.xlsx");
			  // Load the file			 
			  FileInputStream fis=new FileInputStream(src);
			   // load the workbook
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			  // get the sheet which you want to modify or create
			   XSSFSheet sh1= wb.getSheetAt(0);
			 // getRow specify which row we want to read and getCell which column
			 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
			 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			// here createCell will create column
			// and setCellvalue will set the value
			 sh1.getRow(0).createCell(2).setCellValue("asfasd");
			 sh1.getRow(1).createCell(2).setCellValue("sdfasd");
			 sh1.getRow(2).createCell(2).setCellValue("sdfasd");
			// here we need to specify where you want to save file
			 FileOutputStream fout=new FileOutputStream(new File("/Users/saidinesh/workspace/JavaProject/Inputdata/Credentials.xlsx"));
			// finally write content 
			 wb.write(fout);
			// close the file
			 fout.close();
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
	}

}
