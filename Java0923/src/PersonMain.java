import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 10명이 들어갈 전화번호부 배열 생성
		PersonInfo[] list = new PersonInfo[5];
		
		System.out.println("이름 입력 >> ");
		String name = sc.next();
		
		System.out.println("번호 입력 >> ");
		String number = sc.next();
		
		System.out.println("생일 입력 >>");
		String birth = sc.next();
		
		PersonInfo info = new PersonInfo(name, number, birth);
//		info.setName(name);
//		info.setNumber(number);
//		info.setBirth(birth);
		
		System.out.println(info.getName()); // name 값 가져오기
		System.out.println(info.getNumber()); // number 값 가져오기
		System.out.println(info.getBirth()); // birth 값 가져오기
		
		list[0] = info; // 전화번호 데이터 저장
		
		PersonInfo info2 = new PersonInfo(name, number, birth);
		list[1] = info2;
		
		for(int i = 0; i<list.length; i++) {
			System.out.println("이름 입력 >> ");
			String name1 = sc.next();
			
			System.out.println("번호 입력 >> ");
			String number1 = sc.next();
			
			System.out.println("생일 입력 >>");
			String birth1 = sc.next();
			PersonInfo info1 = new PersonInfo(name, number, birth);
			list[i] = info1;
		}
	}
}
