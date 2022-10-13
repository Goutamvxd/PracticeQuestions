
public class UniqueNumbers {
public static void main(String[] args) {
	int n1=10;
	int n2=7;
	int[] arr= {2,1,1,3,6,5,8,4,1,9};
	System.out.println(distin(n1, n2, arr));
}
public static int distin(int n1,int n2, int[] n3) {
	int n=n1;
	int pos=n2;
	if(n==0 ||n==1) {
		return n;
	}
	int count =1;
	for(int i=0;i<pos-1;i++) {
		if(n3[i]!=n3[i+1]) {
			count =count +1;
					
		}
	}
	return count;
}
}
