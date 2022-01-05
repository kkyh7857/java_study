import java.util.Scanner;

public class JavaEx03 {

	public static void main(String[] args) {
		// 1.회원가입 2.로그인 3.종료
		// id, pw배열을 만들어 회원가입을 하고, 로그인 할 수 있게 만들기

		Scanner sc = new Scanner(System.in);
		System.out.println("====회원관리 시스템====");
		String[] id_array = new String[3];
		String[] pw_array = new String[3];

		int i = 0; // 배열의 초기값은 0;
		
		while (true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			int choice = sc.nextInt();
			
			if (choice == 1) { // 1.회원가입
				System.out.print("id 입력: ");
				id_array[i] = sc.next(); //0~배열의 크기까지 인덱스에 id값 입력

				System.out.print("pw 입력: ");
				pw_array[i] = sc.next(); //0~배열의 크기까지 인덱스에 pw값 입력
				
				i++; //0~ 인덱스 번호 지정
				
				System.out.println("====회원가입 성공====");

			} else if (choice == 2) { // 2.로그인

				System.out.print("id 입력: ");
				String input_id = sc.next();

				System.out.print("pw 입력: ");
				String input_pw = sc.next();
				
				int count = 0;
				// 인덱스 j를 id_array의 크기만큼 for문으로 반복해 돌리고, if문으로 조건을 만든다.
				// 의미: 이 구문은, 내가 입력한 값이 id_array와 pw_array에 있는지 찾는 구문이다. 
				for (int j = 0; j < id_array.length; j++) { //요 부분이 매우 중요하다.★★★★★
					if (id_array[j].equals(input_id) && pw_array[j].equals(input_pw)) {
						System.out.println("====로그인 성공====");
						count++;
					} 
				}
			
				if( count == 0) { //count가 0이라면 -> 위의 if문이 동작하지 않았다면, 즉 로그인 정보가 없음.
					System.out.println("로그인 정보 없음");
				}
			} else if (choice == 3) { // 3.종료
				System.out.println("====프로그램 종료====");
				break;
			} else {
				System.out.println("잘못 입력");
			}
		}
	}
}









