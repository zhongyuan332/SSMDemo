package com.edu.ccut.pojo;

import java.util.Date;

public class MemberKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column member.email
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column member.id
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	private Integer id;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column member.email
	 * @return  the value of member.email
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column member.email
	 * @param email  the value for member.email
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column member.id
	 * @return  the value of member.id
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column member.id
	 * @param id  the value for member.id
	 * @mbggenerated  Mon Jan 02 17:35:41 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}