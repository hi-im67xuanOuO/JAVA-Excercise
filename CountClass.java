public class CountClass{
	public static void main(String[] args) {
		//算術運算子之二
		//
		// int a=1;
        // System.out.println("a :"+a);

		// a=a+1;
		// System.out.println("a=a+1 :"+a); 

		// a+=1;                                                                                                                                                                                                                                                                                                                                         
		// System.out.println("a+=1 :"+a);

		// a=1;
		// System.out.println("a :"+a);

		// a=a*2;
		// System.out.println("a=a*2 :"+a);

		// a*=2;
		// System.out.println("a*=2 :"+a);

		int a=1;
		a++;
		System.out.println("a++ :"+a);

		++a;
		System.out.println("++a :"+a);
		System.out.println("a++在同一行 ："+ a++);
        System.out.println("a :"+a);
		System.out.println("++a在同一行 ："+ ++a);

		//int b=1;
		//if(b++>1)
		// System.out.println("b>1");
		//b++=1不會大於1所以不會印出來
		//if(++b>1)
		   //System.out.println("b>1");
	}
}