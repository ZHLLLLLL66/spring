package com.zhllllll.spring.zhlapplicationcontext;

import com.zhllllll.spring.bean.Monster;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhllllll
 * 1.这个程序用于实现spring的一个简单容器机制
 * 2.后面我们还会详细的实现
 * 3.这里我们实现如何将beans.xml文件进行解析并生成对应对象放入容器中
 * 4.提供一个方法getBean(id)返回对应的对象
 */
public class zhlapplicationcontext {
    private ConcurrentHashMap<String, Object> singletonObjects = new ConcurrentHashMap<>();

    //构造器
    //接收一个容器的配置文件  比如之前的beans.xml文件
    public zhlapplicationcontext(String iocBeanXmlPath) throws Exception {

        // 1.得到类加载路径
        String path = this.getClass().getResource("/").getPath();
//        System.out.println(path);

        //2.创建Saxreader
        SAXReader saxReader = new SAXReader();

        //3.得到Document对象
        Document document = saxReader.read(new File(path + iocBeanXmlPath));

        //4.得到rootDocument
        Element rootElement = document.getRootElement();

        //5.得到第一个bean-monster01
        Element bean = (Element) rootElement.elements("bean").get(0);

        //6.获取到第一个bean-monster01的相关属性   放到definationMap中 后面再实现
        String id = bean.attributeValue("id");
        String classFullPath = bean.attributeValue("class");
        List<Element> property = bean.elements("property");

        Integer monsterId = Integer.parseInt(property.get(0).attributeValue("value"));
        String name = property.get(1).attributeValue("value");
        String skill = property.get(2).attributeValue("value");
/*
        System.out.println(monsterId);
        System.out.println(name);
        System.out.println(skill);
*/
        //7.使用反射机制创建对象 =》 回顾反射机制
        Class<?> aClass = Class.forName(classFullPath);
        //o对象就是一个Monster对象
        Monster o = (Monster)aClass.newInstance();
        //给o对象赋值
        //反射来赋值  这里简化直接赋值
/*        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            declaredMethod.invoke();
        }*/
        o.setMonsterId(monsterId);
        o.setName(name);
        o.setSkill(skill);

        //8.将创建好的对象方式到singletonObjects
        singletonObjects.put(id ,o);
    }

    public Object getBean(String id){
        return  singletonObjects.get(id);
    }
}
