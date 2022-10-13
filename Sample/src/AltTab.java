
public class AltTab {
public static void main(String[] args) {
	int n1=10;
	int n2=12;
	int[] n3= {2,5,8,1,3};
	int[] arr=alttab(n1, n2, n3);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
static  int[] alttab(int n1,int n2,int[] n3) {
	int[] ret=new int[n3.length];
	int k=1;
	ret[0]=n3[(n2-1)%n3.length];
	for(int i=0;i<n3.length;i++) {
		if(n3[i]!=ret[0]) {
			ret[k]=n3[i];
			k++;
		}
	}
	return ret;
}
}
