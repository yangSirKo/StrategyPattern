package com.atyang.strategyPattern;

import java.util.Properties;

/**
 * Created by 杨Sir on 2017/11/13.
 * 打折类
 */
public class ConcreteStrategyB extends Strategy{

    @Override
    public double AlgorithmInterface(double totalPrice) {
        double result = 0.0;
        return result = discount(totalPrice);
    }

    //处理打折的方法
    private double discount(double price) {
        Properties prop = Util.getProperties();
        //获取properties属性值并强转为double类型
        double disCount = Double.parseDouble((String) prop.get("discount"));
        return price * disCount;
    }


}
