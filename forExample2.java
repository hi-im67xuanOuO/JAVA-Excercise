class forExample2{
	public static void main(String[] args) {
		// int maxX=10;
		// int maxY=15;
		// for(int x=0,y=0;(x<maxX)&&(y<maxY);x++,y=x*2)
		// {
		// 	System.out.println("x<10:"+x+",y<15:"+y);
		// }

		// int maxX=10;
		// int maxY=15;
		// for(int x=0,y=0;(x<maxX)||(y<maxY);x++,y=x*2)
		// {
		// 	System.out.println("x<10:"+x+",y<15:"+y);
		// }

		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				for(int k=1;k<=10;k++)
				{
					System.out.println("i="+i+"j="+j+"k="+k);
				}
			}
		}
	}
}