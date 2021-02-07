package com.service;

import com.dao.UserDao;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public List<User> selectUser() {
        System.out.println("spring service层的查询方法");
        return userDao.selectUser();
    }
}
