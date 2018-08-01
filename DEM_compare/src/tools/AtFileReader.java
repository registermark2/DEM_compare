package tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AtFileReader {

		
	public ArrayList<String> ffilereader(String file_location) throws IOException{
		ArrayList  al = new ArrayList<String>();//claim a arraylist
		
		BufferedReader br = new BufferedReader(new FileReader(file_location));//input a file with path
		
		String  temp;
		while ((temp = br.readLine())!=null) {
			al.add(temp);
//			System.out.println(temp);// print to check if file input 
		}
		br.close();
		return al;
	}
	
	
}
