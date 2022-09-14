package com.zhllllll.spring.zhlapplicationcontext;

import com.zhllllll.spring.bean.Monster;

public class zhlapplicationcontextTest {
    public static void main(String[] args) throws Exception {

        zhlapplicationcontext ioc =new zhlapplicationcontext("beans.xml");
        Monster monster01 = (Monster) ioc.getBean("monster01");
        System.out.println(monster01);
        System.out.println("ok_____________________________");
    }


}
