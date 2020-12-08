package cn.hd.sboot.model;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Component;


import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//@ConstructorBinding
@Data
@ConfigurationProperties("acme")
public class AcmeProperties {
    private boolean enabled;

    private InetAddress remoteAddress;

    //private final Security security =new Security() ;

//    public AcmeProperties(boolean enabled, InetAddress remoteAddress, Security security) {
//        this.enabled = enabled;
//        this.remoteAddress = remoteAddress;
//        this.security = security;
//    }

//    public boolean isEnabled() {
//        return enabled;
//    }

//    @Data
//    public static class Security {
//
//        private String username;
//
//        private String password;
//
//        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));

//        public Security(String username, String password,
//                        @DefaultValue("USER") List<String> roles) {
//            this.username = username;
//            this.password = password;
//            this.roles = roles;
//        }



}
