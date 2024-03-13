import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	
		String[] input = bf.readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int V = Integer.parseInt(input[2]);
		/*
		 * 하루에 올라가는 총 높이는 A - B
		 * 목표 높이 V에서 마지막에는 B만큼 미끄러지지 않음
		 * 즉, V - B까지만 올라가면 됨
		 * 
		 * => V-B 까지 올라가는데 필요한 일수를 계산하면 됨
		 * (V - B) / (A - B)에서
		 * 
		 * 값이 나누어 떨어지지 않는 경우를 대비해야함 -> 3.333 일이면 4일 소요임
		 * (V - B) 에서 -1을 해주고, (A - B)로 나눈 뒤에 1을 더해줌
		 * 나누어 떨어지지 않는 경우에도 올바른 결과를 보장함 
		 */
		int days = (V - B - 1) / (A - B) + 1;
        System.out.println(days);

	}

}