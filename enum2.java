enum Days
{
	MON,TUE,WED
}

class enum2  
{
	public static void main(String[] args) 
	{
		Days d=Days.WED;

		switch(d)
		{
			case MON: System.out.println("MONDAY"); break;
			case TUE: System.out.println("TUESDAY"); break;
			case WED: System.out.println("WEDNESDAY"); break;
		}
	}
}