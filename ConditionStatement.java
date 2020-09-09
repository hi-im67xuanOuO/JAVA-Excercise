public class ConditionStatement{
	public static void main(String[] args) {
		//if-else 陳述式
		//1. if(條件式){程式碼} else{程式碼}
		//2. 大括弧指定了滿足條件後要執行的程式範圍
		//3. if else if else間不可穿梭其他非範圍內的數值
		//4. 一定要用if開頭 中間的else if可以無限多個 結論一定要用else
		if (true) {
			System.out.println("ex1:我是對的！");
		}else{
			System.out.println("ex1:我錯了...");
		}


		if (!true || false) {
			System.out.println("ex2:我是對的！");			
		}else{
			System.out.println("ex2:我錯了...");
		}


		// if(a>b){
		// 	System.out.println("ex5:a>b");
		// }else if(a<b){
		// 	System.out.println("ex5:a<b");
		// }
		// else{
		// 	System.out.println("ex5:全錯了！");
		// }


		// if(a>b){
		// 	System.out.println("ex5:a>b");
		// }else if(a<b){
		// 	System.out.println("ex5:a<b");
		// }else if(a==b){
		// 	System.out.println("ex5:a==b");
		// }else{
		// 	System.out.println("ex5:全錯了！");
		// }
	}
}