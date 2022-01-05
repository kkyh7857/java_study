import java.util.Scanner;

public class 쪽지시험풀이6번 {

	public static void main(String[] args) {
		
		String[] f = {"사과", "키위", "레몬", "자몽", "망고", "복숭아", "포도"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾고 싶은 과일: ");
		String input = sc.next();
		
		for(int i = 0; i<f.length; i++) {
			if(input.equals(f[i])) {
				System.out.println("당신이 찾는 과일은 " + i+1 + " 번에 있습니다.");
				break;
			}
		}
		System.out.print("찾는 과일이 없습니다.");

	}

}
