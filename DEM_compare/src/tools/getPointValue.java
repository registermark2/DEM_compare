package tools;

import java.io.IOException;
import java.util.ArrayList;

import AsciiTool.getAscii;

public class getPointValue {
	//To get one point
	public String getPointValue(String path) throws IOException {
		
		getAscii gA = new getAscii(path);//give path use getAscii class to get Ascii
		String[][] tempSensor = new Global.Global().Sensor2;//get sensor coordinate
		String tempncoorcol = gA.getTagyllcorner();//from getAscii class get Ycorner
		String tempncoorrow = gA.getTagxllcorner();//from getAscii class get Xcorner
		String tempvalue;
		

// 		sensor station locattion dim the origin location   
		String tempCellsize = gA.getCellsize();
		String tempTagrows = gA.getTagnrows();
		Double dCellsize = Double.valueOf(tempCellsize);
		Double dTagrows = Double.valueOf(tempTagrows);
		Double tempcal = dCellsize*dTagrows;
		Double calcuX =  Double.valueOf(tempSensor[2][1])- Double.valueOf(tempncoorrow);
//		System.out.print("\ncalcuX: "+calcuX);
		Double calcuY =  (Double.valueOf(tempncoorcol)+tempcal) -Double.valueOf(tempSensor[2][2]);
//		System.out.print(" \ntempcal:"+tempcal);
//		System.out.print(" \ncalcuY:"+calcuY);
//		System.out.print("\n tempSensor"+tempSensor[2][2]);
//			get cellsize
		String tempcellsize= gA.getCellsize();
//			cellsize change to double
		Double cellsize = Double.valueOf(tempcellsize);
		//show the ncellsize 
			
		String tempncols = gA.getTagncols();
		String temprows = gA.getTagnrows();
//		
		Double ncols = Double.valueOf(tempncols);
		Double rows = Double.valueOf(temprows);
			
		Double m = 20.0000;
			
		Double fx = div(calcuX,m);
//		System.out.print("\nfx: "+fx);
		Double fy = div(calcuY,m);
//		System.out.print("\nfy: "+fy);
		
		Double fcol = Double.valueOf(gA.getTagncols());
//		System.out.print("\nfcol: "+fcol);
		
		Double frow = Double.valueOf(gA.getTagnrows());
//		System.out.print("\nfrow: "+frow);
		
		
//		Double temp = (fy-frow);
		int i =fy.intValue();
//		System.out.print("\ni:"+i);
		int w = fx.intValue();
		
		tempvalue = gA.getAsciiContent().get(i-1).get(w-1);
		
		return tempvalue;
		
	}
	
	//To get one point all the time
	public String getPointValue(String path,int station) throws IOException {
		
		getAscii gA = new getAscii(path);//give path use getAscii class to get Ascii
		String[][] tempSensor = new Global.Global().Sensor2;//get sensor coordinate
		String tempncoorcol = gA.getTagyllcorner();//from getAscii class get Ycorner
		String tempncoorrow = gA.getTagxllcorner();//from getAscii class get Xcorner
		String tempvalue;
		

// 		sensor station locattion dim the origin location   
		String tempCellsize = gA.getCellsize();
		String tempTagrows = gA.getTagnrows();
		Double dCellsize = Double.valueOf(tempCellsize);
		Double dTagrows = Double.valueOf(tempTagrows);
		Double tempcal = dCellsize*dTagrows;
		Double calcuX =  Double.valueOf(tempSensor[station][1])- Double.valueOf(tempncoorrow);
//		System.out.print("\ncalcuX: "+calcuX);
		Double calcuY =  (Double.valueOf(tempncoorcol)+tempcal) -Double.valueOf(tempSensor[station][2]);
//		System.out.print(" \ntempcal:"+tempcal);
//		System.out.print(" \ncalcuY:"+calcuY);
//		System.out.print("\n tempSensor"+tempSensor[station][2]);
//			get cellsize
		String tempcellsize= gA.getCellsize();
//			cellsize change to double
		Double cellsize = Double.valueOf(tempcellsize);
		//show the ncellsize 
			
		String tempncols = gA.getTagncols();
		String temprows = gA.getTagnrows();
//		
		Double ncols = Double.valueOf(tempncols);
		Double rows = Double.valueOf(temprows);
			
		Double m = 20.0000;
			
		Double fx = div(calcuX,m);
//		System.out.print("\nfx: "+fx);
		Double fy = div(calcuY,m);
//		System.out.print("\nfy: "+fy);
		
		Double fcol = Double.valueOf(gA.getTagncols());
//		System.out.print("\nfcol: "+fcol);
		
		Double frow = Double.valueOf(gA.getTagnrows());
//		System.out.print("\nfrow: "+frow);
		
		
//		Double temp = (fy-frow);
		int i =fy.intValue();
//		System.out.print("\ni:"+i);
		int w = fx.intValue();
		
		tempvalue = gA.getAsciiContent().get(i-1).get(w-1);
		
		return tempvalue;
		
	}

