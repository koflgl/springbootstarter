package com.lgl.springbootstarter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * description
 * </p>
 *
 * @author lgl 2020/09/29 16:32
 * @since 1.0
 */
@ConfigurationProperties(prefix = "spring.person")
public class PersonProperties {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
