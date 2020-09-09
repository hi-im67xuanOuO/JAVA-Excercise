class Tree_06170203
{
	//public int Type;
	//public int Layer;

	int x,y;

	Tree_06170203(int type,int Layer)
	{
		x=type;
		y=Layer;
		if(x==1)
		{
			for (int i=1; i<= y; i++) 
			{
		 		System.out.println(" ");
		 	
            	for (int j=y; j>i; j--) 
            	{
                	System.out.print(" ");
            	}
            	for (int k=1; k<=i; k++)
            	{
                	System.out.print("*"+" ");
            	}
				
			}System.out.println();
		}

		else if(x==2)
		{
			for(int i=1;i<=y;i++)//用輸入行數Line定義i變數
			{
				for(int j=0;j<=i;j++)//換行 用i定義j變數
				{
			    	System.out.println();

					for(int k=1;k<=y-j;k++)//空格數 用j定義k變數
					{
						System.out.print(" ");
					}
					for(int l=1;l<=1+(j*2);l++)//星號數 用j定義l變數
					{
						System.out.print("*");
					}
				}
			}
	    	System.out.println();
		}

	
	}
}
