package Test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.han.utils.DBUtile;
public class Text1 {
	public static void main(String[] args) {
		DBUtile db = new DBUtile();
		Connection conn = db.getConnection();
		if(conn !=null) {
			String sql ="select * from user";
			Statement st;
			try {
				st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) {
					Object cid = rs.getObject("username");
					Object cname = rs.getObject("password");
					System.out.println(cid+"\t"+cname);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
