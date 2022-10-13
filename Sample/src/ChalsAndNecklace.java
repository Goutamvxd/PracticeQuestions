
/*
 * Charles and the Necklace
Charles wants to buy a necklace in which.
1. There is a minimum of 1 pearl and maximum of X pearls, such that each
pearl has its own magnificent coefficient
2. The pearls should be in non-decreasing order of their magnificence power.
You are given the maximum number of pearls in a necklace and the range of
the magnificent coefficients of the pearls. Find the number of necklaces that
can be made that follow the mentioned conditions.​ 


Example 1:
input1: 1
input2:4
input3:5​
 */
public class ChalsAndNecklace {

	public static void main(String[] args) {
		
		int n1=1;
		int n2=4;
		int n3=5;
		System.out.println(method(n1, n2, n3));
	}
	public static int method(int n1,int n2,int n3) {
		int sum=0;
		int mul=0;
		int fact=0;
		int fact1=1;
		int fact2=1;
		int fact3=1;
		
		int n=n3-n2+1;
		for(int i=1;i<n;i++) {
			fact1*=i;
		}
		for(int i=1;i<=n1;i++) {
			int c=n+i-1;
			fact2=1;
			for(int j=1;j<=c;j++) {
				fact2*=j;
			}
			fact3*=i;
			mul=fact3*fact1;
			fact=fact2/mul;
			sum+=fact;
		}
		return sum;
	}

}
