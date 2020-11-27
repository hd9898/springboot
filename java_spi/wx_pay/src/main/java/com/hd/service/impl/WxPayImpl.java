package com.hd.service.impl;

import cn.hd.service.PayService;

public class WxPayImpl implements PayService {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
