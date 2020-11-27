package cn.hd.sboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "yaml.level")
public class YamlModel {
    private String str;
    private int num;
    private  Double Dnum;
    private Date birth;
    private List<String> list =new ArrayList<>();
    private List<User> users ;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Double getDnum() {
        return Dnum;
    }

    public void setDnum(Double dnum) {
        Dnum = dnum;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "YamlModel{" +
                "str='" + str + '\'' +
                ", num=" + num +
                ", Dnum=" + Dnum +
                ", birth=" + birth +
                ", list=" + list +
                ", users=" + users +
                '}';
    }
}
