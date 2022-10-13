/*
 * Mars Stone Problem Description Rob has gone to Mars to collect some stones. 
 * The nag he is carrying can hold a mximum weight of M. 
 * There are M stones weighing from 1 to M in Mars. 
 * There are N stones on Mars that are similar to the ones on Earth. 
 * Find the number of stones he can bring from Mars such that none of them are similar to any stone on Earth. 
 * 
 * Input Specification: 
 * input1: M, denoting the size of the bag and the number of different stone weights present on Mars. 
 * input2: N, denoting the number of common stones on Earth and Mars. 
 * input3: An N element array containing the list of the weights of the common stones. 
 * Output Specification: Your function should return the maximum unique stones that can be collected from Mars.
 * 
 *  Example 1: 
 *  input1: 10 
 *  input2: 3 
 *  input3: {1, 3, 5} 
 *  Output: 2 Explanation: Rob collects one of the following stone weight sets: (2, 4), (2, 6) or (2, 8).
 */
public class MarsStone {
public static void main(String[] args) {
	
	int n1=10;
	int n2=3;
	int[] n3= {1,3,5};
	System.out.println(method(n1, n2, n3));
}
public static int method(int n1,int n2, int[] n3) {
	int[] arry=new int[n1];
	int count=0; 
	int sum=0;

	for(int i=1;i<=n1;i++) {
		arry[i-1]=i;
		for(int j=0;j<n2;j++) {
			if(arry[i-1]==n3[j]) {
				arry[i-1]=0;
			}
		}
	}
	for(int i=0;i<n1;i++){
		if(sum<n1 && arry[i]!=0) {
			sum=sum+arry[i];
			if(sum<n1) {
				count++;
			}
		}
	}
	return count;
		
}
}
