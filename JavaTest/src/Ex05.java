
public class Ex05 {

	public static void main(String[] args) {
		// 1 -2 3 -4 ..... -98 99 -100 ¿« «’¿∫?
		
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
				sum += -i;
				System.out.print(-i+" ");
			}else {
				sum += i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.print(sum+" ");
	}

}
