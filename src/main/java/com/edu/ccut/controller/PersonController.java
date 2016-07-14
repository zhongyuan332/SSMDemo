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

import com.edu.ccut.pojo.Person;
import com.edu.ccut.service.ICompanyService;
import com.edu.ccut.service.IPersonService;

/**
 *@author zhongyuan
 *@date 2016年7月12日
 */
@Controller
@RequestMapping(value = "/person")
public class PersonController {

	 private static Logger logger = Logger.getLogger(PersonController.class);
	 
	 @Resource
	 private IPersonService personService;
	 
	 @Resource
	 private ICompanyService companyService;
	 
	 @RequestMapping("/saveperson")
	 public String savePerson(Person p , HttpServletRequest request){
		 personService.savePerson(p);
		 return "main";
	 }
	 
	 @ResponseBody
	 @RequestMapping("/allperson")
	 public List<Person> getAllPerson(HttpServletRequest request){
		 List<Person> allp = personService.getAllPerson();
		 return allp;
	 }
	 
	 @ResponseBody
	 @RequestMapping("/delperson")
	 public String delPerson(Integer id,HttpServletRequest request){
		 logger.info(id);
		 Person p = personService.getPerson(id);
		 p.setPeraccstate("9");
		 boolean flag = personService.delPerson(p);
		 if(flag){
			 return "success";
		 }else{
			 return "error";
		 }
	 }
	 
	 @ResponseBody
	 @RequestMapping("/ishaveunit")
	 public Map isHaveUnit(String unitaccnum,String idnum){
		 boolean iscompany = companyService.isHaveCompany(unitaccnum);
		 logger.info(unitaccnum);
		 Map<String, Boolean> map = new HashMap<>();
		 if(iscompany){
			 map.put("company", iscompany);
		 }else{
			 map.put("company", false);
		 }
		 return map;
	 }
}
