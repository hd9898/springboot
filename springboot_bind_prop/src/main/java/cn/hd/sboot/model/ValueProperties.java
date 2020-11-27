package cn.hd.sboot.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ValueProperties {

    private  String firstName;


    private int age;


    private String email;
}
