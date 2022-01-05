import java.util.Scanner;

import javax.swing.JFrame;

public class KarMain {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 200);
		f.setLayout(null);
		f.setVisible(true);
		
		YoungCar kar = new YoungCar();
		// 전진
		Scanner sc = new Scanner(System.in);
		System.out.print("전진 값>>");
		int num = sc.nextInt();
		kar.go(num);
		System.out.print("현재 위치>>" + kar.youngCarPosition);
		
		// 후진
		
		// 부스터
		sc.close();
	}

}
