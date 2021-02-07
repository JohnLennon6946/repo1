package com.dao;

import com.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository    //把Mapper对象交给IOC容器来管
public interface AccountMapper {
    //查询所有账户信息
    @Select("select *from account")
    public List<Account> selectAll();
    //添加账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void addAccount(Account account);
}
