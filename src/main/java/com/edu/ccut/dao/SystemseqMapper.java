package com.edu.ccut.dao;

import com.edu.ccut.pojo.Systemseq;
import com.edu.ccut.pojo.SystemseqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemseqMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int countByExample(SystemseqExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int deleteByExample(SystemseqExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int insert(Systemseq record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int insertSelective(Systemseq record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	List<Systemseq> selectByExample(SystemseqExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	Systemseq selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByExampleSelective(@Param("record") Systemseq record, @Param("example") SystemseqExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByExample(@Param("record") Systemseq record, @Param("example") SystemseqExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByPrimaryKeySelective(Systemseq record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	int updateByPrimaryKey(Systemseq record);
}