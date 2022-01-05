import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01Insert {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ȸ�����Լ���");
		System.out.println("ID : ");
		String id = sc.next();
		System.out.println("PW : ");
		String pw = sc.next();
		System.out.println("NICK : ");
		String nick = sc.next();

		// JDBC (Java DataBase Connectivity
		// Java�� Database�� �������ִ� API(Interface)

		// �������
		// 1. oracle���� Java�� ������ �� �ְ� �����ϴ� (�ܺ� .jar)������ �����;� ��.

		// 2. ojdbc6.jar���� �����ϴ� ����� ����ϴ� ����̹�.class���� �����ε�
		// �ڹٿ����� ��� dbs ȸ���� Ŭ���� ������ ��� ������ ���� �ʿ䰡 ������, �ʿ��� Ŭ���� ������ �����ε��ض�...

		// ���� ó����(try-catch��)
		// Java���� �߻��ϴ� ������ 2����

		// 1. ������ ���� : �ڵ��� �� ������ ����(�������� ����)

		// 2. ��Ÿ�� ���� : �����ؾ����� �� �� �ִ� ����(DB, ��Ʈ��ũ_ä��â)

		// �����ؾ��� �� �� �ִ� ������ �ҷ��� �� �ִ� �ڵ�: ����ó������ �Բ� try ~ catch�� �ؾ� �Ѵ�.!!!!
		// try ���� ������ ���� �� , ���� ���� �������� �ʰ� �ٷ� catch���� �ٷ� �����Ѵ�.
		// try~catch(Exception e){ e.printStackTrace(); �̰� �پ�� ����.
		// try catch ���� ����� ����, ���� �ƴ��� Ȯ���ϴ� print���� �־���� �ϴ±���.................

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			// �������
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class ���� Ȯ��");

			// 3. oracle�� ���� DB���̵�� PW�� ����(oracle�ּ�, id, pw)
			// ���� �ּҸ� �ٲٸ�, �ٸ� ����� db�� ��� �� �� �ִ�.??
			// 1521 ����Ŭ ���� -> �ٲ� �� ����.
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			// �� ���� �ȴٸ� java���� Connection�� �ش�.
			// Connection ��ü ����: Java���� oracle�� �ڵ鸵 �� �� �ִ� ��ü
			conn = DriverManager.getConnection(url, dbid, dbpw);

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

			// 4. oracle�� ����� SQL�� �غ�
			// conn.prepareStatement(sql) sql���� ������ ������ Ȯ�����ش�.
			// JDBC�� ���ϰ� ������ �����̴�.
			// !!!!!! �ڵ��� ���� ���� �����ʿ��� �������� �д´�. ��������� �����ʿ��� �������� ���� �����̴�. !!!!!
			String sql = "insert into JDBC_menber values(?, ?, ?)";
			// ����ڰ� �Է��� ���� ���� �Ѵ� �ϸ� ������ ? �̴�.!!!!!!!!!!!!!
			psmt = conn.prepareStatement(sql);

			// psmt.setString(���°��, ��) -> ����ڰ� �Է��� id, pw, nick�� �����ϴ� ���!!!!
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			// 5. SQL ��� ���� : 
			int cnt = psmt.executeUpdate();

			// 6. ��� �� ó��
			if (cnt > 0) {
				System.out.println("�Է� ����");
			} else {
				System.out.println("�Է� ����");
			}

		} catch (Exception e) {
			// ���� �߻�
			e.printStackTrace();// � ������ �߻��ߴ��� ���
			System.out.println("Class���� ����");

		} finally {
			// ���������� ���� �ǵ�, ������ ���� ���������� ����Ǵ� �κ�.
			// 7. ���� ����
			try {
				psmt.close();
				conn.close();

			} catch (Exception e2) {
				e2.printStackTrace();

			}

		}

	}
}
