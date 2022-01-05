package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	// DAO : Data Access Object
	// CRUD: INSERT, UPDATE, DELETE, SELECT, SELECTALL
	// Database 연결
	// 기능 정의 (기능은 View 에서 호출해서 사용)
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	// 데이터베이스 연결 메소드
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class 파일 확인");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			conn = DriverManager.getConnection(url, dbid, dbpw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 객체 닫는 메소드(사용한 자원 반환)
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			psmt.close();
			conn.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	// 1. 회원가입
	public int insert(ModelVO vo) {

		int cnt = 0;
		try {
			// 정상실행
			conn();

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}
			String sql = "insert into JDBC_menber values(?, ?, ?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getNick());

			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			// 오류 발생
			e.printStackTrace();// 어떤 오류가 발생했는지 출력
			System.out.println("Class파일 실패");
		} finally {
			close();
		}
		return cnt;
	}

	// 2.회원 정보 수정
	public int update(String id, String choice, String data) {

		int cnt = 0;
		try {
			conn();

			String sql = null;

			if (choice.equals("1")) {
				sql = "update JDBC_menber set pw = ?  where id = ?";

			} else if (choice.equals("2")) {
				sql = "update JDBC_menber set nick = ?  where id = ?";
			}

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, data);
			psmt.setString(2, id);

			cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("수정성공");
			} else {
				System.out.println("수정실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 3. 회원 정보 삭제
	public int delete(String id) {

		int cnt = 0;
		try {
			conn();

			String sql = "delete from JDBC_menber where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 4. 전체 회원 정보
	public ArrayList<ModelVO> selectAll() {

		ArrayList<ModelVO> al = new ArrayList<ModelVO>();

		try {
			conn();

			String sql = "select * from JDBC_menber";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {

				String id = rs.getString(1); // 컬럼의 순서를 지정: 1부터
				String pw = rs.getString("pw"); // 컬림 이름(String) 지정
				String nick = rs.getString(3);

				// 회원 정보를 하나로 묶어야 한다.
				ModelVO vo = new ModelVO(id, pw, nick);

				// 묶은 정보를 다시 하나로 묶는다. -> ArrayList
				al.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return al;
	}

	// 5. 특정 회원 정보
	public ModelVO selectOne(String id) {

		ModelVO vo = null;

		try {
			conn();
			// 3. sql 준비 객체 생성
			String sql = "select * from JDBC_menber where id = ?";
			psmt = conn.prepareStatement(sql);
			// 4. SQL 명령 실행 :
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			// 특정 회원의 정보를 찾는 것이기 때문에 회원은 1명이다.
			if (rs.next()) {
				id = rs.getString(1); // 컬럼의 순서를 지정: 1부터
				String pw = rs.getString("pw"); // 컬림 이름(String) 지정
				String nick = rs.getString(3);

				vo = new ModelVO(id, pw, nick);
//				System.out.println("id : " + id);
//				System.out.println("pw : " + pw);
//				System.out.println("nick : " + nick);
//				System.out.println("====================");
			} else {
				System.out.println("해당회원이 존재하지 않습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}
}
