import java.util.Scanner;

public class Dowhile실습01 {

	public static void main(String[] args) {

		// 현재 몸무게와 목표몸무게를 입력 받고 
		// 주차 별 감량 몸무게를 입력 받아.
		// 목표몸무게를 달성하면 축하한다는 문구를 출력. 프로그램 종료.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게: ");
		int weight = sc.nextInt();
		System.out.print("목표 몸무게: ");
		int goalWeight = sc.nextInt();
		int n = 1;//몇 주차인지 알기 위한 변수
		do {//살 빼는 로직
			
			System.out.print(n+"주차 감량 몸무게: ");
			int gam = sc.nextInt();//감량
			weight = weight - gam;//현재 몸무게 변경
			n++;

		}while(weight>goalWeight);
			
		System.out.println(weight+"kg 달성!! 축하합니다!");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("현재 몸무게: ");
//		int nowkg = sc.nextInt();
//		System.out.print("목표 몸무게: ");
//		int wantkg = sc.nextInt();
//		int week = 1;
//		
//		while(true) {
//			System.out.println(week+"주차 감량 몸무게: ");
//			int losskg = sc.nextInt();
//			nowkg = nowkg - losskg;
//			week++;
//			if(nowkg<wantkg) {
//				break;
//			}
//		}
//		System.out.println(nowkg+"달성!! 축하합니다!");
	}

}
