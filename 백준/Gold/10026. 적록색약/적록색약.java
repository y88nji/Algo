import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N, count1, count2;
	static char color;
	static char[][] arr;
	static boolean visited[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		arr = new char[N][N];
		for (int r = 0; r < N; r++) {
			String temp = sc.next();
			for (int c = 0; c < N; c++) {
				arr[r][c] = temp.charAt(c);
			}
		}
		
		visited = new boolean[N][N];

		// R G B 확인
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				color = arr[r][c];
				if (visited[r][c] == false && arr[r][c] == color) {
					// 해당 위치에 대해서 다시 DFS를 실행한다. 그리고 count 덩어리 수를 하나 증가시킨다.
					DFS(r, c);
					count1++;
				}
			}
		}
		System.out.print(count1 + " ");

		// RG B로 변환
		visited = new boolean[N][N];
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				if(arr[r][c] == 'G') arr[r][c] = 'R';
			}
		}
		
		// RG B 확인
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				color = arr[r][c];
				if (visited[r][c] == false && arr[r][c] == color) {
					DFS(r, c);
					count2++;
				}
			}

		}
		
		
		System.out.println(count2);

	}

	private static void DFS(int r, int c) {
		visited[r][c] = true;

		int[] dr = { 1, -1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (nr >= 0 && nr < N && nc >= 0 && nc < N &&
					visited[nr][nc] == false && arr[nr][nc] == color) {
				DFS(nr, nc);
			}
		}

	}

}