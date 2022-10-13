
public class CarRace {
public static void main(String[] args) {

	int input1=4;
	int[][] input2= {{1,3},{2,5},{2,4},{3,5}};
	System.out.println(code(input1,input2));
	
}static int code(int input1,int[][] input2) {
int hash[]=new int[100001];
for(int i=0;i<input1;i++) {
	hash[input2[i][0]]++;
	hash[input2[i][1]]--;
}
int count=0;
int temp=0;
for(int j=0;j<=100000;j++) {
	temp+=hash[j];
	if(count<temp)
		count=temp;
}
	return count;
}
}
