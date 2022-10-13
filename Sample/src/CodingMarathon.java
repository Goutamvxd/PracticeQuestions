
public class CodingMarathon {
public static void main(String[] args) {
	int n1=5;
	int n2=2;
	int[] n3= {4,1,2,4,5};
	System.out.println(marathon(n1, n2, n3));
}
static int marathon(int n1,int n2,int[] n3) {
	int s=0;
	for(int i=0;i<n1;i++) {
		for(int j=0;j<n1;j++) {
			if(n3[i]>n3[j]) {
				int temp=n3[i];
				n3[i]=n3[j];
				n3[j]=temp;
			}
		}
	}
	for(int i=0;i<n2;i++) {
		s+=n3[i];
	}
	return s;
}
}
