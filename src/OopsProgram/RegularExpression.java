package OopsProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	
private static String name= "<<name>>";
private static String fname= "<<full name>>";
private static String mob= "xxxxxxxxxx";
private static String date="01/01/2016";
public void replace(String name1,String mob1,String date1) throws IOException
{   
	
	//BufferedReader br=new BufferedReader(new FileReader("Ankit.txt"));
	//String message=br.readLine();
	String message=new BufferedReader(new FileReader("Ankit.txt")).readLine();
	Pattern p=Pattern.compile(name);
	Matcher m=p.matcher(message);
	message=m.replaceAll(name1.split(" ")[0]);
	p=Pattern.compile(fname);
	m=p.matcher(message);
	message=m.replaceAll(name1);
	p=Pattern.compile(mob);
	m=p.matcher(message);
	message=m.replaceAll(mob1);
	p=Pattern.compile(date);
	m=p.matcher(message);
	message=m.replaceAll(date1);
	//System.out.println(message);
	String[] str=message.split("[\\.,]");
	for(String s:str) {
		System.out.println(s);
	}
}

public static void main(String[] ar) throws IOException
{
	RegularExpression obj=new RegularExpression ();
	
	obj.replace("Ankit Mishra", "76767655", "01/02/2019");
}
}