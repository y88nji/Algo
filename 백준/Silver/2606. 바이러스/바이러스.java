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
		
		DFS(1);
		System.out.println(count);
		
	}

	private static void DFS(int start) {
		visited[start] = true;
		
		for(int i = 1; i <= V; i++) {
			if(visited[i]==false && adj[start][i]==1) {
				count++;
				DFS(i);
			}
		}
		
		
	}
}