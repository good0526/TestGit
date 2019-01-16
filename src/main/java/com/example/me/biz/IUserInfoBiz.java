package com.example.me.biz;

import com.example.me.entity.UserInfo;

public interface IUserInfoBiz {

    //登录
    public UserInfo login(String uname,String upwd);
}
