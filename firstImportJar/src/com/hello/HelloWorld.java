package com.hello;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Created by Think on 2017/7/28.
 */
public class HelloWorld {
    static Logger logger = LogManager.getLogger(HelloWorld.class.getName());
    public static void main(String[] args){
        System.out.printf("hello world 111\n\n");

        logger.error("我是error信息\n");
    }

}
