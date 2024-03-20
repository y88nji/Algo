import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[][] field = new int[100][100];
		int N = 10;
		
		int T = sc.nextInt();
		
		for(int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			for(int i = n; i < n + N; i++) {
				for(int j = m; j < m + N; j++) {
					field[i][j] = 1;
				}
			}
		}
			
		int count = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(field[i][j] > 0){
					count++;
				};
			}
		}
		
		System.out.println(count);

	}

}
