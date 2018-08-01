package tools;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class getFileAllName {
	//  Read and Filter all Filename Extension of file if you want  
	public ArrayList<String> getFileAllName(String path) {
			ArrayList<String> tempString = new ArrayList();
			File folder_address = new File(path);//file address
			String[] Filename_list = folder_address.list();
			//get the "." location  and string array next to end
			for (int i = 0; i < Filename_list.length; i++) {
				int startIndex = Filename_list[i].lastIndexOf('.')+1;
			    int endIndex = Filename_list[i].length();
			    String tempExtension = Filename_list[i].substring(startIndex, endIndex);
				if (tempExtension.equals("asc")) {
//						System.out.println(Filename_list[i]);
						tempString.add(Filename_list[i]); 
				}
			}
//			File folder_address1 = new File("C:/Users/Andy/Desktop/ASCII-20180531T115049Z-001/"+"dm1d0024.asc");//file address	
			return tempString;
	}
}
