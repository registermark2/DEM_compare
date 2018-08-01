package tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	
	public  ArrayList<ArrayList<String>> readExcel(String path) throws InvalidFormatException, IOException  { 
		
		ArrayList<ArrayList<String>> excelValueClass = new ArrayList<ArrayList<String>>();
		
		//1.Read Excel File into workbook
		//利用FileInputStream讀取該路徑之檔案，".\\"為根目錄之意思
		FileInputStream inp = new FileInputStream(path);//test excel table	 
		//利用wb承接FileInputStream所讀取的檔案
		XSSFWorkbook wb = new XSSFWorkbook(inp);
//        inp.close();
 
        //2.get wb sheet(0)
        XSSFSheet sheet = wb.getSheetAt(0);
        //get total num of row
        int rowLength = sheet.getLastRowNum();
        String sheetName = sheet.getSheetName();
//        System.out.println(sheetName);
        //3.get wb row
        XSSFRow row = sheet.getRow(0);
//        System.out.print("\nrow:\n"+row);
        //total num of cols(cell)
        int cellLength = row.getLastCellNum();
        //4.get wb cols(cell
        XSSFCell cell = row.getCell(0);
         
        //this loop will scane all info at each cell
        for (int i = 1; i <= rowLength; i++) {
        	ArrayList<String> excelValueStation = new ArrayList();
        	//get each row  
            XSSFRow row1 = sheet.getRow(i);
            for (int j = 1; j < cellLength; j++) {
                //get each cols  
                XSSFCell cell1 = row1.getCell(j);
          
                excelValueStation.add(cell1.toString());
            }
            excelValueClass.add(excelValueStation);
            
        }
//        System.out.print(excelValueClass);
//        for(int i =0;i<excelValueClass.size();i++) {
//        	System.out.print("\n"+excelValueClass.get(i));
//        }
		return excelValueClass;
	}
}
