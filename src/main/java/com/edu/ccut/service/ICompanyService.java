package com.edu.ccut.service;

import java.util.List;

import com.edu.ccut.pojo.Company;

/**
 *@author zhongyuan
 *@date 2016年7月11日
 */
public interface ICompanyService {
	public boolean saveCompany(Company c);
	public List<Company> getAllCompany();
	public boolean isHaveCompany(String unitaccnum);
	public Company getCompany(Integer id);
	public boolean updateCompany(Company c);
}
