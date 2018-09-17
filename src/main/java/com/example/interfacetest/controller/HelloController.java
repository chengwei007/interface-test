package com.example.interfacetest.controller;

import com.example.interfacetest.service.TestInterface;
import com.example.interfacetest.entity.Userinfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("test")
public class HelloController {
   /* private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private TestInterface testInterface;
    @RequestMapping("/num")
    int home(){
        int i = testInterface.testInterface();
        return i;
    }
    @RequestMapping("/get")
    Userinfo get(){
        return testInterface.testUser();
    }*/

}
