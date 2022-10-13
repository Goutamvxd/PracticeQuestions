import java.util.ArrayDeque;
import java.util.Deque;

public class Morse {

	    public static void main(String[] args){
	    	int input1 =1;
			String [] input2= {".-.-.-"};
			System.out.println(code(input1, input2));
	    }
	    static int code(int input1,String[] input2){
	        int result=0;
	        for(int i=0;i<input2.length;i++){
	            Deque<Character> stack=new ArrayDeque<>();
	            if(input2[i]==null || input2[i].length()==0){
	                continue;
	            }
	            String cur=input2[i];
	            if(cur.charAt(0)!='.' && cur.charAt(cur.length()-1)!='-'){
	                break;
	            }
	            int j=0;
	            while(j<cur.length()){
	                if(cur.charAt(j)=='.'){
	                    while(j<cur.length() && cur.charAt(j)=='.'){
	                        j++;
	                        stack.push('.');
	                    }
	                }else{
	                    if(stack.size()==0){
	                        break;
	                    }
	                    stack.pop();
	                    j++;
	                }
	            }
	            if(j==cur.length() && stack.size()==0){
	                result ++;
	            }
	        }
	        return result;
	    }
	}

