package com.hd.service.impl;

import cn.hd.service.PayService;

public class AliPayImp implements PayService {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
