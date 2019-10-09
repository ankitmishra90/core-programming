package Stock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockReport {
	public static void write(ModelStock ms) throws Exception {
		JSONObject jo = new JSONObject();
		jo.put("stock", "report");
		jo.put("number of share", ms.getShare());
		jo.put("share price", ms.getPrice());
		JSONArray list=new JSONArray();
		list.add(jo);
		
		try(FileWriter file = new FileWriter("AnkitFileName.json"))
		{
			file.write(list.toJSONString());
			file.flush();
			file.close();
			System.out.println("data added in stock");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void read() throws Exception
	{
		long p=0,q=0;
		try
		{
			Object ob=new JSONParser().parse(new BufferedReader(new FileReader("AnkitFileName.json")));
			JSONArray list=(JSONArray)ob;
			for(int i=0;i<list.size();i++)
			{
				JSONObject obj = (JSONObject)list.get(i);
				System.out.println(obj.get("number of share")+"\n"+obj.get("share price"));
				p=(long)obj.get("number of share");
				q=(long)obj.get("share price");
				System.out.println((long)p*q);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}