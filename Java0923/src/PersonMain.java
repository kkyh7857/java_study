import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 10���� �� ��ȭ��ȣ�� �迭 ����
		PersonInfo[] list = new PersonInfo[5];
		
		System.out.println("�̸� �Է� >> ");
		String name = sc.next();
		
		System.out.println("��ȣ �Է� >> ");
		String number = sc.next();
		
		System.out.println("���� �Է� >>");
		String birth = sc.next();
		
		PersonInfo info = new PersonInfo(name, number, birth);
//		info.setName(name);
//		info.setNumber(number);
//		info.setBirth(birth);
		
		System.out.println(info.getName()); // name �� ��������
		System.out.println(info.getNumber()); // number �� ��������
		System.out.println(info.getBirth()); // birth �� ��������
		
		list[0] = info; // ��ȭ��ȣ ������ ����
		
		PersonInfo info2 = new PersonInfo(name, number, birth);
		list[1] = info2;
		
		for(int i = 0; i<list.length; i++) {
			System.out.println("�̸� �Է� >> ");
			String name1 = sc.next();
			
			System.out.println("��ȣ �Է� >> ");
			String number1 = sc.next();
			
			System.out.println("���� �Է� >>");
			String birth1 = sc.next();
			PersonInfo info1 = new PersonInfo(name, number, birth);
			list[i] = info1;
		}
	}
}
