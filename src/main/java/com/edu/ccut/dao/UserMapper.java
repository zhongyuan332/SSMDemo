package com.edu.ccut.dao;

import com.edu.ccut.pojo.User;
import com.edu.ccut.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int countByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int deleteByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	List<User> selectByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	User selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByPrimaryKey(User record);

	//@Select("select * from user as u where u.username=#{username} and u.password = #{password}")
	int login(User user);
}