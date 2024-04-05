import java.util.Arrays;
import java.util.LinkedList; // LinkedList 사용을 위한 import문
import java.util.Queue; // Queue 사용을 위한 import문
import java.util.Scanner; // Scanner 사용을 위한 import문

public class Main { // 숨바꼭질_1697 클래스 시작
    static int N, K, count; // 정수형 변수 N, K, count 선언
    static int[] visited = new int[100001]; // 100000까지의 정수를 방문 여부를 저장하는 배열 선언

    public static void main(String[] args) { // main 메소드 시작
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        N = sc.nextInt(); // N 입력 받음
        K = sc.nextInt(); // K 입력 받음

        BFS(N); // BFS 메소드 호출
       
    }

    private static void BFS(int n) { // BFS 메소드 시작
        Queue<Integer> queue = new LinkedList<>(); // Integer형 Queue 생성
        queue.add(n); // 초기 위치를 Queue에 추가

        visited[n] = 1; // 초기 위치 방문 표시

        while (!queue.isEmpty()) { // Queue가 빌 때까지 반복
            int curr = queue.poll(); // Queue에서 하나의 위치를 꺼냄

            if (curr == K) // 만약 현재 위치가 목표 위치와 같다면
                System.out.println(visited[curr] - 1); // 결과 출력하고 반복문 종료

            // 현재 위치에서 가능한 다음 위치 탐색
            if (curr - 1 >= 0 && visited[curr - 1] == 0) { // 왼쪽으로 한 칸 이동하는 경우
                visited[curr - 1] = visited[curr] + 1; // 방문 표시 및 이동 횟수 업데이트
                queue.add(curr - 1); // Queue에 추가
            }
            if (curr + 1 <= 100000 && visited[curr + 1] == 0) { // 오른쪽으로 한 칸 이동하는 경우
                visited[curr + 1] = visited[curr] + 1; // 방문 표시 및 이동 횟수 업데이트
                queue.add(curr + 1); // Queue에 추가
            }
            if (curr * 2 <= 100000 && visited[curr * 2] == 0) { // 순간이동하는 경우
                visited[curr * 2] = visited[curr] + 1; // 방문 표시 및 이동 횟수 업데이트
                queue.add(curr * 2); // Queue에 추가
            }
        }
    }
}