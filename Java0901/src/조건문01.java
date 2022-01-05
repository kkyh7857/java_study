import java.util.Scanner;

public class 조건문01 {

	public static void main(String[] args) {
		
		//Scanner 를 사용하여 int number -> 값을 저장
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요 ");
		
		int number =  sc.nextInt();
		//number 가 100보다 클 때 100보다 큽니다 문장 출력
		if(number>100) {
			System.out.println("100보다 큽니다");
		}
		else if(number<=100 && number>90){
			System.out.println("100보다 작거나 같고 90보다 큽니다");
		}
		else if(number<=90 && number>80){
			System.out.println("90보다 작거나 같고 80보다 큽니다");
		}
		else if(number<=80 && number>70){
			System.out.println("80보다 작거나 같고 70보다 큽니다");
		}
		else {
			System.out.println("70보다 작거나 같습니다");
		}

	}

}
