import java.util.Scanner;

public class StudentSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stuLise = new Student[10]; // ��� �� �л��� �迭
		int index = 0; // ��� �� �л��� ��ġ

		System.out.println("====== SMHRD �������� �ý��� ======");

		while (true) {
			System.out.println("[1]�л� ��� [2]���� ���� [3] ����");
			int choice = sc.nextInt();

			if (choice == 1 && index < stuLise.length) {

				System.out.print("������ �л� �̸�: ");
				String name = sc.next();
				System.out.print("������ �л� �й�: ");
				String stuNumber = sc.next();

				Student st = new Student(name, stuNumber);
				stuLise[index++] = st;

			} else if (choice == 1 && index > stuLise.length) {
				System.out.println("�ο� �ʰ�");

			} else if (choice == 2) {
				System.out.println("���� �� �л� �̸�: ");
				String name = sc.next();
				// �ش� �л��� �˻�(������ ��ġ: �迭�� 0������ ���������� ��)
				int stuIndex = -1;
				for(int i = 0; i<index; i++) {
					if(name.equals(stuLise[i].getName())) {
						stuIndex = i;
					}
				}
				if(stuIndex == -1) {
					System.out.println("��ϵ� �л��� �����ϴ�.");
				}else {
					// 1. �ѹ��� �� ���� ����
					// 2. �ѹ��� 3���� ��� ����
					stuLise[stuIndex].change(90, 80, 70);
					System.out.println("[1]�� ���� ���� [2]��� ���� [3]����");
					int choice2 = sc.nextInt();
					if(choice2 == 1) {
						String[] subject = {"java", "web", "iot"};
						
						//���� ����
						System.out.println("���� �ϰ� ���� ������ �����ϼ���.");
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
						System.out.println("�����Ǿ����ϴ�.");
						//���ռ���
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
