import java.util.Random;

public class �޴����ø޼ҵ� {

	public static void main(String[] args) {
		// �޴����ø޼ҵ� : ������ָ� ���� ���ļ��� �޼ҵ�
		// �޼ҵ� ȣ��
		String menuName = selectMenu();
		System.out.println("���� ���� ����???" + selectMenu());
		
	}
	
	// �޼ҵ� ����
	public static String selectMenu() {
		String[] name = {"¥���", "�Ľ�Ÿ", "������", "��ġ�", "�δ��", "������", "���",
				"�ʹ�", "����", "ġŲ", " ����", "ũ�����뱹", "���"};
		
		Random rd = new Random();
		int select = rd.nextInt(name.length);
		return name[select];
	}
	
}
