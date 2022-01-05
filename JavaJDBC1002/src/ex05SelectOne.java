import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ex05SelectOne {

	public static void main(String[] args) {
		// 특정 회원의 id입력 -> 해당 id를 가진 회원의 정보만 출력!!
		// id는 겹치지 않는다. (가정)
		Scanner sc = new Scanner(System.in);
		System.out.println("특정 회원 정보 출력");
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
			// 2. 데이터베이스 연결 객체 생성
			conn = DriverManager.getConnection(url, dbid, dbpw);
			// 3. sql 준비 객체 생성
			String sql = "select * from JDBC_menber where id = ?";
			psmt = conn.prepareStatement(sql);
			// 4. SQL 명령 실행 :
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			// 특정 회원의 정보를 찾는 것이기 때문에 회원은 1명이다. 
			if(rs.next()) {
				id = rs.getString(1); // 컬럼의 순서를 지정: 1부터
				String pw = rs.getString("pw"); // 컬림 이름(String) 지정
				String nick = rs.getString(3);
				
				System.out.println("id : " + id);
				System.out.println("pw : " + pw);
				System.out.println("nick : " + nick);
				System.out.println("====================");
				
			}else {
				System.out.println("해당회원이 존재하지 않습니다.");
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
