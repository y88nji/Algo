import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N, M, day;
	static boolean check1, check2;
	static int[][] field;
	static boolean[][] visited;
	static Queue<Integer> queue;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
		N = sc.nextInt();

		field = new int[N][M];
		visited = new boolean[N][M];
		queue = new LinkedList<>();

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				field[r][c] = sc.nextInt();
			}
		}

		check1 = true; // 모두 익었을 때, 필드에 -1 혹은 양수만 있어야 함 -> 0 있으면 안됨
		// 저장될때부터 모두 익음
		out: for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (field[r][c] == 0) {
					check1 = false;
					break out;
				}
			}
		}

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				// 시작점이 여러개일 수 있으니 큐에 다 넣어주고 시작하기
				if (field[r][c] == 1 && visited[r][c] == false) {
					queue.add(r);
					queue.add(c);
					visited[r][c] = true;
				}
			}
		}

		BFS(); // 배열을 날짜값으로 변경해줌

		
		check2 = false; // 뭔가 안익었을 때, 필드에 -1 혹은 0만 있으면 트루 -> 양수 있으면 false

		// 모두 익지 못하는 상황
		out: for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (field[r][c] == 0) {
					check2 = true;
					break out;
				}
			}
		}

		// 지나간 날짜 계산
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				day = Math.max(field[r][c], day);
			}
		}

		// 출력부
		if (check1)
			System.out.println(0);
		else if (check2)
			System.out.println(-1);
		else
			System.out.println(day - 1);

	}

	private static void BFS() {
		int[] dr = { 1, -1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		while (!queue.isEmpty()) {
			int cr = queue.poll();
			int cc = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nr = cr + dr[i];
				int nc = cc + dc[i];

				if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc] && field[nr][nc] == 0) {

					queue.add(nr);
					queue.add(nc);
					visited[nr][nc] = true;
					// 다음꺼는 현재꺼보다 1 증가한 수
					field[nr][nc] = field[cr][cc] + 1;

				}
			}

		}

	}

}