import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03UpdateReview {

	public static void main(String[] args) {
		// 1. id를 입력 받고 2. 
		System.out.println("회원수정서비스");
	      Scanner sc = new Scanner(System.in);
	      System.out.print("ID : ");
	      String id = sc.next();
	      System.out.print("1.PW 2.NICK");
	      String choice = sc.next();
	      System.out.print("Update Data : ");
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
	        	 sql = "update JDBC_menber set pw = ?  where id = ?";
	         }else if(choice.equals("2")) {
	        	 sql = "update JDBC_menber set nick = ?  where id = ?";
	         }
	         
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, data);       	 
	         psmt.setString(2, id);
	         
	         int cnt = psmt.executeUpdate();
	         
	         if(cnt>0) {
	            System.out.println("수정성공");
	         }else {
	            System.out.println("수정실패");
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
