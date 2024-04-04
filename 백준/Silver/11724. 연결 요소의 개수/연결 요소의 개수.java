import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int V, E, count;
	static int[][] adj;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		adj = new int [V+1][V+1];
		visited = new boolean[V+1];
		
		for(int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			adj[A][B] = adj[B][A] = 1;
		}

		// 모든 visited 경우에 관해 DFS 실행, DFS가 실행되는 만큼 count
		for(int i = 1; i <= V; i++) {
			if(visited[i]==false) {
				BFS(i);
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(v);
		visited[v] = true;
		
		while(!queue.isEmpty()) {
			
			int curr = queue.poll();
			
			for(int i = 1; i <= V; i++) {
				if(adj[curr][i] == 1 && visited[i] == false) {
					queue.add(i);
					visited[i] = true;
				}
			}
			
		}
		
		
		
	}

}