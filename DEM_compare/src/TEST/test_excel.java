package TEST;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell; 
import org.apache.poi.hssf.usermodel.HSSFRow; 
import org.apache.poi.hssf.usermodel.HSSFSheet; 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Global.Global;
import tools.readExcel;
public class test_excel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		//test if excel can read and print count
//		readExcel rE = new readExcel();
//		rE.readExcel(new Global().test_excel_table);
		
		//test if excel can write or not
//		test_write_new_sheet ts = new test_write_new_sheet();
//		ts.testn();
		readExcel rE = new readExcel();
		rE.readExcel("C:/Users/Andy/Desktop/Iot_Observation.xlsx");
		
	}
}
