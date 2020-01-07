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
 
        //首先判断表单是否支持文件上传,即是否有:enctype="multipart/form-data"
        boolean isMutipart = ServletFileUpload.isMultipartContent(request);
        if(!isMutipart){
            throw new RuntimeException("表单必须是enctype='multipart/form-data'类型的");
        }
 
        //创建一个DiskFileItemFactory工厂类
        DiskFileItemFactory factory = new DiskFileItemFactory();
 
        //创建一个ServletUpload核心对象
        ServletFileUpload sfu = new ServletFileUpload(factory);
 
        //指定编码格式为utf-8
        sfu.setHeaderEncoding("utf-8");
 
        //解析request对象得到一个表单项FileItem的集合
        User user = new User();
 
        try {
            List<FileItem> fileItems = sfu.parseRequest(request);
 
            //我们遍历表单的数据内容
            for (FileItem fileItem : fileItems) {
                if(!fileItem.isFormField()){    //处理上传的表单项
                    //获取文件存盘的目录绝对路径
                    String uploadPath = this.getServletContext().getRealPath("image");
 
                    File file = new File(uploadPath);
                    //判断文件是否存在，如果不存在就创建文件
                    if (!file.exists()) {
                        file.mkdirs();
                    }
 
                    //获取文件上传的名称
                    String filename = fileItem.getName();// 文件名称，可能带路径
                    filename = FilenameUtils.getName(filename);// 文件名称，不带路径
 
                    //根据路径创建一个file对象
                    File uploadFile = new File(uploadPath,filename);
                    //上传文件，然后删除临时文件
                    fileItem.write(uploadFile);
                    //设置url给对象
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
