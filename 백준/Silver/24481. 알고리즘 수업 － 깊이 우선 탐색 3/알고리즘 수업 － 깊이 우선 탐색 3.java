import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 인접리스트로 DFS 풀었음
public class Main {

	static int V, E, R, depth;
	static boolean[] visited;
	static List<Integer>[] adjList;
	static int[] check;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt(); // 정점 수
		E = sc.nextInt(); // 간선 수
		R = sc.nextInt(); // 시작 정점
		
		visited = new boolean [V+1]; // 방문 배열
		adjList = new ArrayList[V+1]; // 인접 리스트
		check = new int[V+1]; // 방문순서 기록배열
		Arrays.fill(check, -1); // check 배열 초기화, -1
		
		// 인접리스트 배열 생성
		for(int i = 1 ; i <= V; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		// 간선 정보 입력
		for(int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			adjList[A].add(B);
			adjList[B].add(A);
		}
		
		// 방문 순서를 위해 오름차순 정렬 
		for (int i = 1; i <= V; i++) { 
			Collections.sort(adjList[i]);
		}
		
		// 시작 노드가 1이니까 1로 시작
		DFS(R, 0);
		
		// 방문 순서를 기록한 배열 출력
		for(int i = 1; i <= V; i++) {
			System.out.println(check[i]);
		}
	}

	private static void DFS(int r, int d) {
		// r번째 노드 방문 했음 체크하고
		visited[r] = true;
		// r번째 자리에 현재 얼마나 재귀를 했는지 표시
		check[r] = d;
		
		// r번째 노드와 인접한 리스트 중에서
		for(int next : adjList[r]) {
			// next 노드를 방문하지 않았으면
			if(!visited[next]) {
				// DFS 실행
				DFS(next, d+1);
			}
		}
	}

}