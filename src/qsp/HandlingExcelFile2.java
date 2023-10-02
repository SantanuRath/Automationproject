package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile2 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./data/testscript2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("Sheet1").getRow(1).getCell(4).setCellValue("fail");
		FileOutputStream fos=new FileOutputStream("./data/testscript2.xlsx");
		wb.write(fos);
		wb.close();
	}
}
