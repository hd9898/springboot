package cn.hd.sboot.controller;



import cn.hd.sboot.model.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableConfigurationProperties(AcmeProperties.class)
public class TestController {

//    @Autowired
//    public AcmeProperties properties ;

//    public TestController(AcmeProperties properties) {
//        this.properties = properties;
//    }

    @RequestMapping("test")
    public String test(){
//        System.out.println(properties);
        //return properties;
        return "trst";
    }

}
