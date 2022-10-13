package aug_6;

public class CreditLimit {
public static void main(String[] args) {
	int input1=3;
	int[] input2= {1,2,3};
	int input3=4;
	int [] input4= {56,34,78,23,55};
	System.out.println(credit(input1, input2, input3, input4));
}
static int credit(int input1,int[] input2,int input3,int[] input4) {
	int result=0;
	for(int i=0;i<input1;i++) {
		for(int j=0;j<input1;j++) {
			if(input4[i]>input4[j]) {
				result++;
			}
		}
	}
	return result;
}
}
