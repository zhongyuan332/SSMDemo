package com.edu.ccut.util;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.Part;

import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhongyuan
 * @date 2016年8月12日
 */
public class FileUpLoad {

	private static Logger logger = Logger.getLogger(FileUpLoad.class); // log4j
																		// 测试
	List<String> fileTypes = new ArrayList<>();
	
	
	public List<String> getFileTypes() {
		fileTypes.add("jpg");
		fileTypes.add("png");
		fileTypes.add("gif");
		fileTypes.add("jpeg");
		return fileTypes;
	}

	/**
	 * 
	 * @param infile
	 *            输入文件
	 * @param outfile
	 *            输出文件
	 * @param srcFormat
	 *            源格式
	 * @param destFormat
	 *            输出格式
	 * @return
	 * @throws Exception
	 */
	public static boolean convertFormat(InputStream infile, OutputStream outfile, String srcFormat, String destFormat,
			int width, int height) throws Exception {
		boolean flag = false;
		BufferedImage src = ImageIO.read(infile);
		if (height > 0 && width > 0) {// compress the origin image if width and
										// height are non-zero
			height = src.getHeight() > height ? height : src.getHeight();
			width = src.getWidth() > width ? width : src.getWidth();
			Image image = src.getScaledInstance(width, height, Image.SCALE_DEFAULT);// 这个是用来进行图片大小调整的

			BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

			Graphics g = tag.getGraphics();
			// 可在下面对图片进行绘制和更改
			g.drawImage(image, 0, 0, null); // 绘制缩小后的图

			g.dispose();
			tag.flush();
			flag = ImageIO.write(tag, destFormat, outfile);// 输出到经过缩放的文件流
		} else {
			flag = ImageIO.write(src, destFormat, outfile);// 输出原分辨率的图片
		}
		logger.info("图片转换成功: 从[" + srcFormat + "]到[" + destFormat + "]");
		return flag;
	}

	/**
	 * 
	 * @param imgFile
	 * @param savepath
	 * @return
	 */
	public File getFile(MultipartFile imgFile, String savepath) {
		this.getFileTypes();
		String fileName = imgFile.getOriginalFilename();
		// 获取上传文件类型的扩展名,先得到.的位置，再截取从.的下一个位置到文件的最后，最后得到扩展名
		String ext = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
		// 对扩展名进行小写转换
		ext = ext.toLowerCase();
		File file = new File(savepath);
		if (fileTypes.contains(ext)) { // 如果扩展名属于允许上传的类型，则创建文件
			try {
				//file.createNewFile();
				imgFile.transferTo(file); // 保存上传的文件
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			logger.info("filePath:"+file);
		}
		
		logger.info("---****---"+file);
		return file;
	}
	
	public String getExtName(MultipartFile imgFile){
		String fileName = imgFile.getOriginalFilename();
		// 获取上传文件类型的扩展名,先得到.的位置，再截取从.的下一个位置到文件的最后，最后得到扩展名
		return fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
	}
	
	/**
	 * 
	 * @param request
	 * @param virtualpath
	 * @param filename
	 * @return
	 */
	private File creatFolder(HttpServletRequest request,String virtualpath , String filename) {
		String realpath = request.getSession().getServletContext().getRealPath("") + "\\fileupload\\" + virtualpath+"\\";
		File file = new File(realpath);
		if(file.exists()){
			file = new File(realpath,filename);
		}else {
			file.mkdirs();
			file = new File(realpath,filename);
		}
		logger.info("realPath:"+realpath);
		return file;
	}
	
	/**
	 * 
	 * @param request
	 * @param virtualpath
	 * @param filename
	 * @param ext
	 * @return
	 */
	public String getFileName(HttpServletRequest request,String virtualpath , String ext){
		String truename =GetInfomation.getRandomString(32) + System.currentTimeMillis() + "." + ext;
		logger.info(truename);
		File file = this.creatFolder(request, virtualpath,truename);
		logger.info(file);
		return file.toString();
	}
	
}
