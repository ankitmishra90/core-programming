package Stock;

import java.util.Scanner;

public class Main {
	public static ModelStock getOutput()
	{
	ModelStock ms=new ModelStock();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The price:");
	long price=sc.nextLong();
	ms.setPrice(price);
	
	System.out.println("Enter The share:");
	long share=sc.nextLong();
	ms.setShare(share);
	
	return ms;
	
}
	
public static void main(String[] ar) throws Exception
{
	try
	{
		StockReport.write(getOutput());
		StockReport.read();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}
