package notice.model;

import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;

/**
 *<pre>
 * Database�� Users ������ �����ϱ����� CRUDó�� ����� ����ִ� Ŭ����
 *</pre>
 *
 */

public class LoginDAO{
	private DataSource env;

    // Singleton Pattern ���� Ŭ����
    private static LoginDAO dao;
    public static LoginDAO getInstance() {
        if (dao == null) {
            dao = new LoginDAO();
        }
        return dao;
    }

    /**
    * Default constructor
    * DataBase ������ ���� DataSource ��ü�� �˻��մϴ�.
    */
	private LoginDAO() {
	  try {
		  env = (DataSource) new InitialContext().lookup("java:comp/env/jdbc/Oracle");  
	  } catch (Exception e ) { e.printStackTrace();   } 
	}
/**
* loginCheck() method�� ���޵� ���̵�� �н����带 DB�� ���Ͽ� Ȯ���� �� ����� boolean Ÿ������ �����մϴ�.
* @param id  �α����� ���̵�
* @param pw  �α����� �н�����
* @return boolean : ���̵�� �н����尡 DB�� �����ϸ� true, �������� ������ false�� �����մϴ�.
*/	
	public boolean loginCheck(String id,String pw){
		Connection con = null;
		Statement stmt=null;
		boolean check=false;
		try {
			con = env.getConnection();
			stmt = con.createStatement();
			String query = "Select * from users where id='"+id+"'";
			ResultSet myResult = stmt.executeQuery(query);

			if (myResult.next()) {
			    if(pw.equals(myResult.getString(2)))
						check=true;
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally { 
			try { 
				if(stmt != null)stmt.close();
				if(con != null)con.close();
			}catch(SQLException e){
					e.printStackTrace();
			}
		}
		return check; 
	}
}