package Algorithm;

public class monthlyPayment {
public static void main(String[] ar)
{
	int P=Integer.parseInt(ar[0]);
	int Y=Integer.parseInt(ar[1]);
	int R=Integer.parseInt(ar[2]);
	int n = 12 *Y;
	float r = R/(12*100);
	float payment=(float) ((P*r)/(1-Math.pow((1+r),(-1*n))));
	System.out.println(payment);//nan not applicable number
}
}

