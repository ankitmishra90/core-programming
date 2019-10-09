package Algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Util {
	public static boolean leapYear(int year) {

		if (year % 4 == 0 && year % 100 != 00 && year % 400 == 0) {
			return false;
		} else {
			return false;
		}
	}
	
	public static String [] readFromFile() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("value.txt"));
		String str=br.readLine();
		String[] value=str.split(",");
		return value;
		
	}
	

}
