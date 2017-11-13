package com.atyang.strategyPattern;

import java.util.Properties;

/**
 * Created by 杨Sir on 2017/11/13.
 * 客户端类
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {

        //商品数量
        int num = 3;
        //单价
        double price = 120.5;

        CashContext cashContext = new CashContext();
        double totalPrice = cashContext.getResult(num * price);
        System.out.println("商品总价为： "+ totalPrice);
    }


}
