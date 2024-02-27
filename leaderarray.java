 class leaderarray
 {
	 public static void main(String[] args)
	 {
		 int[] arr={6,64,14,9,3,1,5};
		 int max=arr[arr.length-1];
		 System.out.print(max+" ");
		 //moving reverse
		 for(int i=arr.length-2;i>0;i--)
		 {
			 if(arr[i]>max)
			 {
				 max=arr[i];
				 System.out.print(max+" ");
			 }
		 }
	 }
 }