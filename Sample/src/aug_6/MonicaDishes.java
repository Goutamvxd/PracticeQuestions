package aug_6;

import java.util.ArrayList;
import java.util.Collections;

public class MonicaDishes {
	class Problem18 {
	    public static void main(String[] args) {
	        
	
	        int[] array1= {-1,3,4};
	        int max=0;
	        
	        ArrayList<Integer> array2= new ArrayList<Integer>();
	        
	        // converting array to array list 
	        for(int i=0;i<array1.length;i++) {
	            array2.add(array1[i]);
	        }
	        
	        // sorting the Array list in ascending order 
	        
	        Collections.sort(array2);
	        
	        // given maximum value in array list 
	        
	        int max1=array2.get(array2.size()-1);
	        
	        // checking the conditions as mentioned in above algorithm 
	        for(int i=0;i<array2.size();i++) {
	            if(array2.get(i)<0 && (Math.abs(array2.get(i))>=max1)) {    
	                array2.remove(i);
	                i=-1;    
	            }    
	        }
	        
	        // finding cumulative sum 
	        for(int i=1;i<=array2.size();i++) {
	            max=max+(i*array2.get(i-1));
	        }
	        
	        // printing the final answer 
	        
	        System.out.println(max);
	    }
	}
	}