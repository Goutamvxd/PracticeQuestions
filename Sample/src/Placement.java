
public class Placement {
public static void main(String[] args) {
	int input1=5;
	int[] input2= {4,9,5,3,10};
	System.out.println(method(input1, input2));
}
static int[] method(int input1,int[] input2) {
	int[] arry=new int[input1];
	int count;
	for(int i=0;i<input1;i++) {
		count=0;
		for(int j=0;j<i;j++) {
			if(input2[i]<input2[j]) {
				count ++;
			}
		}
	}
	return arry;
}
}
