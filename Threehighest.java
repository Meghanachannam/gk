class Threehighest
{
	public static void main(String[] args)
	{
		int[] arr={5,8,6,2,7,3,1};
		int FirstHighest=Integer.MIN_VALUE;
		int SecondHighest=Integer.MIN_VALUE;
		int ThirdHighest=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i>FirstHighest)
			{
				ThirdHighest=SecondHighest;
				SecondHighest=FirstHighest;
				FirstHighest=i;
			}
			else if(i<FirstHighest&&i>SecondHighest)
			{
				ThirdHighest=SecondHighest;
				SecondHighest=i;
			}
		}
			System.out.println(FirstHighest+" "+SecondHighest+" "+ThirdHighest);
	}
}