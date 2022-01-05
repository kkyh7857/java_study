import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====채점하기====");
		Scanner sc = new Scanner(System.in);
		String[] ans = sc.next().split("");
		int sum = 0;
		int count = 0;
		for(int i = 0; i<ans.length; i++) {
			if(ans[i].equals("o")) {
				count++;
				sum += count;
			}else if(ans[i].equals("x")) {
				count = 0;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
