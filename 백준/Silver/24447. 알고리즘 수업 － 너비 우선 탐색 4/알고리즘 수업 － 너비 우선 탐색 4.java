import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int V, E, R;
	static long depth, count;
	static BigInteger sum;
	static boolean[] visited;
	static List<Integer>[] adjList;
	static int[] dep, vis;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		V = sc.nextInt(); // 정점의 수
		E = sc.nextInt(); // 간선의 수
		R = sc.nextInt(); // 시작 위치

		visited = new boolean[V + 1]; // 방문했는지 확인하는 T/F 배열 
		adjList = new ArrayList[V + 1]; // 인접리스트
		vis = new int [V + 1]; // 방문 순서 확인 배열
		dep = new int [V + 1]; // 깊이를 체크하는 배열
		Arrays.fill(dep, -1); // 깊이 배열 초기화, -1

		// 인접리스트를 생성해줌
		for (int i = 1; i <= V; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		// 인접리스트에 값 대입
		for (int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			adjList[A].add(B);
			adjList[B].add(A);
		}

		// 리스트를 정렬함
		for (int i = 1; i <= V; i++) { 
			Collections.sort(adjList[i]);
		}

		// 출력해서 확인해보기
//		for(List<Integer> data : adjList) {
//			System.out.println(data);
//		}
		
		depth = 0; // 깊이 변수
		count = 1; // 방문 순서 변수
		BFS(R); // 너비우선탐색 시작
		
		// 순서대로 곱한 결과 더하기
		sum = new BigInteger("0");
		for(int i = 1; i <= V; i++) {
			sum = sum.add(BigInteger.valueOf(dep[i]).multiply(BigInteger.valueOf(vis[i])));
		}
		System.out.println(sum);
	}

	private static void BFS(int r) {
		// 큐 생성
		Queue<Integer> queue = new LinkedList<>();
		queue.add(r); // 시작정점 큐에 넣기
		visited[r] = true; // 시작정점 방문처리
		dep[r] = (int) depth;
		depth++;

		while (!queue.isEmpty()) {
			int curr = queue.poll();
			// 방문 순서 표기하기
			vis[curr] = (int) count;
			count++;
			
			for (int next : adjList[curr]) {
				if (visited[next] == false) {
					queue.add(next);
					visited[next] = true;
					// 다음 정점의 깊이는 현재 정점의 깊이 + 1
					 dep[next] = dep[curr] + 1;
				}
			}
			
		}
		
	}

}