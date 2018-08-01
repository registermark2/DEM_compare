package TEST;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test_write_new_sheet {
//	public void testn () {
//
//		String excelFilePath = "C:/Users/Andy/Desktop/abc.xlsx";
//    
//    	try {
//        	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
//        	XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(inputStream);
//
//        	XSSFSheet newSheet = workbook.createSheet("Comments");
//           
//        	
//        	
//        	int rowNum = 0;
//	        System.out.println("Creating excel");
//
//	        for (Object[] datatype : datatypes) {
//	            Row row = sheet.createRow(rowNum++);
//	            int colNum = 0;
//	            for (Object field : datatype) {
//	                Cell cell = row.createCell(colNum++);
//	                if (field instanceof String) {
//	                    cell.setCellValue((String) field);
//	                } else if (field instanceof Integer) {
//	                    cell.setCellValue((Integer) field);
//	                }
//	            }
//	        }
//        	
//
//
//        	FileOutputStream outputStream = new FileOutputStream("C:/Users/Andy/Desktop/abc.xlsx");
//        	workbook.write(outputStream);
//        	System.out.print("end");
//        	workbook.close();
//        	outputStream.close();
//        
//    	} 	catch 	(IOException | EncryptedDocumentException
//            	| InvalidFormatException ex) {
//        	ex.printStackTrace();
//    	}
//	}
	
	
	public void writeToExcel(ArrayList<ArrayList<String>> value,String path,String newSheetName){
		String excelFilePath = path;
	    
    	try {
        	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        	XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(inputStream);

        	XSSFSheet newSheet = workbook.createSheet(newSheetName);
           
        	int rowNum = 0;
	        System.out.println("\nCreating excel");

	        for(int i=0 ;i<value.size();i++) {
	            Row row = newSheet.createRow(i);
	            for (int w =0;w<21;w++){
	                Cell cell = row.createCell(w);
	                    cell.setCellValue(value.get(i).get(w));
	            }
	        }
	        
        	FileOutputStream outputStream = new FileOutputStream(path);
        	workbook.write(outputStream);
        	System.out.print("end");
        	workbook.close();
        	outputStream.close();
        	
    	} 	catch 	(IOException | EncryptedDocumentException
            	| InvalidFormatException ex) {
        	ex.printStackTrace();
    	}
	}
	
	
	public void writeExcel4x4 (ArrayList<ArrayList<ArrayList<String>>> value, String path, String newSheetName ) {
	String excelFilePath = path;
	    
    	try {
        	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        	XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(inputStream);

        	XSSFSheet newSheet = workbook.createSheet(newSheetName);
           
        	int rowNum = 0;
	        System.out.println("\nCreating excel");
	        for(int station=0;station<1;station++) {
		        for(int i=0 ;i<21;i++) {
		            Row row = newSheet.createRow(i);
		            for (int w =0;w<4;w++){
		                Cell cell = row.createCell(w);
		                    cell.setCellValue(value.get(station).get(i).get(w));
		            }
		        }
	        }
	       
        	FileOutputStream outputStream = new FileOutputStream(path);
        	workbook.write(outputStream);
        	System.out.print("end");
        	workbook.close();
        	outputStream.close();
        	
    	} 	catch 	(IOException | EncryptedDocumentException
            	| InvalidFormatException ex) {
        	ex.printStackTrace();
    	}
	}
	
	public void writeExcel2x2 (ArrayList<ArrayList<ArrayList<String>>> value, String path, String newSheetName ) {
		String excelFilePath = path;
	    
    	try {
        	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        	XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(inputStream);

        	XSSFSheet newSheet = workbook.createSheet(newSheetName);
           
        	int rowNum = 0;
	        System.out.println("\nCreating excel");
	        for(int station=0;station<1;station++) {
		        for(int i=0 ;i<21;i++) {
		            Row row = newSheet.createRow(i);
		            for (int w =0;w<4;w++){
		                Cell cell = row.createCell(w);
		                    cell.setCellValue(value.get(station).get(i).get(w));
		            }
		        }
	        }
	       
        	FileOutputStream outputStream = new FileOutputStream(path);
        	workbook.write(outputStream);
        	System.out.print("end");
        	workbook.close();
        	outputStream.close();
        	
    	} 	catch 	(IOException | EncryptedDocumentException
            	| InvalidFormatException ex) {
        	ex.printStackTrace();
    	}
	}
}
