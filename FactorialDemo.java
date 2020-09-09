import java.util.Scanner;
public class FactorialDemo{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number:");
			int n = sc.nextInt();
			System.out.println("n="+n);
			System.out.println("n!="+factorial(n));
			System.out.println("fib(n)="+fib(n));
		}


	    static int factorial(int x)
	    {
		    if (x==1)
			    return 1;
		    else
			    return x*factorial(x-1);
	    }

	    //變數與同一function中的相同即可

	    
	    static int fib(int n)
	    {
		    if (n==1)
			    return 1;
		    else if(n==2)
			    return 1;
		    else
			    return fib(n-1)+fib(n-2);
	    }

}
//只要同樣function裡的變數相同就好，main區塊裡的只是在指定變數模式