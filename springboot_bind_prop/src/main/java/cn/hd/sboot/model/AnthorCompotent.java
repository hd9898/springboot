package cn.hd.sboot.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.InetAddress;

@Data
@ConfigurationProperties(prefix = "acme")
public class AnthorCompotent {
    private boolean enabled;

    private InetAddress remoteAddress;


}
