import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 몸무게 빼기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int nowkg = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int wantkg = sc.nextInt();
		int i = 0;
		while(true) {
			System.out.print(i+1 + "주차 감량 몸무게: ");
			int losskg = sc.nextInt();
			nowkg = nowkg - losskg;
			if(nowkg <= wantkg) {
				System.out.print(nowkg + "kg 달성!! 축하합니다!");
				break;
			}else {
				i++;
			}
		}
		sc.close();
	}

}
