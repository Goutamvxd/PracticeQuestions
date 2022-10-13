
public class DiffinDate {
public static void main(String[] args) {
	String s="our independence day is on 15-07-1997.26-01-1950";
	System.out.println(differ(s));
}
static int differ(String s) {
	int i=0;
	int year1=0;
	int year2=0;
	int flag=1;
	
	for(i=0;i<s.length() && flag==1;i++) {
		if(s.charAt(i)>=48 && s.charAt(i)<=57) {
			year1=Integer.parseInt(""+s.charAt(i+6)+s.charAt(i+7)+s.charAt(i+8)+s.charAt(i+9));
			flag=0;
		}
	}
	i=i+9;
	flag=1;
	for(;i<s.length() && flag==1;i++) {
		if(s.charAt(i)>=48 && s.charAt(i)<=57) {
			year2=Integer.parseInt(""+s.charAt(i+6)+s.charAt(i+7)+s.charAt(i+8)+s.charAt(i+9));
			flag=0;
		}
	}
	return Math.abs(year2-year1);
}
}
