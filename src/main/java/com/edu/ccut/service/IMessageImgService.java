package com.edu.ccut.service;

import org.springframework.web.multipart.MultipartFile;

import com.edu.ccut.pojo.Messageimg;

/**
 *@author zhongyuan
 *@date 2016年8月13日
 */
public interface IMessageImgService {
	public boolean uploadMessageIMG(MultipartFile imgFile , Messageimg messageimg);
}
