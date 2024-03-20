import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -1;
		int r = 0;
		int c = 0;
		
		int[][] arr = new int [9][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
				if(max < arr[i][j]) {
					max = arr[i][j];
					r = i;
					c = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.printf("%d %d", r+1, c+1);
	}

}
