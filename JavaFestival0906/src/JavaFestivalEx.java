import java.util.Scanner;

public class JavaFestivalEx {

	public static void main(String[] args) {
		// �Է� �� ���� ���� ���� �𷡽ð� ��� �����
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ��: ");
		int v = sc.nextInt();
		     //
		for(int space = 1, star = v; star>=1; star-=2, space++) {
			for(int i = 0; i<space; i++) {
				System.out.print(" ");
			}
			for(int i = 0; i<star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int space = v-(v-v/2), star = 3; space>=1; star+=2, space--) {
			for(int i = 0; i<space; i++) {
				System.out.print(" ");
			}
			for(int i = 0; i<star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
