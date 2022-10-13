/*
 * A mathematics question paper has certain number of questions and each
question is assigned some random maximum marks. Mr. Myers wants to edit
the marks assigned to the questions such that:
1. All questions in the paper should have distinct maximum marks.
2. The total marks of all the question should be as low as possible.
Mr. Myers wants to achieve this by making minimal changes in the original
format, assigning the question at least as much marks as it originally had. Find
the minimum total marks that he can set the paper for

Example 1;
		input1=5;
		input2={1,2,3,4,5}
		output=15;

Example 2:
		input1=5;
		input2={1,4,5,4,5}
		output=23
 */
public class MayerAndExam {
	public static void main(String[] args) {
		int input1=5;
		int [] input2= {1,2,3,4,5};
		
		System.out.println(mayer(input1, input2));
	}
	
	static int mayer(int input1,int[] input2) {
		int k=0, sum=0, found=1;
		int i,l;
		for(i=1;i<input1;i++)
		{
		while(found==1) {
		for (l=0;l<i;l++)
		{
		if(input2[i]==input2[l])
		{
		input2[i]++;
		found=1;
		break;
		}
		else
		found=0;
		}
		}
		found=1;
		}
		for(int j=0;j<input1;j++){
		sum+=input2[j];
		}
	return sum; //while writing a program instead of writing this

		}
}
