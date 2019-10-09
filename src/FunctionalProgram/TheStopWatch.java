package programs;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TheStopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter start : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(s.contentEquals("start")) {
		Instant start = Instant.now();
		System.out.println("Enter stop : ");
		String t = scan.next();
		if(t.contentEquals("stop")) {
		Instant stop = Instant.now();
		System.out.println("Time elapsed is:");
		
		long time_elapsed = Duration.between(start, stop).getSeconds();
		System.out.println(time_elapsed+" Seconds");
		}
		else 
		{
			System.out.println("Enter stop");
		}
		}
		else 
		{
			System.out.println("Enter start.....");
		}
		
		
	}

}
