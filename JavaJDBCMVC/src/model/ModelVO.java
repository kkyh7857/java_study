package model;

public class ModelVO {
	//ȸ����������
	private String id;
	private String pw;
	private String nick;
	
	public ModelVO(String id, String pw, String nick) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
	//get: Ư���� �Ӽ� ���� ��ȯ ���
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNick() {
		return nick;
	}
	
}
