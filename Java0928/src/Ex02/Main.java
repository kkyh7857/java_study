package Ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 도형 넓이 계산 프로그램
		// 1. 객체지향을 적용해서 설계
		// 2. 상속 개념을 적용
		// 3. 다형성을 이용해서 확장이 쉬운 프로그램으로 설계
		// 다형성
		// 같은 기능(메소드)을 호출하더라도 객체에 따라 다르게 동작하는 것
		// 상위 클래스의 동작을 하위클래스에서 다시 정의하여 사용하는 것 또한 다형성으로 볼 수 있다.

		System.out.println("====도형 넓이 계산기====");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("[1]삼각형 [2]사각형 [3]종료");
			int chioce = sc.nextInt();
			if (chioce == 1) {
				// 1. 데이터 입력
				System.out.print(Triangle.getName() + "밑변 >> ");
				double base = sc.nextDouble();
				System.out.print(Triangle.getName() + "높이 >> ");
				double height = sc.nextDouble();
				// 2. 삼각형 객체 생성
				Triangle Tri = new Triangle(base, height);
				// 3. 삼각형의 넓이 계산 후 출력
				System.out.println(Triangle.getName() + "의 넓이는: " + Tri.calArea());

			} else if (chioce == 2) {
				// 1. 데이터 입력
				System.out.print(Renctangle.getName()+"가로 >> ");
				double width = sc.nextDouble();
				System.out.print(Renctangle.getName()+"세로 >> ");
				double height = sc.nextDouble();
				// 2. 사각형 객체 생성
				Renctangle Renc = new Renctangle(width, height);
				// 3. 사각형의 넓이 계산 후 출력
				System.out.println(Renctangle.getName()+"의 넓이는: " + Renc.calArea());

			} else if (chioce == 3) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
