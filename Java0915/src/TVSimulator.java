// Object
public class TVSimulator {
	public static void main(String[] args) {
		TV tv1 = new TV(); // tv1 = ��ü; ��ü�� �����Ѵ�.
		TV tv2 = new TV();
		// ��ü ���� ����!!(Object)
		// Ŭ������ ������  = new Ŭ������();
		// �⺻������ Ÿ��:
		// ���������(���۷���)Ÿ��: 
		// ������ �ٸ� �ּҿ��� ������ �����͸� ������ �Ҵ�ȴ�.
		
		tv1.color = "red";
		tv2.color = "blue";
		
		tv1.trunOnOff();
		System.out.println(tv1.isTurnOn);
		
		tv1.ChangeCh(5);
		System.out.println(tv1.channel);
		
		tv1.trunOnOff();
		System.out.println(tv1.isTurnOn);
		
		
		
	}

}
