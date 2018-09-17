package com.example.interfacetest.controller;

import com.example.interfacetest.service.TestInterface;
import com.example.interfacetest.entity.Userinfo;
import com.example.interfacetest.service.TestInterfaceImpl;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;//SLF4J提供了统一的记录日志的接口,支持{}作为占位符
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    private  static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private TestInterfaceImpl testInterface;
    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String list(ModelMap mm){
        List<Userinfo> userinfos = testInterface.findAlluser();
        /*Userinfo user1 = new Userinfo();
        user1.setId(1);
        user1.setUsername("xcw");
        user1.setPassword("1234567");
        List<Userinfo> userinfos = new ArrayList<>();
        userinfos.add(user1);*/
        for (Userinfo userinfo: userinfos
             ) {
            System.out.println("========================");
            System.out.println(userinfo.getId());
            System.out.println(userinfo.getPassword());
            System.out.println(userinfo.getUsername());
            System.out.println("========================");
        }
        mm.addAttribute("userinfos",userinfos);
        return "list";
    }

    /**
     * 添加用户
     * @return
     */
    @RequestMapping(value = "insert",method = RequestMethod.GET)
    public int insertUser(@RequestParam(value = "name") String username){
        try {
            log.info("测试");
            Userinfo user = new Userinfo();
            user.setUsername(username);
            user.setPassword("123456");
            return testInterface.insertUser(user);
        } catch (Exception e) {
            log.error("inset user:{}",e);
             int faileid = 2;
             return faileid;
        }
        //return userid;
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(ModelMap mm){
        //mm.addAttribute("tst","fsfs");
        //return "test";
        Userinfo user = new Userinfo();
        user.setUsername("hahahaha");
        mm.addAttribute("user",user);
        return "user";
    }
}
