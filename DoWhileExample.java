class DoWhileExample{
	public static void main(String[] args) {
		// int i=0,j;

		// do{
		// 	i++;
		// 	j=i*i;
		// 	System.out.println(i+"*"+i+"="+j);
		// }while(j<100);

		int i=1,j;

		do{
			i++;
			j=(i-1)*(i-1);
			System.out.println((i-1)+"*"+(i-1)+"="+j);
		}while(j<100);
	}
}