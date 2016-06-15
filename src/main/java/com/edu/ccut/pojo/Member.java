package com.edu.ccut.pojo;

import java.util.Date;

public class Member {
    private Integer id;

    private String membername;

    private String password;

    private String email;

    private Integer schoolid;

    private String qq;

    private String phone;

    private Integer wallid;

    private Date registedate;

    private Date lastlogindate;

    private String lastloginip;

    private String validatecode;

    private Integer state;

    private String r1;

    private String r2;

    private String r3;

    private String r4;

    private String r5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getWallid() {
        return wallid;
    }

    public void setWallid(Integer wallid) {
        this.wallid = wallid;
    }

    public Date getRegistedate() {
        return registedate;
    }

    public void setRegistedate(Date registedate) {
        this.registedate = registedate;
    }

    public Date getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public String getValidatecode() {
        return validatecode;
    }

    public void setValidatecode(String validatecode) {
        this.validatecode = validatecode == null ? null : validatecode.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1 == null ? null : r1.trim();
    }

    public String getR2() {
        return r2;
    }

    public void setR2(String r2) {
        this.r2 = r2 == null ? null : r2.trim();
    }

    public String getR3() {
        return r3;
    }

    public void setR3(String r3) {
        this.r3 = r3 == null ? null : r3.trim();
    }

    public String getR4() {
        return r4;
    }

    public void setR4(String r4) {
        this.r4 = r4 == null ? null : r4.trim();
    }

    public String getR5() {
        return r5;
    }

    public void setR5(String r5) {
        this.r5 = r5 == null ? null : r5.trim();
    }
}