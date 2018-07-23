package Chap01;
import java.util.Scanner;

/*	Practice 01_02
 	세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
 */

public class prac_01_02 {
	static int min3(int a, int b, int c) {
		int min = a;		//최솟값을 a라 하면,
		if (b<min)
			min = b;
		if (c<min)
			min = c;
		return min;
	}
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a :");
		int a = stdIn.nextInt();
		System.out.print("b :");
		int b = stdIn.nextInt();
		System.out.print("c :");
		int c = stdIn.nextInt();
		
		int min = min3(a, b, c);
		System.out.printf("최솟값은 %d 입니다", min);
	
	}
}
