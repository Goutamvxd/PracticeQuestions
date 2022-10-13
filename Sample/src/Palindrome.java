
public class Palindrome {
	public static void main(String[] args) {
		String s1="kannada";
		System.out.println(palin(s1));
		
	} 
	static int palin(String s1) {
		String s2="";
		int max=0;
		int min=s1.length();
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<=s1.length();j++) {
				s2=s1.substring(i,j);
				String temp="";
				for(int k=s2.length()-1;k>=0;k--) {
					temp+=s2.charAt(k);
				}
				if(temp.equals(s2) && temp.length()>max) {
					max=temp.length();
				}
				if(temp.equals(s2) && temp.length()<min) {
					min=temp.length();
				}
			}
			
		}
		return max-min;
				
	}

}
