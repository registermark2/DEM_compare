package AsciiTool;
import java.io.IOException;
import java.util.ArrayList;

import tools.AtFileReader;
import tools.getPointValue;



public class getAscii {
	ArrayList<String> alGetTag1 = new ArrayList();//getfile arraylist
	ArrayList<String> alGetTag2 = new ArrayList();//getfile arraylist
	
	ArrayList<String> alGetTag3 = new ArrayList();//to store split arraylist 
	ArrayList<String> temp = new ArrayList();//to store split arraylist 
	String[][] tempStringarray;
	String s ="";
	
	ArrayList<ArrayList<String>> alGetTagstore_one = new ArrayList<ArrayList<String>>();
	
	
	//use construc setting
	public getAscii(String path) throws IOException{
		AtFileReader AF = new AtFileReader();
		this.alGetTag1 = AF.ffilereader(path);
		for(int ii=0;ii<alGetTag1.size();ii++) {
			
			ArrayList<String> alGetTag3 = new ArrayList();//to store split arraylist 
			String[] tokens = alGetTag1.get(ii).split("\\s +");
			if(ii<6) {
				for (int i = 0 ;i<tokens.length;i++) {
					alGetTag2.add(tokens[i]);
				}	
			}
			if(ii>=6) {
				for (int u = 0 ;u<tokens.length;u++) {
					if(!tokens[u].equals(s)){
						alGetTag3.add(tokens[u]);
					}
				}
			}
			if(ii>=6)
				alGetTagstore_one.add(alGetTag3);
		}
		
	} 
	public ArrayList<String> getAsciiTag() {
		return alGetTag2;
	}
	public ArrayList<ArrayList<String>> getAsciiContent(){
		return alGetTagstore_one; 
	}
	public void getAsciiTagPrint() {
		for(int i=0 ;i<alGetTag2.size();i++) {
			System.out.print(this.alGetTag2.get(i)+" ");
			if(i%2==1) {
				System.out.print("\n");
			}
		}
	}
	public void getAsciiContentPrint(){
		for(int u=0;u<alGetTag3.size();u++) {
			
			int x=Integer.parseInt(alGetTag2.get(3));//為了換行用的
			if(u%x==0) {
				System.out.println(" 換行數字"+u);
			}
			System.out.print(" "+alGetTag3.get(u));
		}
	}
	public String getTagncols () {
		return this.alGetTag2.get(1);
	}
	public String getTagnrows () {	
		return this.alGetTag2.get(3);	
	}
	public String getTagxllcorner() {
		return this.alGetTag2.get(5);
	}public String getTagyllcorner() {
		return this.alGetTag2.get(7);
	}
	public String getCellsize() {
		return this.alGetTag2.get(9);
	}
	public String getTagNodata_value() {
		return this.alGetTag2.get(11);
	}
}



