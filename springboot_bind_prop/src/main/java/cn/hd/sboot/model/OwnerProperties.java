package cn.hd.sboot.model;

import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
@ConfigurationProperties("acme.my-person.person")
@Component
@Validated
public class OwnerProperties {

   @NotNull
    private  String firstName;

    @Max(35)
    private int age;

    @Email
    private String email;

    @Valid
    private  School school =new School();

    @Data
    class  School{
        @NotNull
        private String  sName;
    }
}
