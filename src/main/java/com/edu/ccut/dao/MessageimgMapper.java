package com.edu.ccut.dao;

import com.edu.ccut.pojo.Messageimg;

public interface MessageimgMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Sat Aug 13 15:20:16 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Sat Aug 13 15:20:16 CST 2016
	 */
	int insert(Messageimg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Sat Aug 13 15:20:16 CST 2016
	 */
	int insertSelective(Messageimg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Sat Aug 13 15:20:16 CST 2016
	 */
	Messageimg selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Sat Aug 13 15:20:16 CST 2016
	 */
	int updateByPrimaryKeySelective(Messageimg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Sat Aug 13 15:20:16 CST 2016
	 */
	int updateByPrimaryKey(Messageimg record);
}