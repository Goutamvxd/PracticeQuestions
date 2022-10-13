package aug_6;

import java.util.ArrayList;
import java.util.Collections;

public class Dishes {



	   public static void main(String[] args) {
	        int input1=5;
	        int[]  input2= {-1,-9,0,5,-7};        
	        System.out.println(dish(input2, input1));
	    }
	static int dish(int[] array1,int input2) {
	    
	    
	    int max=0;
	    ArrayList<Integer> array2=new ArrayList<Integer>();
	    
	    for (int i = 0; i < input2; i++) {
	        array2.add(array1[i]);
	        
	    }
	    Collections.sort(array2);
	    int max1=array2.get(array2.size()-1);
	    
	    for (int i = 0; i < array2.size(); i++) {
	        if(array2.get(i)<0 && (Math.abs(array2.get(i))>=max1)) {
	            array2.remove(i);
	            i=-1;
	        }
	    }
	    for (int i = 1; i <= array2.size(); i++) {
	        max=max+(i*array2.get(i-1));
	    }
	    return max;



	}
	}






