package com.han.Servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.han.entity.User;





/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/upphoto")
public class UpphotoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String Url;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Map<String,Object> map = new HashMap<String,Object>();
 
        String test = request.getParameter("file");
        System.out.println(test);
        System.out.println(13412);
 
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
 
                    File file = new File(uploadPath);
                    //�ж��ļ��Ƿ���ڣ���������ھʹ����ļ�
                    if (!file.exists()) {
                        file.mkdirs();
                    }
 
                    //��ȡ�ļ��ϴ�������
                    String filename = fileItem.getName();// �ļ����ƣ����ܴ�·��
                    filename = FilenameUtils.getName(filename);// �ļ����ƣ�����·��
 
                    //����·������һ��file����
                    File uploadFile = new File(uploadPath,filename);
                    //�ϴ��ļ���Ȼ��ɾ����ʱ�ļ�
                    fileItem.write(uploadFile);
                    //����url������
                    user.setHead(uploadPath + "/" + filename);
//                    Url=filename;
                    Url= filename;
 
                }
 
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.getServletContext().setAttribute("111",Url);

 
        request.setAttribute("123",Url);
        request.getRequestDispatcher("regist.jsp").forward(request, response);
//        System.out.println(Url);
//        request.setAttribute("url", Url);
        
        
      
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
