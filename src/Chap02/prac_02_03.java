package Chap02;
import java.util.Scanner;

public class prac_02_03 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		sumOf(a);
		System.out.println(sumOf(a));
	}
}
