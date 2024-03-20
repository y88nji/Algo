import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1. 문자열 입력받기
		 * 2. 현재 위치와 다음 위치 비교해서 같은 경우 패스
		 * 3. 현재 위치와 다음 위치 비교해서 다른경우
		 * 4. 현재보다 앞에 뒤에께 나왔는지 나왔는지 체크
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		int checker = 0;

		for (int tc = 0; tc < N; tc++) {
			String str = sc.nextLine();
			a: for (int i = 1; i < str.length() - 1; i++) {
				if (str.charAt(i) != str.charAt(i + 1)) {
					for (int j = 0; j < i; j++) {
						if (str.charAt(j) == str.charAt(i + 1)) {
							checker--;
							break a;
						}
					}
				}
			}
		}
		System.out.println(N + checker);
	}

}