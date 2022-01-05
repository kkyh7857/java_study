
public class ForExam02 {

	public static void main(String[] args) {
		// 1~20까지 숫자를 출력.
		// 홀수는 양수로 출력하고, 짝수는 음수로 출력.

//		for(int num = 1; num<=20; num++) {
//		조건문 풀이
//			if(num%2==1) {
//				System.out.print(num+" ");
//			}else {
//				System.out.print(-num+" ");
//			}
//		}
//		삼항연산자 풀이
//			int c = (num%2==1)?num:-num;
//			System.out.print(c + " ");
//		for문 조건 추가로 풀이 하는 법.
		for (int even = 2, odd = 1; even <= 20 || odd <= 20; even += 2, odd += 2) {
			System.out.print(odd + " " + -even + " ");
		}
//		for(int num = 1, i = -1; num<=20;num++) {
//			i*=-1;
//			System.out.print(i*num+" ");
//		}

	}

}
