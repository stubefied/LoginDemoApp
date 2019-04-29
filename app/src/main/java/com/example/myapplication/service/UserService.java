package com.example.myapplication.service;
import com.example.myapplication.model.UserInfo;
public class UserService {
    public  boolean login(String username,String password){
        UserInfo userInfo=getUserInfo();
        return username.equals(userInfo.username)&&password.equals(userInfo.password);
    }
private UserInfo getUserInfo(){
return new UserInfo("1","password1");
}
}