package com.consumer;

import com.producer.api.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Company: PAJK
 * Author: chenkongshan
 * Created: 2017/4/12
 * Version: since
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    public void testDubbo() {
        System.out.println(testService.sayHello("hello World!"));
    }
}
