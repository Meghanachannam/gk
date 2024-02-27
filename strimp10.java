 import java.util.*;
 class strimp10
 {
	 public static void main(String[] args)
	 {
		 findDuplicatesWords("I am am Learning Java Java");
	 }
	 public static void findDuplicatesWords(String str)
	 {
		 LinkedHashMap<String,Integer>lhm=new LinkedHashMap<String,Integer>();
		 String[]s=str.split(" ");
		 for(String tempString:s)
		 {
			 
			 if(lhm.get(tempString)!=null)
			 {
				 lhm.put(tempString,lhm.get(tempString)+1);
			 }
			 else
			 {
				 lhm.put(tempString,1);
			 }
		 }
		 System.out.println(lhm);
	 }
 }