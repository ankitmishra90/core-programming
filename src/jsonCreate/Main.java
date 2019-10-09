package jsonCreate;

import java.util.Scanner;

public class Main {
	public static Model getResult()
	{   Model ob=new Model();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Name:");
		String name=sc.nextLine();
		ob.setName(name);
		System.out.println("Enter The price:");
		double price=sc.nextDouble();
		ob.setPrice(price);
		System.out.println("Enter The weight:");
		int weight=sc.nextInt();
		ob.setWeight(weight);
		
		return ob;
	}
	
public static void main(String[] ar)
{
	try {
	 serviceImpliments.write(getResult());
	 serviceImpliments.read();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

}