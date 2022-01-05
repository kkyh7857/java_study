import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class ex01Insert_1 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입서비스");
		System.out.println("ID: ");
		String id = sc.next();
		System.out.println("PW: ");
		String pw = sc.next();
		System.out.println("NICK: ");
		String nick = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class 파일 확인");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			
			conn = DriverManager.getConnection(url, dbid, dbpw);
			
			if(conn != null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결 실패");
			}
			String sql = "insert into JDBC_member values(?,?,?)";
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt>0) {
				System.out.println("입력 성공");
			}else {
				System.out.println("입력 실패");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Class파일 실패");
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
