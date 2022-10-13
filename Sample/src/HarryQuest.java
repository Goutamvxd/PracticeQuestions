/*
 * Harrypotter is visiting his uncle’s house ,the house of Black ,and ants to know more about the family through their ancestral tree.He notices that the ancestraltreebegins with the head of the family at the top,having 2 children as his descendants,This pattern is followed throught and each member is represented by unique integer.

Given relationships in the form ofan integer arraywhere the head of the family is at the first position (i=0) and his children areat position (2*i+1) and (2*i+2).

Your task is to help harry find and return all the siblings of any given family member and return them in the form of a sorted array.

Note:if there are no siblings ,return {-1}.

Example:

Input1:5

Input2:{1,2,3,4,5}

Input3:1

Output:{-1}
 */
public class HarryQuest {
public static void main(String[] args) {
	int[] inputArray=new int[] {1,2,3,4,5,6,7};
	int siblingsTofindOf=5;
	int[] results=findSiblings(inputArray.length,inputArray,siblingsTofindOf);
	System.out.print("(");
	for(int i=0;i<results.length;i++) {
		if(i>0 && i<results.length) {
			System.out.println(" ,");
		}
		System.out.print(String.valueOf(results[i]));
	}
	System.out.print(")");
	
}
public static int[] findSiblings(int input1,int[] inpu2,int input3) {
	int[] result=new int[] {-1};
	if(inpu2[0]==input3) {
	return	result;
	}
	int siblingFindIndex=-1;
	for(int i=0;i<inpu2.length;i++) {
		if(inpu2[i]==input3) {
			siblingFindIndex=i;
			break;
		}
	}
	if(siblingFindIndex>-1) {
		result=new int[] {inpu2[siblingFindIndex-1],inpu2[siblingFindIndex+1]};
	}
	return result;
}

}
