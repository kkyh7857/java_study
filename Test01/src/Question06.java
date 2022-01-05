import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// 문자열 데이터를 저장할 수 있는 배열 fruits
		// 원하는 과일이 몇번째 있는지 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		String[] fruits = {"자몽", "망고", "바나나", "멜론"};
		
		System.out.print("찾고 싶은 과일: ");
		String wantFruits = sc.next();
		
		for(int i = 0; i<fruits.length; i++) {
			if(wantFruits.equals(fruits[i])) {
				System.out.print(fruits[i]+"의 위치는 " + (i+1) + "번에 있습니다.");
			}
		}
		System.out.println("찾는 과일이 없습니다.");
	}
}
