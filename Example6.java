import java.util.Scanner;
public class Example6{
	public static void main(String[] args) {
		
		int x=3;

		Integer y= new Integer(6);

		Scanner sc = new Scanner(System.in);
		System.out.println("please input a number.");
		int z=sc.nextInt();

		System.out.println("user input number = "+z);
        System.out.println("min="+z);
		//int z=getMin(x,7);
		
		System.out.println("compare:"+y.compareTo(z));

		if(y.compareTo(z)>0)
		{
			System.out.println("I'm larger than you!");
		}

		else if(y.compareTo(z)<0)
		{
			System.out.println("You are larger than me!");
		}


		Integer i= new Integer(100);

		System.out.println("Decimal of 100:"+i.toString());
		System.out.println("Hexidecimal of 100:"+Integer.toHexString(i.intValue()));
		System.out.println("Octal of 100:"+Integer.toOctalString(i.intValue()));
		System.out.println("Binary of 100:"+Integer.toBinaryString(i.intValue()));
	    }
}