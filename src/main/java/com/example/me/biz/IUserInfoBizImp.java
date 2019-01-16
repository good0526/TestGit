package com.example.me.biz;

import com.example.me.dao.UserInfoMapper;
import com.example.me.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class IUserInfoBizImp implements IUserInfoBiz{

    @Autowired
    UserInfoMapper userInfoMapper;

    public UserInfoMapper getUserInfoMapper() {
        return userInfoMapper;
    }

    public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    @Override
    public UserInfo login(String uname, String upwd)
    {
        return userInfoMapper.login(uname,upwd);
    }

}
