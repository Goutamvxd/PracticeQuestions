import java.util.Scanner;

/*
 * Parents

John is going through his family photo album. There is a total of people in the family labeled from 0 to N-1.
Find out the number of members of his family who have more than equal to X children.


Input Specification:
input1: N. denoting the total number of family members.
input2: X denoting the minimum number of children a family member should have in order to be included in John's final set.
input3: An array of N elements where the ith element denotes the parent of the ith index. If the value of the element is -1,
 then that family member has no parent.

Output Specification:


Your function should return the number of John's family members that have more than or equal to X childrens.
Example 1:
Input1: 1
input2:0
input3:{-1}

output:1

Explanation :Family member 0 has 0 children. 
As we have to return the family membersthat have more than or equal to 0 children.hence the answer is 1.

Example 2:

input1:3
input2:1
input3:{-1,0,0}

output:1
 */

public class Parents {
	public static void main(String[] args) {
	      
			
			int input1=3;
			int input2 =1;
			int[] input3= {-1,0,0};
			System.out.println(jhon(input1, input2, input3));
	}
			static int jhon(int input1,int input2,int[] input3) {
			int Parent[] = new int[input1];
			
			int sub[] = new int[input1];
			
			int c = 0;
			
			for(int i=0; i<input1; ++i)
			{
				Parent[i] =input2;
				
				if(Parent[i] != -1)
					++sub[Parent[i]];
			}
			
			for(int i=0; i<input1; ++i)
			{
				if(sub[i] >= input2)
					++c;
			}
			
			return c;
		}

}
