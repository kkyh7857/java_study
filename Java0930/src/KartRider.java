
public interface KartRider {
	// �������̽� ��� ������ �������(���赵)
	// īƮ(��) ����!
	// 1. �������̽��� ������ �ƴ� ����� ������ �� �� �ִ�.== final(���)
	// ��� ==> ������ �ʴ� ��, �׻� ���� ��
	final int position = 0; // ���� ��ġ�� �������ִ� �ʵ�
	
	// �߻� �޼ҵ� ����
	
	// ������ ���� �޼ҵ�
	public abstract void go(int num);
	
	// �ڷΰ��� �޼ҵ�
	public abstract void back(int num);
	
	// �ν���
	public abstract void buster(int num);

	// �������̽��� ���赵! ����� �������� �ʰ� ���� ���ش�.(�߻�޼ҵ�)
	
}
