package com.iflytek.study.hessian;

import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;

/**
 * @author : wei
 * @date : 2018/3/14
 */
public class Client {

    interface Hello{
        String hello(Object name);
    }

    interface SumSay{
        String say(String msg);

        int sum(int a, int b);

        int hi(String hi);
    }

    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost.:8080/hession-study/hello";
        HessianProxyFactory  factory = new HessianProxyFactory();
        Hello basic = (Hello) factory.create(Hello.class,url);
        System.out.println(basic.hello(123));

//        SumSay sumSay = (SumSay) factory.create(SumSay.class,url);
//        System.out.println(sumSay.say("你好"));
////        System.out.println(sumSay.hi("hello"));
//        System.out.println("10 + 20 = " + sumSay.sum(10,20));
    }
}
