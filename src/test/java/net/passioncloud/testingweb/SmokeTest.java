package net.passioncloud.testingweb;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class SmokeTest {
    // @Autowired makes the controller get injected before the tests are run
    @Autowired
    private HomeController controller;

    @Test
    public void contextLoads() throws Exception {
        System.out.println("context loads test");
        Assert.notNull(controller, "Controller is null");
    }
}
