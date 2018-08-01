package tools;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class getAscii_4x4_around_compare {
	
	Compare_value_getMin cgm = new Compare_value_getMin();
	Compare_value_getMin_4x4 c4m = new Compare_value_getMin_4x4();
	ArrayList<String> Compare_final_value = new ArrayList();
	
	public  ArrayList<String> getAscii_4x4_around_compare(ArrayList<ArrayList<String>> Store_station_sersor_value,ArrayList<String> Compare_station_value, int w, int i) throws InvalidFormatException, IOException {
		for(int t =0;t<6;t+=5) {
			
			for(int a=0;a<2;a++) {
				ArrayList<String> StoreValue_by_two = new ArrayList(); //reNew array
				
			
				for(int b=0;b<4;b++) {
					StoreValue_by_two.add(Compare_station_value.get(t+b+a));
					StoreValue_by_two.add(Compare_station_value.get(t+b+5+a));
					StoreValue_by_two.add(Compare_station_value.get(t+b+10+a));
					StoreValue_by_two.add(Compare_station_value.get(t+b+15+a));
				
				}

				System.out.print("\n內部要比較的值:"+StoreValue_by_two);
				int index_min = c4m.compareValue_getMin(Store_station_sersor_value, StoreValue_by_two, w, i);
						
				Compare_final_value.add(StoreValue_by_two.get(index_min));			
//				System.out.print("比較完的值:"+Compare_final_value);
			}
		}
		
		return Compare_final_value;
	}
	
}
