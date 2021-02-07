package com.service;

import com.dao.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pojo.Account;

import java.util.List;
@Service("accountService") //将AccountServiceImpl交给spring的IOC容器管理
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountMapper accountMapper;
    public List<Account> selectAll() {
        System.out.println("业务层，查询所有账户信息");
        return accountMapper.selectAll();
    }

    public void addAccount(Account account) {

        System.out.println("业务层，保存账户");
        accountMapper.addAccount(account);
    }
}
