package com.demoactitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
		public String getPropertyData(String key) throws IOException {
			FileInputStream fis=new FileInputStream("./data/command.property");
			Properties p=new Properties();
			p.load(fis);
			String data=p.getProperty(key);
			return data;
		}
		public String getExcelData(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream("./data/testscript2.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			String data=wb.getSheet("SheetName").getRow(row).getCell(cell).getStringCellValue();
			return data;
		}
		public String setExcelData(String Sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream("./data/testscript2.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
		    wb.getSheet("Sheetname").getRow(row).getCell(cell).setCellValue(value);
			FileOutputStream fos=new FileOutputStream("./data/testscript2.xlsx");
			wb.write(fos);
			wb.close();
			return value;
		}
}
