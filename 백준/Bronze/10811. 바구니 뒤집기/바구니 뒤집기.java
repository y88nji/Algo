import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 배열의 크기
		int N = sc.nextInt();
		// 몇 번 뒤집을지
		int M = sc.nextInt();
		
		// 배열 선언 및 값 할당
		int[] arr = new int [N];
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		
		// M번 만큼 바구니 뒤집기
		for(int i = 0; i < M; i++) {
			// 역순으로 정렬할 범위 지정(num번째 수)
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			// 역순 값 저장할 임시 배열 선언
			int[] temp = new int [num2 - num1 + 1];

			// 범위 안의 수 역순 정렬
			for (int j = num2 - 1, k = 0; j >= num1 - 1; j--, k++) {
				temp[k] = arr[j];
			}
			
			// 임시 배열을 원래 배열의 그 자리 값에 저장
			for (int k = 0, l = num1 - 1; k <= num2 - num1; k++, l++) {
				arr[l] = temp[k];
				
			}
			
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}