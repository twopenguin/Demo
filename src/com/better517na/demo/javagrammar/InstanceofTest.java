/*
 * 文件名：InstanceofTest.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： InstanceofTest.java
 * 修改人：duanji
 * 修改时间：2016年7月15日
 * 修改内容：新增
 */
package com.better517na.demo.javagrammar;

import org.junit.Test;

import com.better517na.demo.model.Person;
import com.better517na.demo.model.Postgraduate;
import com.better517na.demo.model.Student;
import com.better517na.demo.model.interfa.A;
import com.better517na.demo.model.interfa.B;
import com.better517na.demo.model.interfa.C;

/**
 * TODO 添加类的一句话简单描述.
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * 
 * <pre>
 * </pre>
 * 
 * @author duanji
 */
public class InstanceofTest {

    @Test
    public void testInstanceof() {
        Student student = new Student();
        Postgraduate postgraduate = new Postgraduate();
        if (student instanceof Student) {
            System.out.println("student : Student");
        }
        if (student instanceof Person) {
            System.out.println("student : Person");
        }
        if (student instanceof Postgraduate) {
            System.out.println("student : Postgraduate");
        }
        if (student instanceof Object) {
            System.out.println("student : Object");
        }

        if (postgraduate instanceof Student) {
            System.out.println("postgraduate : Student");
        }
        if (postgraduate instanceof Person) {
            System.out.println("postgraduate : Person");
        }
        if (postgraduate instanceof Postgraduate) {
            System.out.println("postgraduate : Postgraduate");
        }
        if (postgraduate instanceof Object) {
            System.out.println("postgraduate : Object");
        }
    }

    @Test
    public void testInterface() {
        B b = new B();
        if (b instanceof B) {
            System.out.println("b : B");
        }
        if (b instanceof C) {
            System.out.println("b : C");
        }
        if (b instanceof A) {
            System.out.println("b : A");
        }
        if (b instanceof Object) {
            System.out.println("b : Object");
        }
    }

}
