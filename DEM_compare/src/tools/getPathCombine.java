package tools;

import java.util.ArrayList;

import Global.Global;

public class getPathCombine {

	ArrayList<String> AsciiStore_temp= new ArrayList(); //

	public String getPathCombine(String path, int fileNumber) {
		getFileAllName gA = new getFileAllName();
		AsciiStore_temp = gA.getFileAllName(path);// get Ascii file name
		
		StringBuffer buffertemp = new StringBuffer(path);
		buffertemp.append(AsciiStore_temp.get(fileNumber));//combine the string about ascii number 
		String pathToString = buffertemp.toString();//To use the path ,so become to string from stringbuffer
		
		return pathToString;
	}
	
}
