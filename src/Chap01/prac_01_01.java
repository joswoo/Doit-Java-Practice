package Chap01;
import java.util.Scanner;

/*	Practice 01_01
	네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
*/

public class prac_01_01 {
	static int max4(int a, int b, int c, int d) {
		int max = a;		//최댓값을 a라 하면,
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a：");
		int a = stdIn.nextInt();
		System.out.print("b：");
		int b = stdIn.nextInt();
		System.out.print("c：");
		int c = stdIn.nextInt();
		System.out.print("d：");
		int d = stdIn.nextInt();

		int max = max4(a, b, c, d);

		System.out.printf("최댓값은 %d 입니다.", max);
	}
}
