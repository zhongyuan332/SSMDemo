package com.edu.ccut.dao;

import com.edu.ccut.pojo.Messageimg;
import com.edu.ccut.pojo.MessageimgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageimgMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int countByExample(MessageimgExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int deleteByExample(MessageimgExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int insert(Messageimg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int insertSelective(Messageimg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	List<Messageimg> selectByExample(MessageimgExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	Messageimg selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Messageimg record, @Param("example") MessageimgExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int updateByExample(@Param("record") Messageimg record, @Param("example") MessageimgExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int updateByPrimaryKeySelective(Messageimg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table messageimg
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int updateByPrimaryKey(Messageimg record);
}