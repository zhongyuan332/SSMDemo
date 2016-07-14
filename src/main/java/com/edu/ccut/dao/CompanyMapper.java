package com.edu.ccut.dao;

import com.edu.ccut.pojo.Company;
import com.edu.ccut.pojo.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int countByExample(CompanyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int deleteByExample(CompanyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int insert(Company record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int insertSelective(Company record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	List<Company> selectByExample(CompanyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	Company selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByPrimaryKeySelective(Company record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByPrimaryKey(Company record);
	
	Company selectByUnitAccNum(String unitaccnum);
	
	List<Company> getAllCompany();
	
}