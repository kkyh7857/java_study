import java.util.Scanner;

public class 조건문실습04 {

	public static void main(String[] args) {
		
		//컴퓨터야 너는 일한 시간 입력 이라고 말하면 내가 일한 시간을 입력할께
		//그럼 너는 그 값을 workTime이라는 변수에 담아줘
		//그리고 workTime에 담긴 값이 8보다 크다면 
		//8시간 이후 일한 시간 부터는 5000원에 1.5배인 7500원으로 시급을 계산해줘
		//그 후에 총 일당을 출력해주면 돼!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간 입력>>");
		int hour = sc.nextInt();
		int hourdon = 5000;	
		int chohourdon = 7500;
		int ildang = 0;
		if(hour>8) {
			ildang=chohourdon*(hour-8)+hourdon*8;
		}
		else {
			ildang = hourdon*8;
		}
		System.out.println("총 임금은 " + ildang +" 입니다.");
		//강제변환 (int)(5000*1.5);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("시간>> ");
//		int workTime = sc.nextInt();
//		System.out.print("시급?? ");
//		int hourMoney = sc.nextInt();
//
//		int resultMoney;
//		if(workTime>8) {
//			resultMoney = (int)(hourMoney*8 + (workTime-8)*(hourMoney*1.5));//강제변환>>정수*실수->정수형으로 변환
//		}
//		else {
//			resultMoney = workTime * hourMoney;
//		}
//		System.out.println("당신의 총 임금은 " + resultMoney + "원 입니다.");
	}
}
