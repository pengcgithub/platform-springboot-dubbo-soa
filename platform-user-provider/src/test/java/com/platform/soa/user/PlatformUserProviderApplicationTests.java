package com.platform.soa.user;

import com.platform.soa.user.api.UserService;
import com.platform.soa.user.domain.UserBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformUserProviderApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {

        UserBean userBean = userService.findById("1");
         System.out.println("=============================>"+userBean.getUserName());

    }

}

