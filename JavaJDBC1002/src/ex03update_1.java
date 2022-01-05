import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03update_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ȸ����������");
		System.out.println("ID : ");
		String id = sc.next();
		System.out.println("1.PW 2.NICK ");
		String choice = sc.next();
		System.out.println("Update ������ : ");
		String data = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			
			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = null;
			if(choice.equals("1")) {
				sql = "update JDBC_menber set pw = ? where id = ?";
			}else if(choice.equals("2")) {
				sql = "update JDBC_menber set nick = ? where id = ?";				
			}

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, data);
			psmt.setString(2, id);

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				psmt.close();
				conn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
