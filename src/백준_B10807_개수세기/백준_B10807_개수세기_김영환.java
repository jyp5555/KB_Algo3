package 백준_B10807_개수세기;

import java.util.Scanner;

public class 백준_B10807_개수세기_김영환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N
		int[] arr = new int[N]; //값 저장용
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt(); //v
		//
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			if(j==v) count++;
		}
		System.out.println(count);
	}
}






