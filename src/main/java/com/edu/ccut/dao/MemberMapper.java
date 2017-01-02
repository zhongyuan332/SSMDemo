package com.edu.ccut.dao;

import com.edu.ccut.pojo.Member;
import com.edu.ccut.pojo.MemberKey;
import com.edu.ccut.pojo.MemberExample;
import java.util.List;

public interface MemberMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table member
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int countByExample(MemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table member
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int deleteByPrimaryKey(MemberKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table member
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int insert(Member record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table member
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int insertSelective(Member record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table member
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	List<Member> selectByExample(MemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table member
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	Member selectByPrimaryKey(MemberKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table member
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int updateByPrimaryKeySelective(Member record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table member
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	int updateByPrimaryKey(Member record);

	Member getMemberByEmail(String email);
}