import java.util.Scanner;
public class try2{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a number.");
		int Score = sc.nextInt();

		
		if(Score>0 && Score<=59)
		{
			System.out.println("F");
		}

		else if(Score>=60 && Score<=69)
		{
			System.out.println("C");
		}

		else if(Score>=70 && Score<=79)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("A");
		}




	}
}