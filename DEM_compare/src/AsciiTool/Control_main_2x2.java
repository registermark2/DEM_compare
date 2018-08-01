package AsciiTool;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.FinanceLib;

import Global.Global;
import TEST.test_write_new_sheet;
import tools.Compare_value_getMin;
import tools.getAscii_2x2_around_closer;
import tools.getFileAllName;
import tools.getPathCombine;
import tools.getPointValue;
import tools.readExcel;

public class Control_main_2x2 {

	static int grid = 1;// if 2 -->>5x5 around    , if 1 --->> 3x3 around .
	static String asciiFile_File_Path = new Global().asciiFile_location;
	static String input_excelPath = "C:/Users/Andy/Desktop/sensor_value.xlsx";
	static String output_excelPath = "C:/Users/Andy/Desktop/不確定分析/0712各站比較/安和站.xlsx"; 
	static String excelSheetName = "2x2compare_0713_安和站";
	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stu
				
				readExcel rE = new readExcel();
				getFileAllName gF = new getFileAllName();
				test_write_new_sheet ts = new test_write_new_sheet();
				Compare_value_getMin cgm = new Compare_value_getMin();
				ArrayList<String> AsciiStore_temp= new ArrayList(); 
				
				ArrayList<ArrayList<String>> Store_station_value_all = new ArrayList<ArrayList<String>>();
				ArrayList<ArrayList<String>> Store_station_sersor_value= new ArrayList<ArrayList<String>>();
				ArrayList<ArrayList<String>> Finall_value= new ArrayList<ArrayList<String>>();
				ArrayList<String> Store_compare_value = new ArrayList(); 
				
				ArrayList<ArrayList<ArrayList<String>>> test = new ArrayList();
				
				AsciiStore_temp = gF.getFileAllName(asciiFile_File_Path);//store ascii filename
				Store_station_sersor_value = rE.readExcel(input_excelPath);//readExcel at one 
				
				//w=8 station
				for(int station_number = 7;station_number<8;station_number++) {
					int cont=0;
					ArrayList<String> Store_station_value = new ArrayList();// Renew the arraylist to store every station value
//					Store_station_value.add(new Global().Sensor2[w][0]);//To store station name at first array location
					System.out.print("\n"+new Global().Sensor2[station_number][0]);
				
					for(int i=0;i<AsciiStore_temp.size();i++) {	
						
						ArrayList<String> Compare_station_value = new ArrayList();
						Compare_station_value.add(new Global().Sensor2[station_number][0]);
						
						String location = asciiFile_File_Path;//getFile path
						String pathToString = new getPathCombine().getPathCombine(location, i);//getAsciiPath
						Store_station_value = new getPointValue().getPointValue_around_closer(pathToString,station_number,grid);//To get value around  9個值
//						System.out.print("\nStore_station_number: "+i+"個  "+ Store_station_value);
//						--------get 2x2 range to store a new array(StoreValue_by_two)-----------
//						
//			-------------------------------------------------------------------------------------------
						getAscii_2x2_around_closer g2 = new getAscii_2x2_around_closer();
						Store_compare_value =g2.getAscii_2x2_around_compare(Store_station_sersor_value,Store_station_value, station_number, i);	
						
						System.out.print("\nStore_station_value_all: " + Store_compare_value);
						Finall_value.add(Store_compare_value);
					}
				}
				test.add(Finall_value);
				
				for(int count=0;count<test.size();count++) {
					System.out.print("\ntest_array: "+test.get(count));
				}
				
				System.out.print("\n抓取的值"+Store_station_sersor_value.get(1));
				//write to excel to draw 
				ts.writeExcel2x2(test,output_excelPath, excelSheetName);
		}
}
