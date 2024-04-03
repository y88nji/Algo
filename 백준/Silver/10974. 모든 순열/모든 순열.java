import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N, n;
	static int[] nums, result;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		n = 1;
		
		nums = new int [N];
		result = new int [N];
		visited = new boolean [N];
		
		for(int i = 0; i < N; i++) {
			nums[i] = n++;
		}
		
		perm(0);

	}

	private static void perm(int idx) {
		if(idx == N) {
			for(int i = 0; i < N; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0 ; i<N; i++) {
			if(visited[i])continue;
			result[idx] = nums[i];
			visited[i] = true;
			perm(idx+1);
			visited[i] = false;
		}
		
	}

}