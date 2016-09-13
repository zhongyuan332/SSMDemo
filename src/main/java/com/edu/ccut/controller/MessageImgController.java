package com.edu.ccut.controller;

import java.io.File;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.edu.ccut.pojo.Member;
import com.edu.ccut.pojo.Messageimg;
import com.edu.ccut.service.IMessageImgService;
import com.edu.ccut.util.FileUpLoad;

/**
 *@author zhongyuan
 *@date 2016年8月13日
 */
@Controller
@RequestMapping("/uploadimg")
public class MessageImgController {
	
	private static Logger logger = Logger.getLogger(MessageImgController.class);
	
	@Resource
	private IMessageImgService imgservice;
	
	@RequestMapping("/imgupload")
	public String imgUpLoad(HttpServletRequest request,Member member) {
		// 转型为MultipartHttpRequest(重点的所在)
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		// 获得第1张图片（根据前台的name名称得到上传的文件）
		MultipartFile imgFile = multipartRequest.getFile("imgFile");
		FileUpLoad fu = new FileUpLoad();
		logger.info(imgFile);
		logger.info(imgFile.getSize());
		Messageimg messageimg = new Messageimg();
		String realpath =fu.getFileName(request, "imgmessage", fu.getExtName(imgFile));
		logger.info("realpath:"+realpath);
		messageimg.setSourcimgurl(realpath);    //存储绝对路径
		String savepath = realpath.substring(realpath.indexOf("\\touch"));  //\\
		logger.info("realpath:"+savepath);
		messageimg.setSaveurl(savepath);    //存储相对路径  项目下路径 前端显示时调用此路径
		imgservice.uploadMessageIMG(imgFile, messageimg);
		return "registersuccess";
	}
}
