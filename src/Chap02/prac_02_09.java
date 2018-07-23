package Chap02;
import java.util.Scanner;

public class prac_02_09 {
	// 각 달의 일 수
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// 평년
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// 윤년
	};

	// 서기 year년은 윤년인가? (윤년：1／평년：0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// 서기 y년 m월 d일의 그 해 경과 일수를 구함
	static int dayOfYear(int y, int m, int d) {
		int days = d;						// 일 수
		
		while (--m > 0)		// 1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][m - 1];
		return days;
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		int days;
		days = mdays[isLeap(y)][m - 1] - d;
				
		while(++m <13) 	// (m+1)월~12월의 일 수를 더
			days += mdays[isLeap(y)][m - 1];
		return days;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;							// 다시 한 번?

		System.out.println("그 해 경과 일 수를 구합니다.");

		do {
			System.out.print("년：");  int year  = stdIn.nextInt();	// 년
			System.out.print("월：");  int month = stdIn.nextInt();	// 월
			System.out.print("일：");  int day   = stdIn.nextInt();	// 일

			System.out.printf("그 해 남은 일수는 %d입니다.\n", leftDayOfYear(year, month, day));

			System.out.print("한번 더 할까요? (1.예／0.아니오）：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}