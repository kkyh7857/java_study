package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.ModelVO;

public class MemberView {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();

		System.out.println("==ȸ�� ���� ���α׷�==");

		while (true) {
			System.out.println("1.ȸ������ 2.ȸ���������� 3.ȸ������ 4.��üȸ������ 5.Ư��ȸ������ 6.����");
			System.out.print("����: ");
			int menu = sc.nextInt();
			
			if (menu == 1) {

				System.out.println("== ȸ������ ==");
				System.out.println("ID : ");
				String id = sc.next();
				System.out.println("PW : ");
				String pw = sc.next();
				System.out.println("NICK : ");
				String nick = sc.next();

				// ��ȯ ���� �޴� ������ �Բ� ����.
				ModelVO vo = new ModelVO(id, pw, nick);
				int cnt = dao.insert(vo);

				if (cnt > 0) {
					System.out.println("�Է� ����");
				} else {
					System.out.println("�Է� ����");
				}
				
			} else if (menu == 2) {

				System.out.println("== ȸ�� ���� ���� ==");
				System.out.println("ID : ");
				String id = sc.next();
				System.out.println("1.PW 2.NICK : ");
				String choise = sc.next();
				System.out.println("������ data : ");
				String data = sc.next();
				
				int cnt = dao.update(id, choise, data);

				if (cnt > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}

			} else if (menu == 3) {

				System.out.println("ȸ����������");
				System.out.println("ID : ");
				String id = sc.next();

				int cnt = dao.delete(id);

				if (cnt > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				
			} else if (menu == 4) {

				ArrayList<ModelVO> al = dao.selectAll();
				// for_each
				// �迭, ArrayList<ModelVO> al = dao.selectAll();�� ��ĭ�� ����Ʈ�ϴ�
				// �迭, ��̸���Ʈ �ȿ� �ִ� ���� �ٷ궧 ȿ�������� ���
//					for(�迭/��̸���Ʈ �ȿ� ����ִ� ��ҵ��� �ӽ������� ����� �̸� :�迭/��̸���Ʈ �̸�(�迭���۷��� ����)) {
//						�ݺ��۾���
//					}
				for (ModelVO vo : al)
					printVO(vo);
					System.out.println("===========================");
			} else if (menu == 5) {

				System.out.println("Ư�� ȸ�� ���� ���");
				System.out.print("ID: ");
				String id = sc.next();
				ModelVO vo = dao.selectOne(id); 
				printVO(vo);
				
			} else if (menu == 6) {
				System.out.println("���α׷� ����");
				break;
				
			} else {
				System.out.println("��Ȯ�� ���ڸ� �Է��ϼ���.");
			}
		}
	}
	public static void printVO(ModelVO vo) {
		System.out.println("Id: " + vo.getId() + "\tPW: " + vo.getPw() + "\tNICK: " + vo.getNick());
	}
}
