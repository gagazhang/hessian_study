package com.iflytek.study.hessian;

import com.caucho.hessian.server.HessianServlet;

/**
 * @author : wei
 * @date : 2018/3/14
 */
public class BasicService extends HessianServlet implements Basic {

    @Override
    public String hello(String name) {
        return "Hello" + name;
    }

    @Override
    public String say(String msg) {
        return "say " + msg;
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
