import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		// 단 수를 입력 받고, 어느수까지 출력할 건지 입력 받아 그렇게 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단 수 입력: ");
		int dan = sc.nextInt();
		System.out.println("어느 수까지 출력: ");
		int wantNum = sc.nextInt();
		
		System.out.println(dan + "단");
		for(int i = 1; i<=wantNum; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		sc.close();
	}

}
