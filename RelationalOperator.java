public class RelationalOperator{
	//Relational Operator關係運算子
	//==等於,!=不等於,>大於,<小於,>=大於等於,<=小於等於
	//1. 比較兩者數值並判定兩者之間的大小關係
	//2. 回傳boolean值 true,false
	public static void main(String[] args) {
		int a = 100;
		double b = 100.0;
		int c = 200;
		System.out.println("a==b : "+(a==b) );
		System.out.println("a!=c : "+(a!=c) );
		System.out.println("a>b : "+(a>b) );
		System.out.println("b<c : "+(b<c) );
		System.out.println("a<=b : "+(a<=b) );
		System.out.println("c>=b : "+(c>=b) );
	}
}