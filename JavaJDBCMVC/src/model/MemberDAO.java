package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	// DAO : Data Access Object
	// CRUD: INSERT, UPDATE, DELETE, SELECT, SELECTALL
	// Database ����
	// ��� ���� (����� View ���� ȣ���ؼ� ���)
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	// �����ͺ��̽� ���� �޼ҵ�
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class ���� Ȯ��");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			conn = DriverManager.getConnection(url, dbid, dbpw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��ü �ݴ� �޼ҵ�(����� �ڿ� ��ȯ)
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

	// 1. ȸ������
	public int insert(ModelVO vo) {

		int cnt = 0;
		try {
			// �������
			conn();

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}
			String sql = "insert into JDBC_menber values(?, ?, ?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getNick());

			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			// ���� �߻�
			e.printStackTrace();// � ������ �߻��ߴ��� ���
			System.out.println("Class���� ����");
		} finally {
			close();
		}
		return cnt;
	}

	// 2.ȸ�� ���� ����
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
				System.out.println("��������");
			} else {
				System.out.println("��������");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 3. ȸ�� ���� ����
	public int delete(String id) {

		int cnt = 0;
		try {
			conn();

			String sql = "delete from JDBC_menber where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 4. ��ü ȸ�� ����
	public ArrayList<ModelVO> selectAll() {

		ArrayList<ModelVO> al = new ArrayList<ModelVO>();

		try {
			conn();

			String sql = "select * from JDBC_menber";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {

				String id = rs.getString(1); // �÷��� ������ ����: 1����
				String pw = rs.getString("pw"); // �ø� �̸�(String) ����
				String nick = rs.getString(3);

				// ȸ�� ������ �ϳ��� ����� �Ѵ�.
				ModelVO vo = new ModelVO(id, pw, nick);

				// ���� ������ �ٽ� �ϳ��� ���´�. -> ArrayList
				al.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return al;
	}

	// 5. Ư�� ȸ�� ����
	public ModelVO selectOne(String id) {

		ModelVO vo = null;

		try {
			conn();
			// 3. sql �غ� ��ü ����
			String sql = "select * from JDBC_menber where id = ?";
			psmt = conn.prepareStatement(sql);
			// 4. SQL ��� ���� :
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			// Ư�� ȸ���� ������ ã�� ���̱� ������ ȸ���� 1���̴�.
			if (rs.next()) {
				id = rs.getString(1); // �÷��� ������ ����: 1����
				String pw = rs.getString("pw"); // �ø� �̸�(String) ����
				String nick = rs.getString(3);

				vo = new ModelVO(id, pw, nick);
//				System.out.println("id : " + id);
//				System.out.println("pw : " + pw);
//				System.out.println("nick : " + nick);
//				System.out.println("====================");
			} else {
				System.out.println("�ش�ȸ���� �������� �ʽ��ϴ�.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}
}
