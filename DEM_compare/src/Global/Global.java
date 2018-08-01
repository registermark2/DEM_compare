package Global;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Global {
	public String test ="C:/Users/Andy/Desktop/ASCII-20180531T115049Z-001/dm1d0017.asc";
	public String test2 ="C:/Users/Andy/Desktop/ascii_all.text";
	public String test_excel_table = "C:/Users/Andy/Desktop/abc.xlsx";
	public String excel_value_table = "C:/Users/Andy/Desktop/Iot Observation .xlsx";
	public String asciiFile_location= "C:/Users/Andy/Desktop/ASCII-20180531T115049Z-001/";
	public String excel_path = "C:/Users/Andy/Desktop/test3v3.xlsx";
	
	
	
	public String[][] Sensor = { 
			{ "安中五站"		, "162367.190368440000000", "2551199.148974450000000" },
			{ "海佃四站"		, "165662.855498722000000", "2551505.057514020000000" },
			{ "海佃三段站"		, "166352.509038435000000", "2549777.889128630000000" },
			{ "朝皇宮站"		, "166393.082894916000000", "2548985.283620740000000" },
			{ "龍金站"		, "169920.008159805000000", "2551706.181965540000000" },
			{ "安中站"		, "167329.839003952000000", "2549390.511627280000000" },
			{ "頂安站"		, "168461.012654870000000", "2549258.957237000000000" },
			{ "安和站"		, "169782.704140448000000", "2549447.958468440000000" },
			{ "溪頂寮站"		, "169520.714143787000000", "2547951.882686490000000" },
			{ "裕農路裕義路口"	, "172977.183568405000000", "2543479.676934840000000" } };
	public String[][] Sensor2 = {
			{"安中五站"		,	"162443.8311",	"2551162.0524"},
			{"海佃四站"		,	"165640.3824",	"2551509.1404"},
			{"海佃三段站"		,	"166349.1283",	"2549757.3205"},
			{"朝皇宮站"		,	"166392.8801",	"2548995.3546"},
			{"龍金站"			,	"169922.9723",	"2551708.0487"},
			{"安中站"			,	"167343.0354",	"2549408.7745"},
			{"頂安站"			,	"168471.3890",	"2549254.7808"},
			{"安和站"			,	"169782.6996",	"2549442.6696"},
			{"溪頂寮站"		,	"169520.5048",	"2547951.9182"},
			{"裕農路裕義路口"	,	"172963.1527",	"2543464.8770"}		
	};

}
