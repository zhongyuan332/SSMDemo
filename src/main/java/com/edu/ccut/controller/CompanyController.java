package com.edu.ccut.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.ccut.pojo.Company;
import com.edu.ccut.service.ICompanyService;

/**
 *@author zhongyuan
 *@date 2016年7月11日
 */
@Controller
@RequestMapping(value = "/company")
public class CompanyController {
	
    private static Logger logger = Logger.getLogger(CompanyController.class);

	@Resource
	private ICompanyService companyService; 
	
	@RequestMapping("/savecompany")
	public String saveCompany(Company c,HttpServletRequest request){
		logger.info(c);
		if(c.getUnitaccname()!=null){
			logger.info(c.getUnitchar());
			companyService.saveCompany(c);
		}
		return "success";
	}
	
	@ResponseBody
	@RequestMapping("/allcompany")
	public List<Company> getAllCompany(){
		List<Company> list = companyService.getAllCompany();
		logger.info(list);
		return list;
	}
}
