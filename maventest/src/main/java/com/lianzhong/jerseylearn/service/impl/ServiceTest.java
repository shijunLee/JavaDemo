package com.lianzhong.jerseylearn.service.impl;

import com.lianzhong.jerseylearn.service.IServiceTest;

import org.springframework.stereotype.*;

/**
 * Created by lishijun on 16/4/15.
 */


@Service("iServiceTest")
public class ServiceTest implements IServiceTest {
    public String getString() {
        return "hello World";
    }
}
