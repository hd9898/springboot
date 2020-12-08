package cn.hd.sboot.controller;


import cn.hd.sboot.mapper.PersonMapper;
import cn.hd.sboot.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private PersonMapper  personMapper;

    @RequestMapping("selectById")
    public Account selectById(){
        return personMapper.selectById(1);
    }
    @RequestMapping("selectAll")
    public List<Account> selectAll(){
        return personMapper.selectAll();
    }
    @RequestMapping("delete")
    public void delete(){
         personMapper.delete(1);
    }
    @RequestMapping("insert")
    public void insert(){
        Account account = new Account(4,"何强",8888d);

        personMapper.insert(account);
    }
}
