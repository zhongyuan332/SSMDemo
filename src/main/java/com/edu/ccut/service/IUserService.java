package com.edu.ccut.service;

import com.edu.ccut.pojo.Member;
import com.edu.ccut.pojo.User;

/**
 * Created by zhongyuan on 2016/5/11.
 */
public interface IUserService {
    public Member getMemberById(int userId);
    public boolean login(User user);
}
