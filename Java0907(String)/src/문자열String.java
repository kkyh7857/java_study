
public class 문자열String {

	public static void main(String[] args) {
		// Java에서 문자열을 표현하는 데이터타입 String(사용자 정의 타입)

		char c = 'A'; // 문자 하나가 들어갈 수 있는 char타입
		String s = "A"; // 글자를 담을 수 있는 String
//		System.out.println(c);
//		System.out.println(s);

		String word = "Apple";

		char[] word_array = new char[5];
		word_array[0] = 'A';
		word_array[1] = 'p';
		word_array[2] = 'p';
		word_array[3] = 'l';
		word_array[4] = 'e';
		// String으로 한번에 할 수 있는 것을 char는 배열을 만들고 값을 넣어줘야 한다.
		// String을 자세히 보면 char 배열로 구성되어 있다.
		// char 는 간단한 문자를 저장할 때 사용한다. 데이터를 효율적으로 활용할 수 있다.

		// charAt: 문자열에서 특정 위치의 한 글자를 추출할 때 사용
		char result = word.charAt(2);
		System.out.println(result);

		// split: 문자열을 특정 기호로 쪼개고 싶을때 사용
		String wordList = "바나나, 사과, 배, 포도";
		String[] wordListSplit = wordList.split(", ");
		// 데이터 분석->수집, 정제 할 때 활용
		for (int i = 0; i < 4; i++) {
			System.out.print(wordListSplit[i] + " ");
		}
		System.out.println();
		// contains: 입력 된 문자열에서 특정 문자가 포함 되어 있는지 알아보는 기능.
		// 아이디 만들 때 사용 해 볼 수 있음.
		String msg = "안녕하세요. 점심시간입니다. 배고파요.";
		boolean Contains = msg.contains("점심");
		System.out.println(Contains);

		// replace: 특정 문자를 다른 문자로 바꾸는 기능.
		String Replace = msg.replace("배고파요", "배고팡");
		System.out.println(Replace);

		// substring: 문자열 일부 구간을 잘라내는 기능(index0~4: 0~5개 의 인덱스를 추출)
		String Substring = msg.substring(0, 5);
		System.out.println(Substring);

	}

}
