import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList01 {

	public static void main(String[] args) {
		
		String[] name = new String[3];		
		// name 초기화
		// 배열 첫번째 값 초기화
		name[0] = "승환";
		System.out.println(name[0]+"\n");
		
		ArrayList<String> nameArray = new ArrayList<String>();
		// ArrayList 선언
		// ArrayList<변수> 변수명 = new ArrayList<변수>();
		
		// 추가
		nameArray.add("승환"); // index:0번
		// add를 사용한 추가는 마지막 인덱스에 추가가 된다.
		nameArray.add("유선"); // index:1번
		// ArrayList 값 가져오기.
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		System.out.println();
		
		// 삽입
		nameArray.add(1, "대희");
		System.out.println(nameArray.get(1));
		nameArray.add(2, "해도");
		System.out.println(nameArray.get(2));
		
		// 크기(nameArray.size();)
		System.out.println("일차원 크기 " + name.length);
		System.out.println("ArrayList 크기 " + nameArray.size());
		
		// 삭제
		nameArray.remove(1);
		
		System.out.println(name);
		System.out.println(Arrays.toString(name));

		// ArrayList는 toString을 포함하고 있다. 
		System.out.println(nameArray); 
		
		

		
	}
}
