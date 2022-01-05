import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ex04SelectAll {

	public static void main(String[] args) {
		// 전체 회원 정보 불러오기
		// 현재 가입 되어 있는 모든 회원의 정보(콘솔창에 출력)
		System.out.println("모든 회원 정보 출력");
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			// 실행할 코드
			// 1. 드라이버 로드 -> ClassNotFoundException
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			// 2. 데이터베이스와 연결(Connection)객체 생성
			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from JDBC_menber";
			// 3. sql 실행/준비(prepareStatement)
			psmt = conn.prepareStatement(sql);

			// executeUpdate(): insert, delete, update -> 테이블의 변화가 있을 때
			// -> 반환값 int -> 몇 번의 행에서 변화가 일어났는지!!
			// excuteQuery() : select -> 테이블 변화가 없을 때
			// -> 반환값: ResultSet(Object)) -> select문을 실행 시 결과값 + 커서
			// next() 메소드 사용 : 커서를 한 칸 음직임(다음 행을 가리킴)
			// -> 커서가 가리키는 행에 값이 있는지 없는지 판단 -> 있으면 true, 없으면 false 반환

			// 4. sql 실행 : psmt.executeQuery 쿼리를 실행한다.
			rs = psmt.executeQuery();

			// 5. 값을 출력
			while (rs.next()) {
				// 각각의 컬럼값 읽어오기
				String id = rs.getString(1); // 컬럼의 순서를 지정: 1부터
				String pw = rs.getString("pw"); // 컬림 이름(String) 지정
				String nick = rs.getString(3);
				// select nick from JDBC_menber 라 하면 , rs.String(1); ResultSet 상의 순서
				// int a = rs.getInt(1); int형 가지고 올 때

				System.out.println("id : " + id);
				System.out.println("pw : " + pw);
				System.out.println("nick : " + nick);
				System.out.println("====================");
			}

		} catch (Exception e) {
			// try 문 안에서 발생한 예외 상황에 대한 처리
			e.printStackTrace();
		} finally {
			// try 안에서 예외상황이 발생하던지 안하던지 무조건 실행되는 구문!!!!!
			// 6. 사용한 객체 닫기 (자원반환) 문닫기!!!!!!!!!! 꼬리가 길면 안됨!!
			try {
				// 생성 순서 반대로 닫아줘야 함.
				rs.close(); 
				psmt.close();
				conn.close();  // conn이 실행 되기 전에 오류가 발생하면 conn 객체가 생성 되지 않는다. 
								// 따라서 rs.closs(); 를 실행할 수 없으므로, 런타임 오류가 발생한다.
								// 그래서 한번더 예외처리를 하는 것이다.......
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
