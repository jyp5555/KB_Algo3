package 백준_B11659_구간합구하기4;

import java.util.Scanner;

public class 백준_B11659_구간합구하기4_임현지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] s = new int[n+1];
		int num = 0;
		for (int i = 1; i <= n; i++) {
			num+=arr[i];
			s[i] = num;
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int ans = s[b] - s[a-1];
			
			System.out.println(ans);
		}
	}

}
