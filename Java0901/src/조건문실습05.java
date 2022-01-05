import java.util.Scanner;

public class 조건문실습05 {

	public static void main(String[] args) {
		// int 타입의 변수 grade를 선언하고 키보드로 값을 입력
		// grade가 90이상이면 'A학점입니다.'
		// 80점 이상 90점 미만일 경우 b학점입니다.
		// 70점 이상 80점 미만일 경우 c학점입니다. 
		//그 외에는 화이팅! 출력
		
		System.out.print("점수 입력>> ");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
				
		if(grade>=90) {
			System.out.println("A학점입니다.");
		}else if(grade>=80) {
			System.out.println("B학점입니다.");
		}else if(grade>=70) {
			System.out.println("C학점입니다.");
		}
		if(grade>=60) {
			System.out.println("D");
		}
		if(grade>=50) {
			System.out.println("휴학ㄱ");
		}
			
	}

}
