package 백준_B10807_개수세기;

import java.util.Scanner;

public class 백준_B10807_개수세기_임현지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int cnt = 0;
		for (int i : arr) {
			if(i==v) cnt += 1;
		}
		System.out.println(cnt);
	}

}
