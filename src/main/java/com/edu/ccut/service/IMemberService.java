package com.edu.ccut.service;

import org.springframework.stereotype.Service;

import com.edu.ccut.pojo.Member;

/**
 *@author zhongyuan
 *@date 2016年7月31日
 */
public interface IMemberService {
	public boolean saveMember(Member member);
	public boolean validateMember(Member member);
}
