package Chap02;
import java.util.Random;
import java.util.Scanner;

public class prac_02_02 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		print(a);
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a["+i+"]과 a["+(a.length-i+1)+"]를 교환합니다.");
			swap(a, i, a.length - i - 1);
			print(a);
		}		
	}
	
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a의 요솟수는 ：");
		int numa = stdIn.nextInt(); // 요솟수
		int[] a = new int[numa]; // 요솟수 numa인 배열
		for (int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		reverse(a);
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}
