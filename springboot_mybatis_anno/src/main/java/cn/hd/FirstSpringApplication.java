package cn.hd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.hd.sboot.mapper")
public class FirstSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class,args);
    }

}
