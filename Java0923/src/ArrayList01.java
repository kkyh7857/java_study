import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList01 {

	public static void main(String[] args) {
		
		String[] name = new String[3];		
		// name �ʱ�ȭ
		// �迭 ù��° �� �ʱ�ȭ
		name[0] = "��ȯ";
		System.out.println(name[0]+"\n");
		
		ArrayList<String> nameArray = new ArrayList<String>();
		// ArrayList ����
		// ArrayList<����> ������ = new ArrayList<����>();
		
		// �߰�
		nameArray.add("��ȯ"); // index:0��
		// add�� ����� �߰��� ������ �ε����� �߰��� �ȴ�.
		nameArray.add("����"); // index:1��
		// ArrayList �� ��������.
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		System.out.println();
		
		// ����
		nameArray.add(1, "����");
		System.out.println(nameArray.get(1));
		nameArray.add(2, "�ص�");
		System.out.println(nameArray.get(2));
		
		// ũ��(nameArray.size();)
		System.out.println("������ ũ�� " + name.length);
		System.out.println("ArrayList ũ�� " + nameArray.size());
		
		// ����
		nameArray.remove(1);
		
		System.out.println(name);
		System.out.println(Arrays.toString(name));

		// ArrayList�� toString�� �����ϰ� �ִ�. 
		System.out.println(nameArray); 
		
		

		
	}
}
