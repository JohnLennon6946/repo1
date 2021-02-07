package com.service;

import com.pojo.User;

import java.util.List;

public interface UserService {
    //增
    public void addUser(User user);
    //删
    public void deleteUser(int id);
    //改
    public void updateUser(User user);
    //查
    public List<User> selectUser();
}
