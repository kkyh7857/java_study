import java.util.Scanner;

public class JavaFestivalEx02 {

	public static void main(String[] args) {
		// ���ڸ� �� * ���ڸ� �� 
		// ���ڸ� �� * ���ڸ� �� �� �����ڸ�
		// ���ڸ� �� * ���ڸ� �� �� �����ڸ�
		// ���ڸ� �� * ���ڸ� �� �� �����ڸ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�� ° ���� �Է�: ");
		int firstNum = sc.nextInt();
		System.out.print("�ι� ° ���� �Է�: ");
		int secondNum = sc.nextInt();
		int total = firstNum*secondNum;
//		if(firstNum>100 && secondNum>100) {
//			System.out.println(firstNum*(secondNum%10));
//			System.out.println(firstNum*(secondNum%100/10));
//			System.out.println(firstNum*(secondNum/100));
//			System.out.println(firstNum*secondNum);
//		}
		for(int i = 0; i<3; i++) {
			System.out.println(firstNum*(secondNum%10));
			secondNum = secondNum/10;
		}
		System.out.println(total);
	}

}
