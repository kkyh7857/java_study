import java.util.Scanner;

public class ���ǹ�01 {

	public static void main(String[] args) {
		
		//Scanner �� ����Ͽ� int number -> ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է����ּ��� ");
		
		int number =  sc.nextInt();
		//number �� 100���� Ŭ �� 100���� Ů�ϴ� ���� ���
		if(number>100) {
			System.out.println("100���� Ů�ϴ�");
		}
		else if(number<=100 && number>90){
			System.out.println("100���� �۰ų� ���� 90���� Ů�ϴ�");
		}
		else if(number<=90 && number>80){
			System.out.println("90���� �۰ų� ���� 80���� Ů�ϴ�");
		}
		else if(number<=80 && number>70){
			System.out.println("80���� �۰ų� ���� 70���� Ů�ϴ�");
		}
		else {
			System.out.println("70���� �۰ų� �����ϴ�");
		}

	}

}
