package com.han.Servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import com.han.dao.PhotoDao;
import com.han.entity.Photo;
import com.han.entity.User;
import com.han.impl.PhotoDaoImpl;

/**
 * Servlet implementation class Donamic_addPhotoServlet
 */
@WebServlet("/donamic_addphoto")
public class Donamic_addPhotoServlet extends HttpServlet {
	String sr;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
	        response.setContentType("text/html;charset=utf-8");
//	        PrintWriter out = response.getWriter();
//	        Map<String,Object> map = new HashMap<String,Object>();
	// 
//	        String test = request.getParameter("file");
	       
	 
	        //�����жϱ��Ƿ�֧���ļ��ϴ�,���Ƿ���:enctype="multipart/form-data"
	        boolean isMutipart = ServletFileUpload.isMultipartContent(request);
	        if(!isMutipart){
	            throw new RuntimeException("��������enctype='multipart/form-data'���͵�");
	        }
	 
	        //����һ��DiskFileItemFactory������
	        DiskFileItemFactory factory = new DiskFileItemFactory();
	 
	        //����һ��ServletUpload���Ķ���
	        ServletFileUpload sfu = new ServletFileUpload(factory);
	 
	        //ָ�������ʽΪutf-8
	        sfu.setHeaderEncoding("utf-8");
	 
	        //����request����õ�һ������FileItem�ļ���
	        User user = new User();
	 
	        try {
	            List<FileItem> fileItems = sfu.parseRequest(request);
	 
	            //���Ǳ���������������
	            for (FileItem fileItem : fileItems) {
	                if(!fileItem.isFormField()){    //�����ϴ��ı���
	                    //��ȡ�ļ����̵�Ŀ¼����·��
	                    String uploadPath = this.getServletContext().getRealPath("image");
//	                	String uploadPath = "G:\\java\\workspace\\hanjiashijian\\WebContent\\image";
	 
	                    File file = new File(uploadPath);
	                    //�ж��ļ��Ƿ���ڣ���������ھʹ����ļ�
	                    if (!file.exists()) {
	                        file.mkdirs();
	                    }
	                    //��ȡ�ļ��ϴ�������
	                    String filename = fileItem.getName();// �ļ����ƣ����ܴ�·��
	                    filename = FilenameUtils.getName(filename);// �ļ����ƣ�����·��
	                    filename = getRandomName(filename);
	 
	                    //����·������һ��file����
	                    File uploadFile = new File(uploadPath,filename);
	                    System.out.println(uploadFile+"��");
	                    //�ϴ��ļ���Ȼ��ɾ����ʱ�ļ�
	                    fileItem.write(uploadFile);
	                    //����url������
//	                    user.setHead(uploadPath + "/" + filename);
	                    sr=filename;
	                }
	 
	            }
	        } catch (FileUploadException e) {
	            e.printStackTrace();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        int m =(int) request.getSession().getAttribute("number");
	        PhotoDao dao = new PhotoDaoImpl();
	        Photo photo = new Photo(m+1,0,sr);
	        int temp = dao.insertPhoto(photo);
	        if(temp==1) {
				request.getRequestDispatcher("donamic_seek.jsp").forward(request, response);
			}else {
				response.getWriter().print("ʧ��");
			}
	 

	        
	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	 public static String getRandomName(String fileName){
	        int index=fileName.lastIndexOf(".");
	        String houzhui=fileName.substring(index);//��ȡ��׺��
	        String uuidFileName=UUID.randomUUID().toString().replace("-","")+houzhui;
	        return uuidFileName;
	    }
}
