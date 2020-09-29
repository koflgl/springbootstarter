package com.lgl.springbootstarter.service;

import com.lgl.springbootstarter.properties.PersonProperties;

/**
 * <p>
 * description
 * </p>
 *
 * @author lgl 2020/09/29 16:35
 * @since 1.0
 */
public class PersonService {

    private PersonProperties properties;

    public PersonService() {
    }

    public PersonService(PersonProperties properties) {
        this.properties = properties;
    }

    public void sayHello() {
        System.out.println("大家好，我叫: " + properties.getName() + ", 今年" + properties.getAge() + "岁");
    }

}
