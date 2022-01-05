import java.util.Scanner;

public class JavaFestivalEx01 {

	public static void main(String[] args) {
		// 원하는 수를 입력 하고 단 수와 곱하는데
		// 단 수 와 입력한 수까지의 곱셈을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 선택: ");
		int dan = sc.nextInt();
		System.out.print("원하는 수 입력: ");
		int wantNum = sc.nextInt();
		
		System.out.println(dan+"단");
		
		for(int j = 1; j<=wantNum; j++) {
			System.out.println(dan+"*"+j+"="+dan*j);
		}
	}

}
