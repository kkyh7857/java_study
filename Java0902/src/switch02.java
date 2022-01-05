import java.util.Scanner;

public class switch02 {

	public static void main(String[] args) {
		
		System.out.println("점수입력> ");
		Scanner sc = new Scanner(System.in);
		int totalScore = sc.nextInt();
		if(totalScore>100) {
			System.out.print("100점 이상은 ...");
		}
		else {
		switch(totalScore/10) { // (비교 대상이 될 값!)
		case 10:
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		default:
			System.out.println("D학점입니다.");
		}
		}
		System.out.println("수고하셨습니다.");

	}

}
