import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// 총금액을 입력 받아
		// 만원, 오천원, 천원, 오백원, 백원  단위로 나눠라
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력: ");
		int money = sc.nextInt();
		System.out.println();
		System.out.println("잔돈 : " + money + "원");
		System.out.println("10,000원 :" + money/10000 + "개");
		System.out.println("5,000원 : " + money%10000/5000 + "개");
		System.out.println("1,000원 : " + money%5000/1000 + "개");
		System.out.println("500원 : " + money%10000%1000/500 + "개");
		System.out.println("100원 : " + money%500/100 + "개");
	}

}
