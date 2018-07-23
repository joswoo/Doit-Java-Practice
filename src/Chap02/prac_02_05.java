package Chap02;
import java.util.Scanner;

public class prac_02_05 {
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[num-i-1];
		System.out.print("복사된 a의 배열은 a : ");
		print(a);
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

		System.out.print("b의 요솟수는 ：");
		int numb = stdIn.nextInt(); // 요솟수
		int[] b = new int[numb]; // 요솟수 numb인 배열
		for (int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		System.out.print("a의 배열은 : ");
		print(a);
		System.out.print("b의 배열은 : ");
		print(b);
		copy(a,b);
		
	}
}