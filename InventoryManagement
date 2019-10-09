package InventoryManagement;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManagement {
	static void write() throws Exception
	{
		JSONArray arr=new JSONArray();
		JSONObject ob;
		for(int i=0;i<10;i++)
		{
			ob=new JSONObject();
		ob.put("InventoryFactory" , "Manager");
		Map map=new LinkedHashMap();
		map.put("InventoryPrice1", 70.5);
		map.put("InventoryWeight", 30+"kg");
		ob.put("InventoryManager", map);
		
		arr.add(ob);
		}
		PrintWriter pw=new PrintWriter("AnkitFileName.json");
		pw.write(arr.toJSONString());
		pw.flush();
		pw.close();
	
	}
	
	
	static void read() throws Exception
	{
		Object obj=new JSONParser().parse((new FileReader("AnkitFileName.json")));
		JSONArray arr = (JSONArray)obj;
		JSONObject ob;
		for(int i=0;i<arr.size();i++)
		{
			ob=(JSONObject)arr.get(i);
			System.out.println(ob.get("InventoryFactory"));
		Map map=(Map)ob.get("InventoryManager");
		Iterator<Map.Entry> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry me=itr.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		}
		
		
	}

	public static void main(String[] ar) throws Exception
	{
		write();
		read();
}
}
