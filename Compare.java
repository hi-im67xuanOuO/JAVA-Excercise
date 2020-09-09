//劉謦瑄 06170203
import java.util.Scanner;
public class Compare{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number1=sc.nextInt();
		System.out.println("輸入第一個數字："+number1);

		int number2=sc.nextInt();
		System.out.println("輸入第二個數字："+number2);

		int number3=sc.nextInt();
		System.out.println("輸入第三個數字："+number3);

		int a=number1;
		int b=number2;
		int c=number3;


		if (a>b && a>c && b>c) {
			System.out.println("您輸入的最小數字為："+c);
			System.out.println("您輸入的最大數字為："+a);
		
		}else if(a>c && a>b && c>b){
			System.out.println("您輸入的最小數字為："+b);
			System.out.println("您輸入的最大數字為："+a);

		}else if(b>a && b>c && a>c){
			System.out.println("您輸入的最小數字為："+c);
			System.out.println("您輸入的最大數字為："+b);
	
		}else if(b>a && b>c && c>a){
			System.out.println("您輸入的最小數字為："+a);
			System.out.println("您輸入的最大數字為："+b);

		}else if(c>a && c>b && b>a){
			System.out.println("您輸入的最小數字為："+a);
			System.out.println("您輸入的最大數字為："+c);

		}else if(c>a && c>b && a>b){
			System.out.println("您輸入的最小數字為："+b);
			System.out.println("您輸入的最大數字為："+c);

		}

	}
}