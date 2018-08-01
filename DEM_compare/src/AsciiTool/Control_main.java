package AsciiTool;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.Finance;

import Global.Global;
import TEST.test_write_new_sheet;

import jdk.nashorn.internal.parser.Token;
import tools.AtFileReader;
import tools.Compare_value_getMin;
import tools.getAscii_2x2_around_closer;
import tools.getAscii_4x4_around_compare;
import tools.getFileAllName;
import tools.getPathCombine;
import tools.getPointValue;
import tools.readExcel;

public class Control_main {
	static int grid = 2;// if 2 -->>5x5 around    , if 1 --->> 3x3 around . if grid=0 ----> station one
	static String asciiFile_File_Path = new Global().asciiFile_location;
	static String input_excelPath = "C:/Users/Andy/Desktop/sensor_value.xlsx";
	static String output_excelPath = "C:/Users/Andy/Desktop/不確定分析/0712各站比較/頂安站.xlsx"; 
	static String excelSheetName = "1x1compare_0713_頂安站";

	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		readExcel rE = new readExcel();
		getFileAllName gF = new getFileAllName();
		test_write_new_sheet ts = new test_write_new_sheet();
		Compare_value_getMin cgm = new Compare_value_getMin();
		ArrayList<String> AsciiStore_temp= new ArrayList(); 
		ArrayList<ArrayList<String>> Store_station_value_all = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> Store_station_sersor_value= new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> Finall_value= new ArrayList<ArrayList<String>>();
		ArrayList<String> Final_Store_value3 = new ArrayList(); 
		
		AsciiStore_temp = gF.getFileAllName(asciiFile_File_Path);//store ascii filename
		Store_station_sersor_value = rE.readExcel(input_excelPath);//readExcel at one 
		
		//w=8 station
		for(int station_number = 3;station_number< 4;station_number++) {
			int cont=0;
			ArrayList<String> Store_station_value = new ArrayList();// Renew the arraylist to store every station value
//			Store_station_value.add(new Global().Sensor2[w][0]);//To store station name at first array location
			System.out.print("\n"+new Global().Sensor2[station_number][0]);
		
			for(int i=0;i<AsciiStore_temp.size();i++) {	
				
				ArrayList<String> Compare_station_value = new ArrayList();
				Compare_station_value.add(new Global().Sensor2[station_number][0]);
				
				String location = asciiFile_File_Path;//getFile path
				String pathToString = new getPathCombine().getPathCombine(location, i);//getAsciiPath
				Store_station_value = new getPointValue().getPointValue_around_closer(pathToString,station_number,grid);//To get value around  9個值
				System.out.print("\nStore_station_number: "+i+"個  "+ Store_station_value);
//				--------get 2x2 range to store a new array(StoreValue_by_two)-----------
//				
//	-------------------------------------------------------------------------------------------
				Compare_value_getMin show_number= new Compare_value_getMin();
				int show =show_number.compareValue_getMin(Store_station_sersor_value,Store_station_value,station_number,i);
//				System.out.print("\n 第"+show+"個");
				Final_Store_value3.add(Store_station_value.get(show));
//				System.out.print("\nStore_station_value_all: " + Final_Store_value3);
//				System.out.print(Store_station_value.size());
			}
//			System.out.print("\n123");
			Finall_value.add(Final_Store_value3);
		}
//		for(int count=0;count<Store_station_value_all.size();count++) {
			System.out.print("\nfinall value: "+Finall_value.get(0));
	
//		}
		//write to excel to draw 
//		ts.writeToExcel(Finall_value,output_excelPath, excelSheetName);
		System.out.print("\n\n");	
	}
}







