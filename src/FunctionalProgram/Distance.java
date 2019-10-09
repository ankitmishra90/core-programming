package programs;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		double square =  (Math.pow(x, 2) + Math.pow(y, 2));
		double out = Math.sqrt(square);
		
		System.out.println(out);

	}

}
