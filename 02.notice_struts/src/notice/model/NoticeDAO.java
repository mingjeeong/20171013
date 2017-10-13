/* 
        Singleton Pattern�� ���� :
        1.  Singleton instance�� ���� ������� private static
        2.  getInstance() : Singleton public static �޼��� ����
        3.  ������ private
*/

package notice.model;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;
/**
 *<pre>
 * Database�� Notice ������ �����ϱ����� CRUDó�� ����� ����ִ� Ŭ����
 *</pre>
 *
 */

public class NoticeDAO{
	private DataSource env;
    
    /* 
        Singleton Pattern�� ���� :
        1.  Singleton instance�� ���� ������� private static
        2.  getInstance() : Singleton public static �޼��� ����
        3.  ������ private
    */
    // 1.
    private static NoticeDAO dao;

    // 2.
    public static NoticeDAO getInstance() {
        if (dao == null) {
            dao = new NoticeDAO();
        }
        return dao;
    }

    /**
    * Default constructor
    * DataBase ������ ���� DataSource ��ü�� �˻��մϴ�.
    */
    // 3.
	private NoticeDAO() {
	  try {
		  env = (DataSource) new InitialContext().lookup("java:comp/env/jdbc/Oracle");  
	  } catch (Exception e ) { e.printStackTrace();   } 
	}

    /**
    * �������� ������ DB�� �Է��մϴ�.
    * �������� �Է��� ���ؼ� ������ ����� ���������� ��ȣ �� ���� ū���� ���մϴ�.
    * ���� ū���� 1�� ���� ���������� ��ȣ�� ���ϰ�, �������� ���ڵ尡 �������� ���� ��� ��ȣ�� 1�� �����մϴ�.
    * ������ ��ȣ�� �Ű������� �Էµ� id, title, content, �׸��� ���ó�¥�� ���Ͽ� Notice ���̺� �� ���ڵ带 �߰��մϴ�.
    * @param writer �ۼ���
    * @param title  ����
    * @param content  �������� ����
    * @return void
    */
	public void noticeInsert(String writer, String title,String content){
		Statement stmt = null;
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			int seqnum;
			con = env.getConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT max(num) FROM notice");
			if(rs.next())   {
				seqnum = rs.getInt(1) + 1;
			}else{
				seqnum = 1;
		}
		pstmt = con.prepareStatement("INSERT INTO notice VALUES(?,?,?,?,?)");
		pstmt.setInt(1, seqnum);
		pstmt.setString(2, writer);
		Date dt=new Date();
		SimpleDateFormat sd=new SimpleDateFormat();
		String date=sd.getDateInstance().format(dt);
		pstmt.setString(3, date);
		pstmt.setString(4,title);
 		pstmt.setString(5, content);
		pstmt.executeUpdate();
		}catch(Exception e)     {
			e.printStackTrace();
		}finally{
			try { 
				if(stmt != null)stmt.close();
				if(pstmt != null)pstmt.close(); 
				if(con != null)con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
/**
* DB�� �����Ͽ� �������� ������ Notice ��ü�� �����ϰ� ��ü���� ����� ArrayList ���·� �����մϴ�.
* @return ArrayList : �������� ���� ���
*/
	public ArrayList noticeList(){
		Connection con = null;
		ArrayList arr=new ArrayList();
		Statement stmt=null;
		try {
    		con = env.getConnection();
			stmt = con.createStatement();
			String query = "SELECT * FROM Notice ORDER BY num desc";
			ResultSet myResult = stmt.executeQuery(query);

			while (myResult.next()) {
				Notice n=new Notice();
				n.setNum(myResult.getInt("num"));
				n.setWriter(myResult.getString("writer"));
				n.setInDate(myResult.getString("inDate"));
				n.setTitle(myResult.getString("title"));
				n.setContent(myResult.getString("cont"));
				arr.add(n);
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
		 return arr; 
	}

    /**
    * �Ű������� ���޵� ��ȣ�� �������� ������ �˻��Ͽ� Notice ���·� �����մϴ�.
    * @param num �˻��ϰ��� �ϴ� �������� ��ȣ
    * @return Notice : �˻��� ������������(Notice)
    */
	public Notice noticeView(int num){
		Connection con = null;
		Statement stmt=null;
		Notice n=new Notice();
		try {
    		con = env.getConnection();
			stmt = con.createStatement();
			String query = "SELECT * FROM Notice where num="+num;
			ResultSet myResult = stmt.executeQuery(query);
			if (myResult.next()) {
				n.setNum(myResult.getInt("num"));
				n.setWriter(myResult.getString("writer"));
				n.setInDate(myResult.getString("inDate"));
				n.setTitle(myResult.getString("title"));
				n.setContent(myResult.getString("cont"));
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
		return n; 
	}

    /**
    * �Ű������� ���޵� ��ȣ�� �������� ������ �����մϴ�.
    * @param num �����ϰ��� �ϴ� �������� ��ȣ
    * @return void : 
    */
	public void noticeDelete(int num) {
		Connection con = null;
		Statement stmt=null;

        try {
    		con = env.getConnection();
			stmt = con.createStatement();
			String query = "delete from Notice where num="+num;
			stmt.executeUpdate(query);

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
	}

    /**
    * NoticeDAO Ŭ������ �ܵ� �׽�Ʈ�� ���� �޼ҵ�
    */
	public static void main(String[] a){
		NoticeDAO dao=new NoticeDAO();
		dao.noticeInsert("diana","test","test...");
		dao.noticeView(1);
		dao.noticeList();
	}
}
