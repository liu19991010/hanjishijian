package Test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.han.dao.DonamicDao;
import com.han.dao.Donamic_commentDao;
import com.han.dao.Donamic_replyDao;
import com.han.dao.InvitationDao;
import com.han.dao.LoginDao;
import com.han.dao.PhotoDao;
import com.han.dao.RegistDao;
import com.han.entity.Donamic;
import com.han.entity.Donamic_comment;
import com.han.entity.Donamic_reply;
import com.han.entity.Invitation;
import com.han.entity.Photo;
import com.han.entity.User;
import com.han.impl.DonamicDaoImpl;
import com.han.impl.Donamic_commentDaoImpl;
import com.han.impl.Donamic_replyDaoImpl;
import com.han.impl.InvitationDaoImpl;
import com.han.impl.LoginDaoImpl;
import com.han.impl.PhotoDaoImpl;
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
		
		
		
		
//		LoginDao dao =new LoginDaoImpl();
//		System.out.println(dao.findHead("liu"));
//		
//		
		
		
		
		
		
		
		
		
		
//		
//		InvitationDao dao = new InvitationDaoImpl();
////		List <Invitation> list = dao.findAllInvitation();
////		List <Invitation> list = dao.findInvitationAUB("杨绛");
////	    for(Invitation invitation:list) {
////	    	System.out.println(invitation.getAuthor()+"\t"+invitation.getBookname());
////	    }
////		
////		System.out.println(11);
//		
//		List<String> list = dao.findAuthor();
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
//		Invitation in = new Invitation("王",0,"杨绛","我们仨","从今以后，咱们只有死别，不再生离。",18);
//		int temp = dao.Insertinvitation(in);
//		if(temp==1) {
//			System.out.println("成功");
//		}else {
//			System.out.println("失败");
//		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String s = simpleDateFormat.format(date);
		System.out.println(s);
		DonamicDao dao = new DonamicDaoImpl();
		List<Donamic> list = dao.findAllDonamic();
		for(Donamic donamic:list) {
			
			System.out.println(donamic.getConnect());
		    System.out.println(donamic.getTime());
		}
		System.out.println(list.size());
		
		PhotoDao dao1 = new PhotoDaoImpl();
		List<Photo> list1 = dao1.findAllPhoto(1);
		for(Photo photo:list1) {
			System.out.println(photo.getPhoto());
		}
		System.out.println(list1.size());
		Donamic_commentDao dao3 = new Donamic_commentDaoImpl();
		List<Donamic_comment>list2 = dao3.findAllDonamic_comment(1);
		for(Donamic_comment d:list2) {
			System.out.println(d.getConnect());
		}
//		Donamic_comment ds = new Donamic_comment("liu",0,"234234","2018-12-23 13:23:45");
		
		Donamic_comment ds = new Donamic_comment("liu",1,0,"234234",s);
		System.out.println(dao3.insertConamic_comment(ds));
		
		
		
		Donamic_replyDao dao4 = new Donamic_replyDaoImpl();
		List<Donamic_reply> list3 = dao4.findAllDonamic_reply(1);
		for(Donamic_reply dd:list3) {
			System.out.println(dd.getConnect());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
