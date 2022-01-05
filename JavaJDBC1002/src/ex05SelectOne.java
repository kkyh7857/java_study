import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ex05SelectOne {

	public static void main(String[] args) {
		// Ư�� ȸ���� id�Է� -> �ش� id�� ���� ȸ���� ������ ���!!
		// id�� ��ġ�� �ʴ´�. (����)
		Scanner sc = new Scanner(System.in);
		System.out.println("Ư�� ȸ�� ���� ���");
		System.out.print("ID: ");
		String id = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;


		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			// 2. �����ͺ��̽� ���� ��ü ����
			conn = DriverManager.getConnection(url, dbid, dbpw);
			// 3. sql �غ� ��ü ����
			String sql = "select * from JDBC_menber where id = ?";
			psmt = conn.prepareStatement(sql);
			// 4. SQL ��� ���� :
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			// Ư�� ȸ���� ������ ã�� ���̱� ������ ȸ���� 1���̴�. 
			if(rs.next()) {
				id = rs.getString(1); // �÷��� ������ ����: 1����
				String pw = rs.getString("pw"); // �ø� �̸�(String) ����
				String nick = rs.getString(3);
				
				System.out.println("id : " + id);
				System.out.println("pw : " + pw);
				System.out.println("nick : " + nick);
				System.out.println("====================");
				
			}else {
				System.out.println("�ش�ȸ���� �������� �ʽ��ϴ�.");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				psmt.close();
				conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
