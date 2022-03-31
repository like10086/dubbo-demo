package com.example.test;

import com.alibaba.dubbo.config.annotation.Service;
import org.service.ITest;
import org.model.User;

/**
 * @ClassName: TestService
 * @Description:
 * @author: like
 * @date 2022/3/31 13:55
 */
@Service
public class TestService implements ITest {
    @Override
    public User getUser(){
        return User.builder().userName("123").userAddress("qwe").build();
    }
}
