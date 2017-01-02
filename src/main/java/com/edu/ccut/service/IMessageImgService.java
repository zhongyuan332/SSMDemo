package com.edu.ccut.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.edu.ccut.pojo.Messageimg;
import com.edu.ccut.pojo.MessageimgExample;

/**
 *@author zhongyuan
 *@date 2016年8月13日
 */
public interface IMessageImgService {
	public boolean uploadMessageIMG(MultipartFile imgFile , Messageimg messageimg);
	public List<Messageimg> getAllMessageImg(MessageimgExample messageimgExample);
}
