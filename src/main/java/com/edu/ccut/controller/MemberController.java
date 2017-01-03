package com.edu.ccut.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.edu.ccut.pojo.Member;
import com.edu.ccut.service.IMemberService;
import com.edu.ccut.util.FileUpLoad;
import com.edu.ccut.util.GetInfomation;

/**
 * @author zhongyuan
 * @date 2016年7月31日
 */

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static Logger logger = Logger.getLogger(MemberController.class); // log4j
																				// 测试

	@Resource
	private IMemberService memberService;

	@RequestMapping("/login")
	public String loginMember(Member member, HttpServletRequest request) {
		GetInfomation gif = new GetInfomation();
		String ip = gif.getIpAddr(request);
		logger.info("--客户端ip--" + ip);
		logger.info("--测试--" + request.getRemoteAddr());
		logger.info("--客户端MAC地址--" + gif.getMACAddress(ip));
		member.setLastip(ip);
		boolean flag = memberService.saveMember(member);
		if (flag) {
			return "index";
		} else {
			return "error";

		}
	}

	@RequestMapping("/validate")
	public String validateMember(Member member, HttpServletRequest request) {
		logger.info("--validate--" + member.getEmail());
		logger.info("--validate--" + member.getValidatecode());
		boolean flag = memberService.validateMember(member);
		if (flag) {
			return "registersuccess";
		} else {
			return "registererror";
		}
	}
	@RequestMapping("/findpage")
	@ResponseBody
	public List<Member> findPage(){
		return null;
	}
}
