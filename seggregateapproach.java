 class seggregateapproach
 { 
	 public static void main(String[] args)
	 {
		 int[] arr={1,0,1,1,0,0,0,1,1,0};
		 int[] resArr=new int[arr.length];
		 //inserting 0
		 int j=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==0)
			 {
				 resArr[j++]=arr[i];
			 }
		 }
		 //inserting 1
		 while(j<arr.length)
		 {
			 resArr[j++]=1;
		 }

		 //display
		 for(int i:resArr)
		 {
			 System.out.print(i+" ");
		 }
	 }
 }