package tools;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Compare_value_getMin {
	static String input_excelPath = "C:/Users/Andy/Desktop/sensor_value.xlsx";
	
	public int compareValue_getMin(ArrayList<ArrayList<String>> Store_station_sersor_value2,ArrayList<String> StoreValue_by_around, int w, int i ) throws InvalidFormatException, IOException {
		ArrayList<ArrayList<String>> Store_station_sersor_value= new ArrayList<ArrayList<String>>();
		readExcel rE = new readExcel();
		Store_station_sersor_value = rE.readExcel(input_excelPath);
		
		
		Double targetWidth = Double.valueOf(Store_station_sersor_value.get(w).get(i));
		System.out.print("\ntargetWidth/sensorValue: "+targetWidth);//show sensor value
		Double width = Double.valueOf(StoreValue_by_around.get(0));
//		System.out.print("\nwidth:"+width);
		Double mindiff = Math.abs(targetWidth - width);
//		System.out.print("\nmindiff:"+mindiff);
		
		int minDiff_index = 0;
//		The for times is decide to number of ascii
		for(int compare_number=0;compare_number<StoreValue_by_around.size();compare_number++) { //To compare the around 
		
			Double target = Double.valueOf(Store_station_sersor_value.get(w).get(i));
			Double width_temp = Double.valueOf(StoreValue_by_around.get(compare_number));
					
			Double diff = Math.abs(target - width_temp);
//			System.out.print("\ndiff:"+diff);
			if(diff < mindiff) {				
				mindiff = diff;	
//				System.out.print("\n第"+minDiff_index+"個   ");
//				System.out.print("\n進來的最小值:"+mindiff+"  ");
				minDiff_index = compare_number;
				System.out.print("\n取到的值:  "+StoreValue_by_around.get(minDiff_index));				
			}	
		}
		System.out.print("\n最後取:"+minDiff_index);
		return minDiff_index;
	}
}
