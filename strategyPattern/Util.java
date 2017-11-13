package com.atyang.strategyPattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by 杨Sir on 2017/11/13.
 * 获取Properties文件属性工具类
 */
public class Util {

    //获取properties文件属性 的方法
    public static Properties getProperties(){
        //创建属性集合对象
        Properties properties = new Properties();
        try(
                //相对路径
                FileInputStream is =
                        new FileInputStream(new File(".\\src_DesignPatterns\\com\\atyang\\strategyPattern\\strategy.properties"))
        ){
            //将属性文件流装入到 properties对象中
            properties.load(is);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
