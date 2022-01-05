import java.util.Random;

public class 메뉴선택메소드 {

	public static void main(String[] args) {
		// 메뉴선택메소드 : 선택장애를 위한 음식선택 메소드
		// 메소드 호출
		String menuName = selectMenu();
		System.out.println("오늘 먹을 음식???" + selectMenu());
		
	}
	
	// 메소드 정의
	public static String selectMenu() {
		String[] name = {"짜장면", "파스타", "볶음밥", "김치찌개", "부대찌개", "돈가스", "라면",
				"초밥", "국밥", "치킨", " 피자", "크림순대국", "모밀"};
		
		Random rd = new Random();
		int select = rd.nextInt(name.length);
		return name[select];
	}
	
}
