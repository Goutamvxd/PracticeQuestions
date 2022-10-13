import java.text.DecimalFormat;

public class PizzaBoy {
public static void main(String[] args) {
	int input1=2;
	int input2=3;
	int[][] input3= {{0,0},{0,2},{2,0}};
	double x=time(input1, input2, input3);
	System.out.println(x);
}
static double time(int input1,int input2,int[] [] input3) {
	double dist=0;
	for(int i=0;i<input3.length-1;i++) {
		for(int j=i+1;j<input3.length;j++) {
			double x1=input3[i][0];
			double y1=input3[j][0];
			double x2=input3[i][1];
			double y2=input3[j][1];
			
			
			double temp=Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
			if(temp>dist) {
				dist=temp;
			}
		}
	}
	DecimalFormat numberFormat=new DecimalFormat("#.000000");
	String ans=numberFormat.format(dist/input1);
	return Double.parseDouble(ans);
}
}
