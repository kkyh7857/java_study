import java.util.Scanner;

public class switch01 {

	public static void main(String[] args) {
		
		//월을 입력 받아 봄, 여름, 가을, 겨울 중에 맞는 계절을 출력
		// 겨울 12,1,2
		// 봄 3,4,5
		// 여름 6,7,8
		// 가을 9,10,11
		
		System.out.print("월을 입력해주세요>>");
		Scanner sc = new Scanner(System.in);
		int month =sc.nextInt();
		//복사할 부분 드레그 ctrl + alt + 방향키: 복사 
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("1~12사이의 숫자를 입력해주세요!");
			break;
		}
		
	}

}
