package aug_6;

import java.util.HashSet;
import java.util.Set;

public class Document {
public static void main(String[] args) {
	String str="UN was established on 24-10-1945. India got freedom on 15-08-1947";
	System.out.println(dis(str));
}
static int dis(String str) {
	String str2=" ";
	Set<String> un=new HashSet<>();
	for(int i=0;i<str.length();i++) {
		if(Character.isDigit(str.charAt(i))) {
			str2+=str.charAt(i);
		}
		if(str.charAt(i)=='-') {
			str2=" ";
		}
		if(str2.length()==4) {
			un.add(str2);
			str2= " ";
		}
	}
	return un.size();
}
}
