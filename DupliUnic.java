import java.util.HashSet;
import java.util.Set;


public class DupliUnic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr={3,7,6,2,6,9,1,2};
         
         Set<Integer> uset=new HashSet<>();
         Set<Integer> dset=new HashSet<>();
         
         for(int val:arr){
        	 if(!uset.add(val)){
        		 dset.add(val);
        	 }
        	
         }
     
         System.out.println("Unics"+uset);
 	}

}