import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01Insert {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("회원가입서비스");
		System.out.println("ID : ");
		String id = sc.next();
		System.out.println("PW : ");
		String pw = sc.next();
		System.out.println("NICK : ");
		String nick = sc.next();

		// JDBC (Java DataBase Connectivity
		// Java와 Database를 연결해주는 API(Interface)

		// 연결순서
		// 1. oracle에서 Java를 연결할 수 있게 제공하는 (외부 .jar)파일을 가져와야 함.

		// 2. ojdbc6.jar에서 연결하는 기능을 담당하는 드라이버.class파일 동적로딩
		// 자바에서는 모든 dbs 회사의 클래스 파일을 모두 가지고 있을 필요가 없으니, 필요한 클래스 파일을 동적로딩해라...

		// 예외 처리문(try-catch문)
		// Java에서 발생하는 오류는 2가지

		// 1. 컴파일 오류 : 코딩할 때 나오는 오류(문법적인 오류)

		// 2. 런타임 오류 : 실행해야지만 알 수 있는 오류(DB, 네트워크_채팅창)

		// 실행해야지 알 수 있는 오류를 불러올 수 있는 코딩: 예외처리문과 함께 try ~ catch문 해야 한다.!!!!
		// try 에서 오류가 생길 시 , 다음 줄을 실행하지 않고 바로 catch문을 바로 실행한다.
		// try~catch(Exception e){ e.printStackTrace(); 이게 붙어가야 좋음.
		// try catch 문을 사용할 때는, 실행 됐는지 확인하는 print문을 넣어줘야 하는구나.................

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			// 정상실행
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class 파일 확인");

			// 3. oracle에 가서 DB아이디와 PW를 인증(oracle주소, id, pw)
			// 서버 주소를 바꾸면, 다른 사람의 db를 사용 할 수 있다.??
			// 1521 오라클 서버 -> 바꿀 수 있음.
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			// 잘 실행 된다면 java에서 Connection을 준다.
			// Connection 객체 리턴: Java에서 oracle을 핸들링 할 수 있는 객체
			conn = DriverManager.getConnection(url, dbid, dbpw);

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// 4. oracle에 명령할 SQL문 준비
			// conn.prepareStatement(sql) sql문에 문제가 없는지 확인해준다.
			// JDBC는 리턴과 리턴의 연속이다.
			// !!!!!! 코딩을 읽을 때는 오른쪽에서 왼쪽으로 읽는다. 실행방향이 오른쪽에서 왼쪽으로 가기 때문이다. !!!!!
			String sql = "insert into JDBC_menber values(?, ?, ?)";
			// 사용자가 입력한 값이 들어가야 한다 하면 무조건 ? 이다.!!!!!!!!!!!!!
			psmt = conn.prepareStatement(sql);

			// psmt.setString(몇번째에, 뭘) -> 사용자가 입력한 id, pw, nick를 저장하는 기능!!!!
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			// 5. SQL 명령 실행 : 
			int cnt = psmt.executeUpdate();

			// 6. 명령 후 처리
			if (cnt > 0) {
				System.out.println("입력 성공");
			} else {
				System.out.println("입력 실패");
			}

		} catch (Exception e) {
			// 오류 발생
			e.printStackTrace();// 어떤 오류가 발생했는지 출력
			System.out.println("Class파일 실패");

		} finally {
			// 정상적으로 시작 되든, 오류가 나든 마지막으로 실행되는 부분.
			// 7. 연결 종료
			try {
				psmt.close();
				conn.close();

			} catch (Exception e2) {
				e2.printStackTrace();

			}

		}

	}
}
