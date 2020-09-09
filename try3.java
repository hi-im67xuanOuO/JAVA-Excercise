import java.util.Arrays;
import java.util.Scanner;

public class try3 {
  public static void main(String[] args) {


    System.out.print("請輸入欲產生亂數的個數N: ");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); 
    System.out.print("請輸入亂數產生範圍(a~b): ");
    Scanner c = new Scanner(System.in);
    int a = c.nextInt();
    int b = c.nextInt();

    System.out.println("N="+N);
    System.out.println("a="+a);
    System.out.println("b="+b);


    int myArray[] = new int [N];//將輸入的數字做為陣列"長度"

    for(int N)
    for (int i = 0; i < N ; i++)
    {
      myArray[i] = (int) ((Math.random()*b-a+1));
    }
    Arrays.sort(myArray);//排序陣列內的數                     
    for (int i = 0; i < N ; i++)
    {
      System.out.print(myArray[i] + " ");
    }

    System.out.println();
  
  }

}
