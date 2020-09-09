public class MathMaxMin{
	public static void main(String[] args) {
		System.out.println("亂數random():"+Math.random());
		//0~1的亂數
		int num = (int)(Math.random()*20);
		System.out.println("0~19的亂數："+num);

		int x[] = new int[5];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;
		System.out.println("x[1]="+x[1]);

		
	}
}