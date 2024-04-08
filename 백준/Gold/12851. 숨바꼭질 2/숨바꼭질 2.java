import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N, K, result, count;
	static int[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();
		visited = new int[100000 + 1];

		BFS();

		System.out.println(result);
		System.out.println(count);
	}

	private static void BFS() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(N);
		visited[N] = 1;
		count = 0;

		while (!queue.isEmpty()) {
			int curr = queue.poll();

			if (curr == K) {
				result = visited[curr] - 1;
				count++;
			}

			// 왼쪽으로 한 칸 이동하는 경우
			if (curr - 1 >= 0 && (visited[curr - 1] == 0 || visited[curr - 1] == visited[curr] + 1)) { // 변경: 방문 여부와 최소 시간 체크
				visited[curr - 1] = visited[curr] + 1; // 변경: 최소 시간 갱신
				queue.add(curr - 1);
			}

			// 오른쪽으로 한 칸 이동하는 경우
			if (curr + 1 <= 100000 && (visited[curr + 1] == 0 || visited[curr + 1] == visited[curr] + 1)) { // 변경: 방문 여부와 최소 시간 체크
				visited[curr + 1] = visited[curr] + 1; // 변경: 최소 시간 갱신
				queue.add(curr + 1);
			}

			// 순간이동하는 경우
			if (curr * 2 <= 100000 && (visited[curr * 2] == 0 || visited[curr * 2] == visited[curr] + 1)) { // 변경: 방문 여부와 최소 시간 체크
				visited[curr * 2] = visited[curr] + 1; // 변경: 최소 시간 갱신
				queue.add(curr * 2);
			}

		}

	}

}