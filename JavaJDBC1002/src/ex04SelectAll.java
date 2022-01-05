import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ex04SelectAll {

	public static void main(String[] args) {
		// ��ü ȸ�� ���� �ҷ�����
		// ���� ���� �Ǿ� �ִ� ��� ȸ���� ����(�ܼ�â�� ���)
		System.out.println("��� ȸ�� ���� ���");
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			// ������ �ڵ�
			// 1. ����̹� �ε� -> ClassNotFoundException
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			// 2. �����ͺ��̽��� ����(Connection)��ü ����
			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from JDBC_menber";
			// 3. sql ����/�غ�(prepareStatement)
			psmt = conn.prepareStatement(sql);

			// executeUpdate(): insert, delete, update -> ���̺��� ��ȭ�� ���� ��
			// -> ��ȯ�� int -> �� ���� �࿡�� ��ȭ�� �Ͼ����!!
			// excuteQuery() : select -> ���̺� ��ȭ�� ���� ��
			// -> ��ȯ��: ResultSet(Object)) -> select���� ���� �� ����� + Ŀ��
			// next() �޼ҵ� ��� : Ŀ���� �� ĭ ������(���� ���� ����Ŵ)
			// -> Ŀ���� ����Ű�� �࿡ ���� �ִ��� ������ �Ǵ� -> ������ true, ������ false ��ȯ

			// 4. sql ���� : psmt.executeQuery ������ �����Ѵ�.
			rs = psmt.executeQuery();

			// 5. ���� ���
			while (rs.next()) {
				// ������ �÷��� �о����
				String id = rs.getString(1); // �÷��� ������ ����: 1����
				String pw = rs.getString("pw"); // �ø� �̸�(String) ����
				String nick = rs.getString(3);
				// select nick from JDBC_menber �� �ϸ� , rs.String(1); ResultSet ���� ����
				// int a = rs.getInt(1); int�� ������ �� ��

				System.out.println("id : " + id);
				System.out.println("pw : " + pw);
				System.out.println("nick : " + nick);
				System.out.println("====================");
			}

		} catch (Exception e) {
			// try �� �ȿ��� �߻��� ���� ��Ȳ�� ���� ó��
			e.printStackTrace();
		} finally {
			// try �ȿ��� ���ܻ�Ȳ�� �߻��ϴ��� ���ϴ��� ������ ����Ǵ� ����!!!!!
			// 6. ����� ��ü �ݱ� (�ڿ���ȯ) ���ݱ�!!!!!!!!!! ������ ��� �ȵ�!!
			try {
				// ���� ���� �ݴ�� �ݾ���� ��.
				rs.close(); 
				psmt.close();
				conn.close();  // conn�� ���� �Ǳ� ���� ������ �߻��ϸ� conn ��ü�� ���� ���� �ʴ´�. 
								// ���� rs.closs(); �� ������ �� �����Ƿ�, ��Ÿ�� ������ �߻��Ѵ�.
								// �׷��� �ѹ��� ����ó���� �ϴ� ���̴�.......
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
