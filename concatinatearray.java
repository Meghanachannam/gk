import java.util.Arrays;
class concatinatearray
{
	public static void main(String[] args)
	{
		int[] arr1={5,1,3,2,4};
		int[] arr2={9,7,8,6,10};
		int size1=arr1.length;
		int size2=arr2.length;
		arr1=Arrays.copyOf(arr1,size1+size2);
		int j=0;
		for(int i=size1;i<arr1.length;i++)
		{
			arr1[i]=arr2[j++];
		}//sorting
		Arrays.sort(arr1);
		//display
		for(int i:arr1)
		{
			System.out.print(i+" ");
		}
	}

}