import java.util.ArrayList;

public class Password {
public static void main(String[] args) {
	
}
static int pass(int input1,int input2) {
	for(int i=1;i<input1;i++) {
		ArrayList<Integer> array=new ArrayList<>();
		for(int j=0;j<50;j++) {
			if(j==0) {
				array.add(5000*i);
			}
			else {
				int temp=(int) array.get(j-1);
				int temp1=temp+5000+j+1;
				array.add(temp1);
			}
		}
		if(array.contains(input2)) {
			return i;
		}
	}
	return ;
}
}
