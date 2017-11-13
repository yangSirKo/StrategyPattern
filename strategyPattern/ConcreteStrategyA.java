package com.atyang.strategyPattern;

/**
 * Created by 杨Sir on 2017/11/13.
 * 商品原价类
 */
public class ConcreteStrategyA extends Strategy{

    @Override
    public double AlgorithmInterface(double totalPrice) {
        //原价返回
        return totalPrice;
    }
}
