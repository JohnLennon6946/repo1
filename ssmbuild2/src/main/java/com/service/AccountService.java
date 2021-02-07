package com.service;

import com.pojo.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    //查询所有账户信息
    public List<Account> selectAll();
    //添加账户信息
    public void addAccount(Account account);
}