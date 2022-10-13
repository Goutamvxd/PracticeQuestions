/*
 * 
Example 1:

Input: 4, {{1,3},{2,5},{2,4},{3,5}}

Output: 3

enter image description here

Example 2:

Input: 5, {{1,7},{2,4},{6,9},{3,8},{5,10}}

Output: 4
 */

public class RaceCar {
	public static void main(String[] args) {
		int input1 = 5;
		int[][] input2 = { { 1, 7 }, { 2, 4 }, { 6, 9 }, { 3, 8 }, { 5, 10 } };
		System.out.println(race(input1, input2));
	}

	static int race(int input1, int[][] input2) {
		int hash[] = new int[100001];
		for (int j = 0; j < input1; j++) {
			hash[input2[j][0]]++;
			hash[input2[j][1]]--;
		}
		int count = 0;
		int tmp = 0;
		for (int j = 0; j <= 100000; j++) {
			tmp += hash[j];
			if (count < tmp)
				count = tmp;
		}
		return count;
	}

}
