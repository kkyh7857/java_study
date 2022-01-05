import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// 현재 몸무게와 목표 몸무게를 입력 받아
		// 주 별 감량 몸무게를 입력 받아 
		// 목표 달성 시 축하 메시지 입력 후 종료
	
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int nowkg = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int wantkg = sc.nextInt();
		
		int week = 1;
//		do {
//			System.out.print(week + "주차 감량 몸무게 : ");
//			int losskg = sc.nextInt();
//			nowkg = nowkg - losskg;
//			week++;
//			
//		}while(nowkg > wantkg);
//		
//		System.out.println(nowkg + "kg 달성!! 축하합니다!");
		
		while(true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			int losskg = sc.nextInt();
			nowkg = nowkg - losskg;
			week++;
			if(nowkg <= wantkg) {
				break;
			}
		}
		System.out.println(nowkg + "kg 달성!! 축하합니다!");	
	}

}
