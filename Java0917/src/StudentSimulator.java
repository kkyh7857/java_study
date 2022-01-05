import java.util.Scanner;

public class StudentSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stuLise = new Student[10]; // 등록 할 학생의 배열
		int index = 0; // 등록 할 학생의 위치

		System.out.println("====== SMHRD 성적관리 시스템 ======");

		while (true) {
			System.out.println("[1]학생 등록 [2]성적 수정 [3] 종료");
			int choice = sc.nextInt();

			if (choice == 1 && index < stuLise.length) {

				System.out.print("동록할 학생 이름: ");
				String name = sc.next();
				System.out.print("동록할 학생 학번: ");
				String stuNumber = sc.next();

				Student st = new Student(name, stuNumber);
				stuLise[index++] = st;

			} else if (choice == 1 && index > stuLise.length) {
				System.out.println("인원 초과");

			} else if (choice == 2) {
				System.out.println("수정 할 학생 이름: ");
				String name = sc.next();
				// 해당 학생을 검색(시퀀설 서치: 배열의 0번부터 순차적으로 비교)
				int stuIndex = -1;
				for(int i = 0; i<index; i++) {
					if(name.equals(stuLise[i].getName())) {
						stuIndex = i;
					}
				}
				if(stuIndex == -1) {
					System.out.println("등록된 학생이 없습니다.");
				}else {
					// 1. 한번에 한 과목 수정
					// 2. 한번에 3과목 모두 수정
					stuLise[stuIndex].change(90, 80, 70);
					System.out.println("[1]한 과목씩 수정 [2]모두 수정 [3]종료");
					int choice2 = sc.nextInt();
					if(choice2 == 1) {
						String[] subject = {"java", "web", "iot"};
						
						//개별 수정
						System.out.println("수정 하고 싶은 과목을 선택하세요.");
						System.out.println("[1]java [2]web [3]iot ");
						int choiceSubject = sc.nextInt();
						if(choiceSubject == 1) {
							System.out.print("java: ");
							int javasc = sc.nextInt();
							stuLise[stuIndex].changeJava(javasc);
						}else if(choiceSubject == 2) {
							System.out.print("web: ");
							int websc = sc.nextInt();
							stuLise[stuIndex].changeJava(websc);
						}else if(choiceSubject == 3) {
							System.out.print("iot: ");
							int iotsc = sc.nextInt();
							stuLise[stuIndex].changeJava(iotsc);
						}
						System.out.println("수정되었습니다.");
						//통합수정
					}else if(choice2 == 2) {
						System.out.print("java: ");
						int javasc = sc.nextInt();
						stuLise[stuIndex].changeJava(javasc);
						System.out.print("web: ");
						int websc = sc.nextInt();
						stuLise[stuIndex].changeJava(websc);
						System.out.print("iot: ");
						int iotsc = sc.nextInt();
						stuLise[stuIndex].changeJava(iotsc);
						System.out.println("java: " + javasc + " web: " + websc + " iot: " + iotsc);
					}
				}
				
			} else if (choice == 3) {
				break;
			}

		}
	}

}
