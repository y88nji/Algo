import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		char[][] arr = new char[5][15];
		
		// 문자열을 문자 배열로 입력받기
		for (int i = 0; i < 5; i++) {
			String str = bf.readLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				if (arr[i][j] != '\0'){
					System.out.print(arr[i][j]);
				}
			}
		}

	}
}
