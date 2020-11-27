package com.hd.test;

import cn.hd.service.PayService;

import java.util.ServiceLoader;

public class MainTest {
    public static void main(String[] args) {
        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class);
        for (PayService payService : load) {
            //System.out.println(payService);
            payService.pay();
        }

    }
}
