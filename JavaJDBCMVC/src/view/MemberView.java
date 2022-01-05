package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.ModelVO;

public class MemberView {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();

		System.out.println("==회원 관리 프로그램==");

		while (true) {
			System.out.println("1.회원가입 2.회원정보수정 3.회원삭제 4.전체회원정보 5.특정회원정보 6.종료");
			System.out.print("선택: ");
			int menu = sc.nextInt();
			
			if (menu == 1) {

				System.out.println("== 회원가입 ==");
				System.out.println("ID : ");
				String id = sc.next();
				System.out.println("PW : ");
				String pw = sc.next();
				System.out.println("NICK : ");
				String nick = sc.next();

				// 반환 값을 받는 변수를 함께 지정.
				ModelVO vo = new ModelVO(id, pw, nick);
				int cnt = dao.insert(vo);

				if (cnt > 0) {
					System.out.println("입력 성공");
				} else {
					System.out.println("입력 실패");
				}
				
			} else if (menu == 2) {

				System.out.println("== 회원 정보 수정 ==");
				System.out.println("ID : ");
				String id = sc.next();
				System.out.println("1.PW 2.NICK : ");
				String choise = sc.next();
				System.out.println("수정할 data : ");
				String data = sc.next();
				
				int cnt = dao.update(id, choise, data);

				if (cnt > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

			} else if (menu == 3) {

				System.out.println("회원삭제서비스");
				System.out.println("ID : ");
				String id = sc.next();

				int cnt = dao.delete(id);

				if (cnt > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				
			} else if (menu == 4) {

				ArrayList<ModelVO> al = dao.selectAll();
				// for_each
				// 배열, ArrayList<ModelVO> al = dao.selectAll();를 한칸씩 프린트하는
				// 배열, 어레이리스트 안에 있는 값을 다룰때 효율적으로 사용
//					for(배열/어레이리스트 안에 들어있는 요소들을 임시적으로 사용할 이름 :배열/어레이리스트 이름(배열래퍼런스 변수)) {
//						반복작업문
//					}
				for (ModelVO vo : al)
					printVO(vo);
					System.out.println("===========================");
			} else if (menu == 5) {

				System.out.println("특정 회원 정보 출력");
				System.out.print("ID: ");
				String id = sc.next();
				ModelVO vo = dao.selectOne(id); 
				printVO(vo);
				
			} else if (menu == 6) {
				System.out.println("프로그램 종료");
				break;
				
			} else {
				System.out.println("정확한 숫자를 입력하세요.");
			}
		}
	}
	public static void printVO(ModelVO vo) {
		System.out.println("Id: " + vo.getId() + "\tPW: " + vo.getPw() + "\tNICK: " + vo.getNick());
	}
}
