import java.util.LinkedList;
import java.util.Queue;

public class CuttingTree {
	public static void main(String[] args) {
		int n1=1;
		int n2=5;
		System.out.println(platree(n1, n2));
	}
	static int platree(int n1,int n2) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(2);
		for(int i=0;i<n1;i++) {
			int v=q.remove();
			for(int j=0;j<((v+1)%n2);j++) {
				q.add(j);
			}
		}
		return q.size();
	}

}
