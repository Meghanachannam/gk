 class strimp8
 {
	 public static void main(String[] args)
	 {
		 String str="A1B2C3D4E5";
		 for(int i=0;i<str.length();i++)
		 {
			 if(Character.isAlphabetic(str.charAt(i)))
			 {
				 System.out.print(str.charAt(i));
			 }
			 else
			 {
				 int j=Character.getNumericValue(str.charAt(i));
				 for(int k=1;k<j;k++)
				 {
					 System.out.print(str.charAt(i-1));
				 }
			 }
		 }
	 }
					 
 }