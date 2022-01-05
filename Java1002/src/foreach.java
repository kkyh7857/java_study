import java.util.ArrayList;

public class foreach {

	public static void main(String[] args) {
//		for_each
//		배열, ArrayList를 한칸씩 프린트하는
//			for(변수 :배열의 래퍼런스 변수) {
//				반복작업문;
//			}
		int arr[] = {1,2,3,4,5,6};
		int sum = 0;
//		for(int 임시 변수: 배열이름)
//			반복작업문;
		for(int x: arr) {
			sum += x;			
		}
		System.out.println("합계: "+sum);

		int arr2[] = {1,2,3,4,5,6};
		int sum2 = 0;
		for(int x: arr2) {
			System.out.print(x+" ");
			sum2 += x; 
		}
		System.out.println("합계"+sum2);
	}

}
