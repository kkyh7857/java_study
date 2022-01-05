import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectAll {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			
			conn = DriverManager.getConnection(url, dbid, dbpw);

			
			
			String sql = "select * from JDBC_mender";
			

			psmt = conn.prepareStatement(sql);
		
			ResultSet rs =  psmt.executeQuery();

			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString("pw");
				
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
