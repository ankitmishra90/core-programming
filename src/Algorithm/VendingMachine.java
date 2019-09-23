package Algorithm;

import java.util.Scanner;

public class VendingMachine {
		static int index = 1;
		static int count = 0;
		static int change[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };

		public static void main(String[] ar) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Rupies Change:");
			int amount = sc.nextInt();
			giveMeChange(amount, 1000);
		}

		public static void giveMeChange(int rs, int notes) {
			int no_of_notes = rs / notes;
			if (no_of_notes > 0) {
				count = count + no_of_notes;
			}
			int dec = notes * no_of_notes;
			int balance = rs - dec;
			if (no_of_notes > 0) {
				System.out.println(no_of_notes + " notes of" + notes);
			}
			if (index < 8) {
				giveMeChange(balance, change[index++]);
			}
		}
	}
