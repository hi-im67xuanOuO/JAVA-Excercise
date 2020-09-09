import java.util.Scanner;
public class xMasTree_06170203{
	public static void main(String[] args) {
		System.out.println("請輸入聖誕樹高度：");
		Scanner sc = new Scanner(System.in);
		int Line=sc.nextInt();

		if (Line<=0){
			System.out.println("此數字非在合理範圍！");
		}


		for(int i=1;i<=Line;i++)//用輸入行數Line定義i變數
		{
			for(int j=0;j<=i;j++)//換行 用i定義j變數
			{
			    System.out.println();

				for(int k=1;k<=Line-j;k++)//空格數 用j定義k變數
				{
					System.out.print(" ");
				}
				for(int l=1;l<=1+(j*2);l++)//星號數 用j定義l變數
				{
					System.out.print("*");
				}
			}
		}
	    System.out.println();
	}
}
