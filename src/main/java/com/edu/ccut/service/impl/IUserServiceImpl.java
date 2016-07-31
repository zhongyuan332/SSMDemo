package com.edu.ccut.service.impl;

import com.edu.ccut.dao.UserMapper;
import com.edu.ccut.pojo.User;
import com.edu.ccut.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhongyuan on 2016/5/11.
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {

    private static Logger logger = Logger.getLogger(IUserServiceImpl.class);

    @Resource
    private UserMapper userMapper;


	public boolean login(User user) {
		// TODO Auto-generated method stub
		logger.info(user.getPassword());
		int flag = userMapper.login(user);
		if(flag>0){
			return true;
		}else{
			return false;
		}
	}
}
