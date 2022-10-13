/*
 * Victor has an array of size n. He loves to play with these n numbers. Each time he plays
with them, he picks up any two consecutive numbers and adds them. On adding both the
numbers, it costs him k*(sum of both numbers).
Find the minimum cost of adding all the numbers in the array.
Input Specification:
input1: Size of array.
input2: Elements of the array.
input3: Value of k.
Output Specification:
Return the minimum cost of adding all the numbers of the array. 

Example1:  

input1=3

input2={1,2,3}

input3=3

output=18
 */
import java.util.Arrays;

public class AddingNumbers {
	public static void main(String[] args) {
		int size=3;
		int [] arr= {1,2,3};
		int k=2;
		System.out.println(adding(size, arr, k));
	}static int adding(int size,int[] arr,int k) {
		int sum=0;
		while(arr.length>1) {
			Arrays.sort(arr);
		int[] s=new int[(arr.length+(arr.length%2))/2];
		int n=0;
		for(int i=0;i<arr.length-1;i=i+2) {
			s[n]=arr[i]+arr[i+1];
			sum+=s[n]*k;
			n++;
		}
		if(arr.length%2==1) {
			s[n]=arr[arr.length-1];
		}
		arr=Arrays.copyOf(s, s.length);
	}
	
return sum;
}
}