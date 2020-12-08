package cn.hd.sboot.model;

import lombok.Data;

@Data
public class Account {
    private  int id;
    private String name;
    private double money;

    public Account(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }
}
