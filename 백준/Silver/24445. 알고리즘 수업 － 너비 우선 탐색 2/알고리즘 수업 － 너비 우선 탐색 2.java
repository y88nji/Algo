import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int V, E, R, count;
	static boolean[] visited;
	static List<Integer>[] adjList;
	static int[] record;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		V = sc.nextInt(); // 정점의 수
		E = sc.nextInt(); // 간선의 수
		R = sc.nextInt(); // 시작 위치

		visited = new boolean[V + 1]; // 방문했는지 확인하는 T/F 배열 
		adjList = new ArrayList[V + 1]; // 인접리스트
		record = new int[V + 1]; // 방문 순서를 체크하는 배열

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
			Collections.sort(adjList[i], Collections.reverseOrder());
		}

		// 출력해서 확인해보기
//		for(List<Integer> data : adjList) {
//			System.out.println(data);
//		}
		
		count = 1; // 방문 순서 체크할 변수
		BFS(R); // 너비우선탐색 시작
		
		// 방문한 순서를 출력하기
		for(int i = 1; i <= V; i++) {
			System.out.println(record[i]);
		}
	}

	private static void BFS(int r) {
		// 큐 생성
		Queue<Integer> queue = new LinkedList<>();

		queue.add(r); // 시작정점 큐에 넣기
		visited[r] = true; // 시작정점 방문처리

		// 큐가 빌때까지 반복 수행
		while (!queue.isEmpty()) {
			
			// 큐에서 하나를 꺼냄
			int curr = queue.poll();
	
			// 방문 순서 확인 배열에 순서 체크하기
			record[curr] = count;
			count++;
			
			// 큐에서 꺼낸 curr에 인접한 리스트가 있으면서
			for (int next : adjList[curr]) {
				// 아직 방문하지 않았다면
				if (visited[next] == false) {
					// 큐에 넣어주고
					queue.add(next);
					// 방문처리를 해준다(미리 방문처리, 중복으로 큐에 넣는것 방지)
					visited[next] = true;
				}
			}
		}
	}

}