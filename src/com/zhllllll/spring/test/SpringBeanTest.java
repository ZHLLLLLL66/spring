package com.zhllllll.spring.test;

import com.zhllllll.spring.bean.*;
import com.zhllllll.spring.service.MemberServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class SpringBeanTest {
    @Test
    public void getMonster() {
/*
        1.创建容器（获取容器） ApplicationContext
        2. 该容器和一个配置文件是关联的
        */
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
 /*      3. 通过getBean获取对应的对象
                返回的是Object,但是运行类型是Monster*/
        Monster monster01 = (Monster) ioc.getBean("monster01");
        //4.输出
        System.out.println("monster01" + monster01 + "运行类型" + monster01.getClass());
        System.out.println("monster01" + monster01 + "属性name" + monster01.getName());
        System.out.println("monster01" + monster01 + "属性id" + monster01.getMonsterId());
        System.out.println("monster01" + monster01 + "属性技能" + monster01.getSkill());

        //5.也可以再次获取的时候，直接指定class类型，可以再次获取
        Monster monster02 = ioc.getBean("monster01", Monster.class);

        System.out.println("ok~~~");

        //6.查看容器注入了哪些对象 并且输出ID
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionNames = " + beanDefinitionName);
        }
    }

    //类加载路径
    @Test
    public void classPath() {
        File file = new File(this.getClass().getResource("/").getPath());
        System.out.println("file+" + file);
    }

    @Test
    public void getCar() {
        /*
        1.创建容器（获取容器） ApplicationContext
        2. 该容器和一个配置文件是关联的
        */
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
 /*      3. 通过getBean获取对应的对象
                返回的是Object,但是运行类型是Monster*/
        Car car01 = (Car) ioc.getBean("car01");
        //4.输出
        System.out.println(car01);
        //5.也可以再次获取的时候，直接指定class类型，可以再次获取
        Car car02 = ioc.getBean("car01", Car.class);

        System.out.println("ok~~~");

        //6.查看容器注入了哪些对象 并且输出ID
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionNames = " + beanDefinitionName);
        }
    }

    @Test
    public void getMonsterByType() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        //要求IOC容器中同类型的bean只能有一个
        Monster bean = ioc.getBean(Monster.class);

        System.out.println(bean);
    }

    @Test
    public void getMonsterByConstructor() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");

        Monster monster03 = (Monster) ioc.getBean("monster03");

        System.out.println(monster03);
    }

    @Test
    public void setBeanByP() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");

        Monster monster06 = ioc.getBean("monster06", Monster.class);

        System.out.println(monster06);
    }

    @Test
    public void setBeanByRef() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");

        MemberServiceImpl memberService = ioc.getBean("memberService", MemberServiceImpl.class);

        memberService.add();
    }

    @Test
    public void setBeanByInerBean() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");

        MemberServiceImpl memberService01 = ioc.getBean("memberService01", MemberServiceImpl.class);

        memberService01.add();
    }

    @Test
    //对集合数组属性进行辅助
    public void setBeanbBycollection() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Master master01 = ioc.getBean("master01", Master.class);

        System.out.println(master01);
    }

    @Test
    //使用util:list名称空间给属性赋值
    public void setBeanByUtilList() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        BookStore bookstore = ioc.getBean("bookstore", BookStore.class);
        System.out.println(bookstore);
    }

    @Test
    //给属性进行级联赋值
    public void setBeanByRelation() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Employee emp01 = ioc.getBean("emp01", Employee.class);
        System.out.println(emp01);
    }

    @Test
    //通过静态工厂获取bean
    public void getBeanByStaticFactory() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Monster monster01 = ioc.getBean("my_monster01", Monster.class);
        Monster monster02 = ioc.getBean("my_monster01", Monster.class);
        System.out.println(monster01);
        System.out.println(monster02);
        System.out.println(monster01 == monster02);
    }

    @Test
    //通过静态工厂获取bean
    public void getBeanByInstanceFactory() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Monster monster01 = ioc.getBean("my_monster02", Monster.class);
        System.out.println(monster01);
    }

    //通过FactoryBean获取bean
    @Test
    public void getBeanByFactoryBean() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Monster monster01 = ioc.getBean("my_monster03", Monster.class);
        System.out.println(monster01);
    }

    //配置Bean通过继承
    @Test
    public void getBeanByExtends() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Monster monster01 = ioc.getBean("monster11", Monster.class);
        System.out.println(monster01);
    }

    @Test
    public void getBeanByScope() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Cat cat1 = ioc.getBean("cat01", Cat.class);
        Cat cat2 = ioc.getBean("cat01", Cat.class);
        Cat cat3 = ioc.getBean("cat01", Cat.class);
        //由于scope指定singleton所以返回的都是一个对象
        //若scope指定prototype则返回的是不同的对象
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

    }

    @Test
    public void testBeanPostprocessor() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans02.xml");
        House house = ioc.getBean("house", House.class);
        System.out.println("使用house对象" + house);
        ((ConfigurableApplicationContext)ioc).close();

    }
}
