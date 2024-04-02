import java.util.Scanner;

public class Main {

	static int T, R, C, N, count;
	static int[][] field;
	static boolean[][] visited;
	static int[] dx;
	static int[] dy;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			
			R = sc.nextInt();
			C = sc.nextInt();
			N = sc.nextInt();
			count = 0;

			field = new int[R][C];
			visited = new boolean[R][C];

			for (int n = 0; n < N; n++) {
				int r = sc.nextInt();
				int c = sc.nextInt();
				field[r][c] = 1;
			}

			for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					if (visited[r][c] == false && field[r][c] == 1) {
						DFS(r, c);
						count++;
					}
				}
			}

			System.out.println(count);
		}

	}

	private static void DFS(int r, int c) {
		visited[r][c] = true;

		int[] dr = { 1, -1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];

			if (nr >= 0 && nr < R && nc >= 0 && nc < C && visited[nr][nc] == false && field[nr][nc] == 1) {
				DFS(nr, nc);
			}
		}
	}

}