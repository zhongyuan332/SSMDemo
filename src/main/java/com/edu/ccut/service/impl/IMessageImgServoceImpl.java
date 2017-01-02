package com.edu.ccut.service.impl;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.edu.ccut.controller.MessageImgController;
import com.edu.ccut.dao.MessageimgMapper;
import com.edu.ccut.pojo.Messageimg;
import com.edu.ccut.pojo.MessageimgExample;
import com.edu.ccut.service.IMessageImgService;
import com.edu.ccut.util.FileUpLoad;

/**
 *@author zhongyuan
 *@date 2016年8月13日
 */
@Service("imgservice")
public class IMessageImgServoceImpl implements IMessageImgService {
	
	private static Logger logger = Logger.getLogger(IMessageImgServoceImpl.class);

	@Resource
	private MessageimgMapper messageMapper;

	@Override
	public boolean uploadMessageIMG(MultipartFile imgFile, Messageimg messageimg) {
		FileUpLoad fileupload = new FileUpLoad();
		File file = null;
		// 保存图片
		if (!(imgFile.getOriginalFilename() == null || "".equals(imgFile.getOriginalFilename()))) {
			file = fileupload.getFile(imgFile,messageimg.getSourcimgurl());
		}
		return false;
	}

	@Override
	public List<Messageimg> getAllMessageImg(MessageimgExample messageimgExample) {
		// TODO Auto-generated method stub
		List<Messageimg> list = messageMapper.selectByExample(messageimgExample);
		return list;
	}
	
}
