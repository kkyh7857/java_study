
public class ex01�迭���� {

	public static void main(String[] args) {
		// �迭Ÿ�� [�迭����] �迭 �̸� = �迭 ���� �迭Ÿ��[�迭�� ũ��];
		// int[] numbers = new int[4]; 
		// intŸ���� �迭 ����
		// �迭�� �̸��� array1�̰� �� ũ��� 4;
		int [] array1 = new int[4];

		// �迭�� �� ����ֱ�
		// �迭[�ε�����ȣ(0��~������!!)] = ��;
		array1[0] = 10 ;
		array1[1] = 8 ;
		array1[2] = 6 ;
		array1[3] = 4 ;
		
		//������ �迭�� ũ�� ���� ���
		System.out.println("�迭�� ����: " + array1.length);
		
		//�� ����ϱ�
		//�ݺ���for
		System.out.println("�迭 �� �ҷ�����: ");
		for(int i = 0; i<array1.length; i++) {
			//i�� 0 ~ 3 ���� ������.
			System.out.print(array1[i]+" ");
		}
				
	}

}
