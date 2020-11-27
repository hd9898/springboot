package cn.hd.sboot.controller;


import cn.hd.sboot.model.YamlModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private YamlModel yamlModel;

    @RequestMapping("hello")
    public String hello(){
        return "hello world 222";
    }
    @RequestMapping("yaml")
    public YamlModel yaml(){
        System.out.println(yamlModel.toString());
        return yamlModel;
    }
}
