
public class ForExam03_1 {

	public static void main(String[] args) {
		// 구구단 2~9단까지 출력
		for(int j = 1; j<=9;j++) { //j=1 일때 다음 for문 동작 i++
			for(int i=2;i<=9;i++) { //먼저 동작
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}

	}

}
