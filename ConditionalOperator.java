public class ConditionalOperator{
	//ConditionalOperator條件運算子
	//&&並且,||或,!並非
	//1. 針對符號左方和右方的兩個條件，進行"並且","或","並非"的判斷
	//2. 回傳boolean值 true,false
	public static void main(String[] args) {
		int a = 100;
		double b = 100.0;
		int c = 100;
		System.out.println("true && false :"+(true && false) );
		System.out.println("a==b && a!=c :"+(a==b && a!=c) );
		System.out.println("a==b && b>c :"+(a==b && b>c) );
		System.out.println("a==b || b>c :"+(a==b || b>c) );
		System.out.println("a==b || b>c || c>0 :"+(a==b || b>c || c>0) );

		System.out.println("!true :"+(!true) );
		System.out.println("!false && false :"+(!false && false) );
		System.out.println("!false && true :"+(!false && true) );
		System.out.println("!(false && true) :"+(!(false && true)) );
		System.out.println("!(false || true) :"+(!(false || true)) );
		System.out.println("!true && true :"+(!true && true) );
	}
}