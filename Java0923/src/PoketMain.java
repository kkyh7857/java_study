import java.util.ArrayList;
import java.util.Scanner;

public class PoketMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���ϸ� ���� ��Ȯ�� �� �� ���, 
		// ������ �� ������ ���� �ϴ��� �˼� ����.
		
		// ���ϸ� �ټ� ���� �����
		ArrayList<Poketmon> poketList = new ArrayList<Poketmon>();
		Poketmon pika = new Poketmon("��ī��", "����", 80, 60, 70);
		Poketmon piri = new Poketmon("���̸�", "��", 90, 40, 50);
		Poketmon ccobugi = new Poketmon("���α�", "��", 85, 45, 45);
		Poketmon isanghe = new Poketmon("�̻��ؾ�", "Ǯ", 80, 50, 40);
		Poketmon muz = new Poketmon("����", "�ʴɷ�", 100, 100, 100);
		
		// ���ϸ� ������ �߰�
		poketList.add(pika);
		poketList.add(piri);
		poketList.add(ccobugi);
		poketList.add(isanghe);
		poketList.add(muz);
		
		for(int i = 0; i<poketList.size(); i++) {
			Poketmon list = poketList.get(i);
		}
		System.out.println(poketList.addAll(poketList));
		System.out.print("ù��° ���ϸ� ��ȣ �Է�:");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ϸ� ��ȣ �Է�:");
		int num2 = sc.nextInt();
		
	}
}
