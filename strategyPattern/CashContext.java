package com.atyang.strategyPattern;

import java.util.Properties;

/**
 * Created by 杨Sir on 2017/11/13.
 * 上下文类，维护了一个策略类,,与简单工厂方法相结合
 */
public class CashContext {

    private Strategy strategy;

    //根据具体的策略类对象计算结果
    public double getResult(double totalPrice) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        strategy = getStrategy();
        return strategy.AlgorithmInterface(totalPrice);
    }

    //通过反射创建对象
    private Strategy getStrategy(){
        Properties prop = Util.getProperties();
        String forName = (String) prop.get("activite");
        Class clazz = null;

        try {
            clazz = Class.forName(forName);
            strategy = (Strategy)clazz.newInstance();

        } catch (ClassNotFoundException e) {
            System.out.println("类型装换异常！");
            e.printStackTrace();
        } catch (InstantiationException e) {
            System.out.println("反射实例化异常");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("反射实例化异常");
            e.printStackTrace();
        }
        return strategy;
    }
}
