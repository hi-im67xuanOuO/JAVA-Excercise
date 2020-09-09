import java.util.Scanner;
public class TreeDisplay_06170203{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please choose a type:");
    	System.out.println("1. Triangle");
    	System.out.println("2. xMasTree");
    	int type =  sc.nextInt();

    	System.out.println("please enter an number: ");
    	int Layer =  sc.nextInt();


    	Tree_06170203 myTree=new Tree_06170203(type,Layer);
	}
}