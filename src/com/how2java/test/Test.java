package com.how2java.test;

import com.how2java.pojo.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangtingfeng
 * @description
 * @data 2019/9/26
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        Category c = (Category) context.getBean("c");
        System.out.println(c.getName());
    }
}
