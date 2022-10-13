//not executed


public class Maximizer {


	public static void main(String[] args) {

		String sample="Abhilash";
		int number=2;
		char[] array;
		char[] array2;
		array=sample.toCharArray();
		array2=new char[array.length];
		maximizer(number, array);
		for(int a=0;a<array2.length;a++) {
			System.out.println(array[a]);
		}
		
	}
	public static char[] maximizer(int n,char[] input) {
		char k;
		int count=0,i=2,j=1,x=0;
		while(i<input.length && j<input.length) {
			if(count !=n) {
				k=input[i];
				input[i]=input[j];
				input[j]=k;
				count ++;
				j--;
				i--;
			}else {
				break;
			}
		}
		return input;
	}
}
