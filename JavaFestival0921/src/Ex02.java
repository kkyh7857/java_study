import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 문제를 채점 하는데, o, x로 표시한다.
		// oooxoo로 표시 된다면, 1,2,3,0,1,2 되도록 하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====채점하기====");
		String ans = sc.next();
		String[] ansArray = ans.split("");
		int sum = 0;
		
		for(int i = 0, count = 0; i<ansArray.length; i++) {
			if(ansArray[i].equals("o")) {
				count++;
				sum += count;
			} else if(ansArray[i].equals("x")){
				count = 0;
			}
			
		}
		System.out.println(sum);
		
	}

}
