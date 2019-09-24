package programs;

public class PowersOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int val = Integer.parseInt(args[0]);
		if(Integer.parseInt(args[0])<31 && val>0) {
		
		System.out.println("Powers Of Two: ");
		
		for(int i=1;i<=val;i++) 
		{
			System.out.println("2 to the power "+i+" = "+(int)Math.pow(2, i));
			
		}
		}
		else 
		{
			System.out.println("Enter a value less than 31");
		}
	}

}
