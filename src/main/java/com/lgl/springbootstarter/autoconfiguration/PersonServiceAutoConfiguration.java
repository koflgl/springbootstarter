package com.lgl.springbootstarter.autoconfiguration;

import com.lgl.springbootstarter.properties.PersonProperties;
import com.lgl.springbootstarter.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * description
 * </p>
 *
 * @author lgl 2020/09/29 16:34
 * @since 1.0
 */
@Configuration
@EnableConfigurationProperties(PersonProperties.class)
public class PersonServiceAutoConfiguration {

    @Autowired
    private PersonProperties properties;

    /**
     * 当容器中没有指定Bean的情况下，自动配置PersonService类
     */
    @Bean
    @ConditionalOnMissingBean(PersonService.class)
    public PersonService personService() {
        PersonService personService = new PersonService(properties);
        return personService;
    }
}
