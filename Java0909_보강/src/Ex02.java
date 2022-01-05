
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i<=5; i++) {
			System.out.println(i+ "´Ü");
			for(int j = 1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		for(int i = 1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
