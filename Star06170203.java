import java.util.Scanner;
public class Star06170203{
	public static void main(String[] args) {
        System.out.println("請輸入一正整數（聖誕樹高度）：");
		Scanner sc = new Scanner(System.in);
		int Line =sc.nextInt();

		if (Line<=0){
			System.out.println("此數字非在合理範圍！");
		}

		for (int i=1; i<= Line; i++) {
		 	System.out.println(" ");
		 	
            for (int j=Line; j>i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("*"+" ");
            }
		}
		
		System.out.println();

		

        }
}
//prinln 換行顯示
//print = printf 在同一行顯示