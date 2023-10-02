package com.demoactitime.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class genericUsingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		f.setExcelData("Sheet1",0,1,"skipped");
		System.out.println(f.getExcelData("Sheet1",0,1));
	}

}
