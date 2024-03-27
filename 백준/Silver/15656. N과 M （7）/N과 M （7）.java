import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int[] nums, result;
	static int N, M;
	static BufferedReader br;
	static BufferedWriter bw;
	static StringTokenizer st;

	// 시간초과가 나서 scanner에서 bufferedReader로 변경
	// 시간초과가 나서 bufferedWriter로 변경
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine(), " ");
		
		// 1부터 N까지 자연수 중
		N = Integer.parseInt(st.nextToken());
		// 중복 없이 M개를 고른 수열
		M = Integer.parseInt(st.nextToken());
		
		result = new int[M];
		
		// bufferedReader에서 readLine은 한줄씩이기 때문에 다시 설정해줌
		st = new StringTokenizer(br.readLine(), " ");
		nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nums);
		
		perm(0, 0);

		bw.flush();
		bw.close();

	}

	//idx: 결과 배열에 저장할 위치
	//visited: 사용한 원소의 위치를 기록하기 위한 정수
	public static void perm(int idx, int visited) throws IOException {
		if (idx == M) {
			for(int i = 0; i < M; i++) {
				bw.write(result[i] + " ");
			}
			bw.write("\n");
			return;
		}
		//모든 원소를 돌면서 판단하겠다
		for (int i = 0; i < N; i++) {
			//if ((visited & (1 << i)) != 0) continue;
			//아래의 코드가 실행된다는 것은 i번째 원소를 하용하지 않았다는 것
			result[idx] = nums[i];
			perm(idx+1, visited | (1<<i));
					
		}

	}

}