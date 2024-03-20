import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		
		for(int tc = 1; tc <= P; tc++) {
			
			int N = sc.nextInt();
			
			int[] arr = new int [20];
			// 배열 입력 받음
			for(int i = 0; i < 20; i++) {
				arr[i] = sc.nextInt();
			}
			
			int count = 0; // 밀려난 경우
			// 삽입 정렬 구현
			// count를 세기 위해 바로 앞자리와 스왑하도록 변경
			for(int i = 1; i < arr.length; i++) {
				for(int j = i - 1; j >= 0; j--) {
					if(arr[i] < arr[j]) {
						int temp = arr[i-1];
						arr[i-1] = arr[j];
						arr[j] = temp;
						count++;

					}
				}
			}
			
			System.out.println(N + " " + count);
			
		}

	}

}