import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// ������ ä�� �ϴµ�, o, x�� ǥ���Ѵ�.
		// oooxoo�� ǥ�� �ȴٸ�, 1,2,3,0,1,2 �ǵ��� �ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====ä���ϱ�====");
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
