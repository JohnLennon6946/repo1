package com.controller;

import com.pojo.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class AccountController {

    //自动依赖注入
    @Autowired
    private AccountService accountService;

    @RequestMapping("selectAll")
    public String selectAll(Model model){
        System.out.println("表现层查询所有账户信息");
        List<Account> accountList=accountService.selectAll();
        model.addAttribute("list",accountList);
        return "list";
    }

    @RequestMapping("addAccount")
    public void addAccount(Account account, HttpServletResponse response, HttpServletRequest request) throws IOException {
        System.out.println("表现层查询所有账户信息");

        accountService.addAccount(account);
        response.sendRedirect(request.getContextPath()+"/selectAll");
        return;
    }
}
