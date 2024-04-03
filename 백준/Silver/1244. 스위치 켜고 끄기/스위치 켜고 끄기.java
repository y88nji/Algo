import java.util.Scanner;

public class Main {
    static int N, SN;
    static int[] switches;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        switches = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            switches[i] = sc.nextInt();
        }

        SN = sc.nextInt();
        for (int i = 0; i < SN; i++) {
            int gender = sc.nextInt();
            int num = sc.nextInt();

            if (gender == 1) { // 남학생
                for (int j = num; j <= N; j += num) {
                    switches[j] ^= 1; // XOR 연산을 통해 스위치를 반전
                }
            } else { // 여학생
                switches[num] ^= 1; // 일단 해당 스위치는 무조건 반전
                int left = num - 1;
                int right = num + 1;

                while (left >= 1 && right <= N && switches[left] == switches[right]) {
                    switches[left] ^= 1;
                    switches[right] ^= 1;
                    left--;
                    right++;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(switches[i] + " ");
            if (i % 20 == 0) System.out.println();
        }
    }
}