package cn.hd.sboot.service;

import cn.hd.sboot.model.AnthorCompotent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    @Bean
    public AnthorCompotent getAnthorCompotent(){

        return  new AnthorCompotent();
    }
}
