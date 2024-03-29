package lemubit.academy.springthymeleafexample;

import lemubit.academy.springthymeleafexample.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringthymeleafexampleApplicationTests {

    @Resource
    UserService userService;

    @Test
    public void getUser() {
        Assert.assertEquals(userService.getUser(), "Jack");
    }

    @Test
    public void contextLoads() {
    }

}
