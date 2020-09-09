public class ArithmaticOperator{
	//ArithmeticOperator算術運算子
	//+加,-減,*乘,/除,%顯示餘數,()
	public static void main(String[] args) {
		int a = 40;
		int b = 12;
		int c = 3;
		double d = 3.0;
		int f = -5;
		System.out.println(a+b);
		System.out.println(a+f);
		System.out.println(a-c);
		System.out.println(a/c);//因為位元限制，電腦只會出現整數部分
		System.out.println(b/c);
		System.out.println(a%c);
		System.out.println(b%c);
		System.out.println(b*c);
	}
}