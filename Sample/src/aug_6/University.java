package aug_6;

public class University {
	public static void main(String[] args) {
		int input1=3;
		int [] input2= {34,56,78,56,45};
		int input3=2;
		int[] input4= {70};
		System.out.println(maxpair(input1, input2, input3, input4));
	}
	static int maxpair(int input1,int[] input2,int input3,int[] input4) {
		int count=0;
		for(int i=0;i<input4.length;i++) {
			for(int j=0;j<input2.length;j++) {
				if(input4[i]>input2[j]) {
					count ++;
				}
			}
		}
		return count;
	}

}
