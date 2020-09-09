import java.util.Arrays;
import java.util.Scanner;
 
public class NewClass {
 
    public static void main(String[] args) {
        int q,w,e,r,t,y,u,i,o,p,a,s,d,f,g;
        System.out.println("輸入15個數值");
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入第1個值:");
        q = sc.nextInt();
        System.out.print("輸入第2個值:");
        w = sc.nextInt();
        System.out.print("輸入第3個值:");
        e = sc.nextInt();
        System.out.print("輸入第4個值:");
        r = sc.nextInt();
        System.out.print("輸入第5個值:");
        t = sc.nextInt();
        System.out.print("輸入第6個值:");
        y = sc.nextInt();
        System.out.print("輸入第7個值:");
        u = sc.nextInt();
        System.out.print("輸入第8個值:");
        i = sc.nextInt();
        System.out.print("輸入第9個值:");
        o = sc.nextInt();
        System.out.print("輸入第10個值:");
        p = sc.nextInt();
        System.out.print("輸入第11個值:");
        a = sc.nextInt();
        System.out.print("輸入第12個值:");
        s = sc.nextInt();
        System.out.print("輸入第13個值:");
        d = sc.nextInt();
        System.out.print("輸入第14個值:");
        f = sc.nextInt(); 
        System.out.print("輸入第15個值:");
        g = sc.nextInt();
        Integer[] ary = new Integer[15];
        ary[0] = q;
        ary[1] = w;
        ary[2] = e;
        ary[3] = r;
        ary[4] = t;
        ary[5] = y;
        ary[6] = u;
        ary[7] = i;
        ary[8] = o; 
        ary[9] = p;
        ary[10]= a;
        ary[11]= s;
        ary[12]= d;
        ary[13]= f;
        ary[14]= g;
 
        // Arrays.sort(ary);
        // for(int member : ary)
        // { 
        // 	System.out.print(member+">"); 
        // }
        // System.out.println();
        //由小排到大

        
        Arrays.sort(ary);
        for (int x=ary.length-1;x>=0 ;x-- )
        System.out.print(ary[x]+" ");
    	System.out.println();
        //由大排到小

        Arrays.sort(ary);
        for (int x=0;x<=ary.length-1 ;x++ )
        System.out.print(ary[x]+" ");
    	System.out.println();
        //由小排到大
    }
}