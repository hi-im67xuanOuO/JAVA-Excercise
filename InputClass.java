import java.util.Scanner;
public class InputClass{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你的幸運數字：");
		//sc.nextInt();

		int lucky_number=sc.nextInt();
		System.out.println("你的幸運數字="+lucky_number);

		System.out.println("請問圓周率是多少？");
		double answer=sc.nextDouble();
		if(answer==3.14)
			System.out.println("答對了！你好棒棒");
		else
			System.out.println(answer+"這答案你認真！？");
	}
}