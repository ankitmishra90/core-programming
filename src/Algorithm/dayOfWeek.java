package Algorithm;

public class dayOfWeek {
public static void main(String[] ar)
{
	int m=Integer.parseInt(ar[0]);
	int d=Integer.parseInt(ar[1]);
	int y=Integer.parseInt(ar[2]);
	
	
	    int   y0 = y- ((14 -m) / 12);
		int	x = y0 + (y0/4 )- (y0/100) + (y0/400);
		int m0 = m + (12 * ((14 - m) / 12) -2);
		int	d0 = (d + x + 31*m0) / 12 % 7;
		switch(d0)
		{
		case 0:System.out.println("Sunday");
		break;
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wensday");
		break;
		case 4:System.out.println("Thuesday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Suterday");
		break;
		case 7:System.out.println("Suterday");
		break;
		}

}

}
