package Test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.han.dao.InvitationDao;
import com.han.dao.RegistDao;
import com.han.entity.Invitation;
import com.han.entity.User;
import com.han.impl.InvitationDaoImpl;
import com.han.impl.RegistDaoImpl;
import com.han.utils.DBUtile;
public class Text1 {
	public static void main(String[] args) {
		DBUtile db = new DBUtile();
		Connection conn = db.getConnection();
//		if(conn !=null) {
//			String sql ="select * from user";
//			Statement st;
//			try {
//				st = conn.createStatement();
//				ResultSet rs = st.executeQuery(sql);
//				while(rs.next()) {
//					Object cid = rs.getObject("username");
//					Object cname = rs.getObject("password");
//					System.out.println(cid+"\t"+cname);
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		
		
		
		
		
		
		
		
//		 User user = new User("fds", "dsfv", "vzxcvx", 1, "fsdfa", 13);
//	      RegistDao dao = new RegistDaoImpl();
//	      int temp = dao.insertUser(user);
//			
//			if(temp==1) {
//				System.out.println("chenggong");
//			}else {
//				System.out.println("失败");
//			}
		
		
		
		
		
		
		InvitationDao dao = new InvitationDaoImpl();
//		List <Invitation> list = dao.findAllInvitation();
//		List <Invitation> list = dao.findInvitationAUB("杨绛");
//	    for(Invitation invitation:list) {
//	    	System.out.println(invitation.getAuthor()+"\t"+invitation.getBookname());
//	    }
//		
//		System.out.println(11);
		
		List<String> list = dao.findAuthor();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
//		Invitation in = new Invitation("王",0,"杨绛","我们仨","从今以后，咱们只有死别，不再生离。",18);
//		int temp = dao.Insertinvitation(in);
//		if(temp==1) {
//			System.out.println("成功");
//		}else {
//			System.out.println("失败");
//		}
		
		
		
	}

}
