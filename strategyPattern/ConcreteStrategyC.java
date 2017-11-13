package com.atyang.strategyPattern;

import java.util.Properties;

/**
 * Created by 杨Sir on 2017/11/13.
 * 满减类
 */
public class ConcreteStrategyC extends Strategy{

    @Override
    public double AlgorithmInterface(double totalPrice) {
        double result = 0.0;
        return result = fullReduce(totalPrice);
    }

    //满减的方法
    private double fullReduce(double price) {
        Properties prop = Util.getProperties();
        double full = Double.parseDouble(String.valueOf(prop.get("full")));
        double reduce = Double.parseDouble((String) prop.get("reduce"));
        //满减
        if(price >= full)
            return price - reduce;
        //不减
        return price;
    }
}
