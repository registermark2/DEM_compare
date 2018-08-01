package TEST;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import AsciiTool.getAscii;
import Global.Global;
import tools.getFileAllName;
import tools.getPointValue;
import tools.readExcel;

public class TEST_control {
	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		ArrayList<ArrayList<String>> Arraylist_value_1h_sensor= new ArrayList();
		ArrayList<ArrayList<String>> Arraylist_value_1h_class = new ArrayList();
		
		Double tempCal;
		
//		readExcel rE = new readExcel();
//		Arraylist_value_1h_sensor = rE.readExcel("C:/Users/Andy/Desktop/sensor_value.xlsx");
		//"C:\Users\Andy\Desktop\Iot Observation .xlsx"
//		
//		------show the data from excel-----------
//		for(int i=0;i<Arraylist_value_1h_sensor.size();i++)
//			System.out.print("\n"+Arraylist_value_1h_sensor.get(i));
//		
		getFileAllName gA = new getFileAllName();
		System.out.print(gA.getFileAllName(new Global().asciiFile_location));
		
		
		
//		------TO compare the data-------------
		
//		getPointValue gP = new getPointValue();
//		gP.getPointValue_around_closer(new Global().test,3,1);
//		System.out.print(gP.getPointValue_around_closer(new Global().test,3,1));
//		
		
		
//		for(int i=1;i<Arraylist_value_1h.size();i++) {
//			ArrayList<String> Arraylist_temp = new ArrayList();
//			System.out.print("i:");
//			for(int w =0;w<21;w++) {
//				
//				tempCal = (Double.parseDouble(Arraylist_value_1h.get(i).get(w)));
//				System.out.print(" "+tempCal);
//				Arraylist_temp.add(tempCal.toString());
//			}
//			System.out.print("\n"+i+" "+Arraylist_temp+"\n");
//			Arraylist_value_1h.add(Arraylist_temp);
//		}
//		
//		for(int x =0 ;x<Arraylist_value_1h.size();x++)
//			System.out.print("\n"+Arraylist_value_1h.get(x));
//		
		
		
		
	}
}
