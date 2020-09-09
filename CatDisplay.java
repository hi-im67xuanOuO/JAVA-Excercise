public class CatDisplay{
	public static void main(String[] args) {
		Cat Hello_kitty = new Cat("White");
		//一定要new過才能指定新物件
		//new Cat()的()中有字代表要輸入東西
		System.out.print("Hello_kitty is ");
		System.out.println(Hello_kitty.getCatsColor());
        //也可以打成System.out.println("Hello_kitty is "+Hello_kitty.getCatsColor());

		System.out.print("Hello_kitty is ");
		System.out.println(Hello_kitty.getCatsType());

		System.out.print("Hello_kitty is ");
		System.out.println(Hello_kitty.Age);
		//因為Cat物件裡Age是公開的所以可以直接這樣設定而且可以隨意改變

	}
}