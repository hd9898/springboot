package cn.hd.sboot.controller;

import cn.hd.sboot.model.AnthorCompotent;
import cn.hd.sboot.model.Dep;
import cn.hd.sboot.model.OwnerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsTestController {

    @Bean
    public Dep getDep(){

        return  new Dep();
    }

    @Autowired
    private Dep dep;

    @Autowired
    private AnthorCompotent anthorCompotent;

    @Autowired
    private OwnerProperties properties;

    @RequestMapping("hello")
    public String hello(){
        System.out.println(dep);
        return "hello";
    }
    @RequestMapping("anther")
    public String anther(){
        System.out.println(anthorCompotent);
        return "hello";
    }
    @RequestMapping("owner")
    public String owner(){
        System.out.println(properties);
        return "hello";
    }
}
