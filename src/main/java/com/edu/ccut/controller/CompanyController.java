package com.edu.ccut.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	/**
	 * 公司开户
	 * @param c
	 * @param request
	 * @return
	 */
	@RequestMapping("/savecompany")
	public String saveCompany(Company c,HttpServletRequest request){
		logger.info(c);
		if(c.getUnitaccname()!=null){
			logger.info(c.getUnitchar());
			companyService.saveCompany(c);
		}
		return "success";
	}
	
	/**
	 * 获取所有公司列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/allcompany")
	public List<Company> getAllCompany(){
		List<Company> list = companyService.getAllCompany();
		logger.info(list);
		return list;
	}
	
	/**
	 * 公司销户
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delcompany")
	public Map delCompany(Integer id){
		logger.info(id);
		Company c = companyService.getCompany(id);
		c.setAccstate(9);
		boolean flag = companyService.updateCompany(c);
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("flag", flag);
		return map;
	}
	
}