	//To get around value
	public ArrayList<String> getPointValue_around_closer(String path,int station,int grid) throws IOException {
		
		getAscii gA = new getAscii(path);//give path use getAscii class to get Ascii
		String[][] tempSensor = new Global.Global().Sensor2;//get sensor coordinate
		String tempncoorcol = gA.getTagyllcorner();//from getAscii class get Ycorner
		String tempncoorrow = gA.getTagxllcorner();//from getAscii class get Xcorner
		String tempvalue;
		

// 		sensor station locattion dim the origin location   
		String tempCellsize = gA.getCellsize();
		String tempTagrows = gA.getTagnrows();
		Double dCellsize = Double.valueOf(tempCellsize);
		Double dTagrows = Double.valueOf(tempTagrows);
		Double tempcal = dCellsize*dTagrows;
		Double calcuX =  Double.valueOf(tempSensor[station][1])- Double.valueOf(tempncoorrow);
//		System.out.print("\ncalcuX: "+calcuX);
		Double calcuY =  (Double.valueOf(tempncoorcol)+tempcal) -Double.valueOf(tempSensor[station][2]);
//		System.out.print(" \ntempcal:"+tempcal);
//		System.out.print(" \ncalcuY:"+calcuY);
//		System.out.print("\n tempSensor"+tempSensor[station][2]);
//			get cellsize
		String tempcellsize= gA.getCellsize();
//			cellsize change to double
		Double cellsize = Double.valueOf(tempcellsize);
		//show the ncellsize 
			
		String tempncols = gA.getTagncols();
		String temprows = gA.getTagnrows();
//		
		Double ncols = Double.valueOf(tempncols);
		Double rows = Double.valueOf(temprows);
			
		Double m = 20.0000;
			
		Double fx = div(calcuX,m);
//		System.out.print("\nfx: "+fx);
		Double fy = div(calcuY,m);
//		System.out.print("\nfy: "+fy);
		
		Double fcol = Double.valueOf(gA.getTagncols());
//		System.out.print("\nfcol: "+fcol);
		
		Double frow = Double.valueOf(gA.getTagnrows());
//		System.out.print("\nfrow: "+frow);
		
		
//		Double temp = (fy-frow);
		int i =fy.intValue();
//		System.out.print("\ni:"+i);
		int w = fx.intValue();
		
		ArrayList<String> store_value = new ArrayList();//To store value about 3x3 
		for(int run_col=0;run_col<grid*2+1;run_col++) {
			for(int run_row=0;run_row<grid*2+1;run_row++){
				store_value.add(gA.getAsciiContent().get(i-1-grid+run_col).get(w-1-grid+run_row));
			}
		}
		return store_value;
		
	}

	public ArrayList<String> getPointValue_around_closer2x2(String path,int station,int grid) throws IOException {
		
		getAscii gA = new getAscii(path);//give path use getAscii class to get Ascii
		String[][] tempSensor = new Global.Global().Sensor2;//get sensor coordinate
		String tempncoorcol = gA.getTagyllcorner();//from getAscii class get Ycorner
		String tempncoorrow = gA.getTagxllcorner();//from getAscii class get Xcorner
		String tempvalue;
		

// 		sensor station locattion dim the origin location   
		String tempCellsize = gA.getCellsize();
		String tempTagrows = gA.getTagnrows();
		Double dCellsize = Double.valueOf(tempCellsize);
		Double dTagrows = Double.valueOf(tempTagrows);
		Double tempcal = dCellsize*dTagrows;
		Double calcuX =  Double.valueOf(tempSensor[station][1])- Double.valueOf(tempncoorrow);
//		System.out.print("\ncalcuX: "+calcuX);
		Double calcuY =  (Double.valueOf(tempncoorcol)+tempcal) -Double.valueOf(tempSensor[station][2]);
//		System.out.print(" \ntempcal:"+tempcal);
//		System.out.print(" \ncalcuY:"+calcuY);
//		System.out.print("\n tempSensor"+tempSensor[station][2]);
//			get cellsize
		String tempcellsize= gA.getCellsize();
//			cellsize change to double
		Double cellsize = Double.valueOf(tempcellsize);
		//show the ncellsize 
			
		String tempncols = gA.getTagncols();
		String temprows = gA.getTagnrows();
//		
		Double ncols = Double.valueOf(tempncols);
		Double rows = Double.valueOf(temprows);
			
		Double m = 20.0000;
			
		Double fx = div(calcuX,m);
//		System.out.print("\nfx: "+fx);
		Double fy = div(calcuY,m);
//		System.out.print("\nfy: "+fy);
		
		Double fcol = Double.valueOf(gA.getTagncols());
//		System.out.print("\nfcol: "+fcol);
		
		Double frow = Double.valueOf(gA.getTagnrows());
//		System.out.print("\nfrow: "+frow);
		
		
//		Double temp = (fy-frow);
		int i =fy.intValue();
//		System.out.print("\ni:"+i);
		int w = fx.intValue();
		
		ArrayList<String> store_value = new ArrayList();//To store value about 3x3 
		for(int run_col=0;run_col<grid*2+1;run_col++) {
			for(int run_row=0;run_row<grid*2+1;run_row++){
				store_value.add(gA.getAsciiContent().get(i-1-grid+run_col).get(w-1-grid+run_row));
			}
		}
		return store_value;
		
	}
	
	

	// calculation the distance of station point and distance of original point 
	public static Double div(double a, double b) { 
		double x = a / b; 
//      System.out.println(" \n"+a + "/" + b + " = " + x); 
		return Math.ceil(x);
	} 

}
