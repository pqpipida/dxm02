package com.myMall.service;

import com.myMall.common.ServerResponse;
import com.myMall.pojo.User;

/**
 * Created by dd on 2018/9/7.
 */
public interface IUserService {
   ServerResponse<User> login(String username, String password);
    ServerResponse<String> register(User user);
    public ServerResponse<String> checkValid(String str,String type);
}
