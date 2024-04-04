import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N, M, count; // 미로의 행, 열 크기 및 경로의 길이를 저장하는 변수
    static int[][] field; // 미로 정보를 저장하는 배열
    static boolean[][] visited; // 방문 여부를 저장하는 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 행 크기 입력
        M = sc.nextInt(); // 열 크기 입력

        field = new int[N][M]; // 미로 배열 초기화
        visited = new boolean[N][M]; // 방문 여부 배열 초기화

        for (int r = 0; r < N; r++) {
            String temp = sc.next(); // 미로 정보를 문자열로 입력
            for (int c = 0; c < M; c++) {
                field[r][c] = temp.charAt(c) - '0'; // 문자열을 숫자로 변환하여 미로 배열에 저장
            }
        }

        // 모든 위치에서 시작하여 BFS 실행
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (field[r][c] == 1 && !visited[r][c]) { // 갈 수 있는 길이고, 방문하지 않은 곳이라면
                    BFS(r, c); // BFS 호출
                }
            }
        }

        // 미로 상태 출력
//        for (int r = 0; r < N; r++) {
//            for (int c = 0; c < M; c++) {
//                System.out.print(field[r][c] + " "); // 미로 상태 출력
//            }
//            System.out.println();
//        }

        System.out.println(field[N - 1][M - 1]); // 마지막 칸의 값을 출력 (목적지까지의 최단 경로의 길이)
    }

    private static void BFS(int r, int c) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(r);
        queue.add(c);
        count = 1; // 시작 위치를 카운트에 포함
        visited[r][c] = true; // 시작 위치 방문 표시
        field[r][c] = count; // 시작 위치의 값을 1로 설정
        count++;

        int[] dr = {1, -1, 0, 0}; // 상하좌우 이동을 위한 배열
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int cr = queue.poll(); // 현재 위치의 행
            int cc = queue.poll(); // 현재 위치의 열

            // 상하좌우 이동 확인
            for (int i = 0; i < 4; i++) {
                int nr = cr + dr[i]; // 새로운 행 위치
                int nc = cc + dc[i]; // 새로운 열 위치

                // 새로운 위치가 미로 범위 내에 있고, 방문하지 않았고, 갈 수 있는 길이라면
                if (nr >= 0 && nr < N && nc >= 0 && nc < M &&
                        !visited[nr][nc] && field[nr][nc] == 1) {

                    queue.add(nr); // 큐에 새로운 위치 추가
                    queue.add(nc);
                    visited[nr][nc] = true; // 새로운 위치 방문 표시
                    field[nr][nc] = field[cr][cc] + 1; // 새로운 위치의 값을 현재 위치의 값 + 1로 설정 (최단 경로)
                    count++; // 경로의 길이 증가
                }
            }
        }
    }
}