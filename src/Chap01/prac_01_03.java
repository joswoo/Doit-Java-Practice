package Chap01;
import java.util.Scanner;

/*	Practice 01_03
 	네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
 */

public class prac_01_03 {
	static int min4(int a, int b, int c, int d) {
		int min = a;		// 최솟값을 a라 하면,
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;

		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a의 값：");
		int a = stdIn.nextInt();
		System.out.print("b의 값：");
		int b = stdIn.nextInt();
		System.out.print("c의 값：");
		int c = stdIn.nextInt();
		System.out.print("d의 값：");
		int d = stdIn.nextInt();

		int min = min4(a, b, c, d);

		System.out.printf("최솟값은 %d 입니다.", min);
	}
}
