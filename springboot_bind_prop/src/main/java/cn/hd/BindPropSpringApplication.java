package cn.hd;

import cn.hd.sboot.model.AcmeProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AcmeProperties.class)
public class BindPropSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(BindPropSpringApplication.class,args);
    }

}
