public class BasicClass{
	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("-------變更a=50");

		a=50;
		System.out.println("a:"+a);
		System.out.println("c:"+c);
		System.out.println("-------變更c=c+b");
		c=c+b;
		System.out.println("c:"+c);

		char char1='你';
		char char2='好';
		//char char3=char1+char2;
		System.out.println("char1:"+char1);
		System.out.println("char2:"+char2);
		System.out.println("char1+char2"+char1+char2);
	}
}