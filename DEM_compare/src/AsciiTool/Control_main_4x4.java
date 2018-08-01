package AsciiTool;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Global.Global;
import TEST.test_write_new_sheet;
import tools.Compare_value_getMin;
import tools.getAscii_2x2_around_closer;
import tools.getAscii_4x4_around_compare;
import tools.getFileAllName;
import tools.getPathCombine;
import tools.getPointValue;
import tools.readExcel;

public class Control_main_4x4 {

	static int grid = 2;// if 2 -->>5x5 around    , if 1 --->> 3x3 around . if grid = 3 --->7x7 use run 4x4 closer
	static String asciiFile_File_Path = new Global().asciiFile_location;
	static String input_excelPath = "C:/Users/Andy/Desktop/sensor_value.xlsx";
	static String output_excelPath = "C:/Users/Andy/Desktop/不確定分析/0712各站比較/頂安站.xlsx"; 
	static String excelSheetName = "4x4compare_0719_頂和站";
	
	public static void main(String[] args) throws IOException, InvalidFormatException {
		// TODO Auto-generated method stub
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
		for(int station_number = 6;station_number<7;station_number++) {
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
//				System.out.print("\nStore_station_number: "+i+"個  "+ Store_station_value);
//				--------get 2x2 range to store a new array(StoreValue_by_two)-----------
//				
//	-------------------------------------------------------------------------------------------
				getAscii_4x4_around_compare g4 = new getAscii_4x4_around_compare();
				Store_compare_value =g4.getAscii_4x4_around_compare(Store_station_sersor_value,Store_station_value, station_number, i);
						
						
				System.out.print("\n比較完的數應有4個: " + Store_compare_value);
				Finall_value.add(Store_compare_value);
			}
			for(int count=0;count<Finall_value.size();count++) {
				System.out.print("\n有幾組比較完的數字: "+"第"+count+Finall_value.get(count));
			}
			test.add(Finall_value);
		}
		System.out.print("\ntest 內部數值:"+test);
//		for(int count=0;count<test.size();count++) {
//			System.out.print("\ntest_array: "+test.get(0).get(count));
//		}
//		System.out.print("\n測試:"+test.get(0).get(0));
		//write to excel to draw 
		ts.writeExcel4x4(test,output_excelPath, excelSheetName);
		System.out.print("\n\n");
	}

}
