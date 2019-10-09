package jsonCreate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class serviceImpliments {
public static void write(Model ob) throws Exception
{
	JSONObject obj=new JSONObject();
	obj.put("propertiesName", ob.getName());
	obj.put("price", ob.getPrice());
	obj.put("weight", ob.getWeight());
	
	JSONArray list=new JSONArray();
	list.add(obj);
	try(FileWriter file=new FileWriter("AnkitFileName.json"))
	{
		file.write(list.toJSONString());
		file.flush();
		file.close();
		System.out.println("element is added");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
public static void read()
{
	try
	{
		Object ob=new JSONParser().parse(new BufferedReader(new FileReader("AnkitFileName.json")));
		
	JSONArray array=(JSONArray)ob;//type casting
	JSONObject obj;
	for(int i=0;i<array.size();i++) {
		obj=(JSONObject)array.get(i);
		System.out.println(obj.get("propertiesName")+"\n"+obj.get("price")+"\n"+obj.get("weight"));
	}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
	