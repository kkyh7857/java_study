
public class ���ڿ�String {

	public static void main(String[] args) {
		// Java���� ���ڿ��� ǥ���ϴ� ������Ÿ�� String(����� ���� Ÿ��)

		char c = 'A'; // ���� �ϳ��� �� �� �ִ� charŸ��
		String s = "A"; // ���ڸ� ���� �� �ִ� String
//		System.out.println(c);
//		System.out.println(s);

		String word = "Apple";

		char[] word_array = new char[5];
		word_array[0] = 'A';
		word_array[1] = 'p';
		word_array[2] = 'p';
		word_array[3] = 'l';
		word_array[4] = 'e';
		// String���� �ѹ��� �� �� �ִ� ���� char�� �迭�� ����� ���� �־���� �Ѵ�.
		// String�� �ڼ��� ���� char �迭�� �����Ǿ� �ִ�.
		// char �� ������ ���ڸ� ������ �� ����Ѵ�. �����͸� ȿ�������� Ȱ���� �� �ִ�.

		// charAt: ���ڿ����� Ư�� ��ġ�� �� ���ڸ� ������ �� ���
		char result = word.charAt(2);
		System.out.println(result);

		// split: ���ڿ��� Ư�� ��ȣ�� �ɰ��� ������ ���
		String wordList = "�ٳ���, ���, ��, ����";
		String[] wordListSplit = wordList.split(", ");
		// ������ �м�->����, ���� �� �� Ȱ��
		for (int i = 0; i < 4; i++) {
			System.out.print(wordListSplit[i] + " ");
		}
		System.out.println();
		// contains: �Է� �� ���ڿ����� Ư�� ���ڰ� ���� �Ǿ� �ִ��� �˾ƺ��� ���.
		// ���̵� ���� �� ��� �� �� �� ����.
		String msg = "�ȳ��ϼ���. ���ɽð��Դϴ�. ����Ŀ�.";
		boolean Contains = msg.contains("����");
		System.out.println(Contains);

		// replace: Ư�� ���ڸ� �ٸ� ���ڷ� �ٲٴ� ���.
		String Replace = msg.replace("����Ŀ�", "�����");
		System.out.println(Replace);

		// substring: ���ڿ� �Ϻ� ������ �߶󳻴� ���(index0~4: 0~5�� �� �ε����� ����)
		String Substring = msg.substring(0, 5);
		System.out.println(Substring);

	}

}
