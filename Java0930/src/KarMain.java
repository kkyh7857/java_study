import java.util.Scanner;

import javax.swing.JFrame;

public class KarMain {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 200);
		f.setLayout(null);
		f.setVisible(true);
		
		YoungCar kar = new YoungCar();
		// ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��>>");
		int num = sc.nextInt();
		kar.go(num);
		System.out.print("���� ��ġ>>" + kar.youngCarPosition);
		
		// ����
		
		// �ν���
		sc.close();
	}

}
