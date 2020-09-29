package com.lgl.startertest;

import com.lgl.springbootstarter.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StartertestApplicationTests {

    @Autowired
    private PersonService personService;

    @Test
    void contextLoads() {
    }

    @Test
    public void testStarter(){
        personService.sayHello();
    }
}
