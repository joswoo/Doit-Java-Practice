package Chap01;
import java.util.Scanner;

/*	Practice 01_05
 	중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다.
 	그러나 실습 1C-1의 med3 메서드에 비해 효울이 떨어지는데,
 	그 이유를 설명하세요.

static int med3 (int a, int b, int c) {
	if ((b >= a && c <= a) || (b <= a && c >= a))
		return a;
	else if ((a > b && c < b) || (a <b && c > b))
		return b;
	return c;
}
*/
//if ((b >= a && c<= a) || (b <= a && c >= a))
//	에 주목합니다. 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의 
//	else if ((a > b && c < b) || (b <= a && c > b))
//	으로 수행합니다. 결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.

/*	처음 if문에서 (b >= a), (b <= a)의 비교를 하였지만
	아래 else if문에서 (a > b), (a < b)로 다시 비교한다.
	결국 처음의 if가 성립한 경우에도 두 번째의 else if에서 
	같은 비교를 하므로 효율이 떨어진다.
*/
