package com.example.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.service.ITest;
import org.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName: TestController
 * @Description:
 * @author: like
 * @date 2022/3/31 14:06
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Reference
    ITest iTest;

    @GetMapping("/user")
    public User getUser(){
        return iTest.getUser();
    }

}
