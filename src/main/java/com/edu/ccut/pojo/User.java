package com.edu.ccut.pojo;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.username
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.password
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	private String password;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id
	 * @return  the value of user.id
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id
	 * @param id  the value for user.id
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.username
	 * @return  the value of user.username
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.username
	 * @param username  the value for user.username
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.password
	 * @return  the value of user.password
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.password
	 * @param password  the value for user.password
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}
}