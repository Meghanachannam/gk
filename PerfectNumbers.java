class PerfectNumbers
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(isPerfectNumber(i))
			{
				System.out.println(i+"is a perfect number!");
			}
		}
	}
	public static boolean isPerfectNumber(int number)
	{
		int sum=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum+=i;
			}
		}
		return sum==number;
	}
}