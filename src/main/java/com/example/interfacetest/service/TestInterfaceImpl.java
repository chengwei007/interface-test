package com.example.interfacetest.service;

import com.example.interfacetest.dao.UserinfoMapper;
import com.example.interfacetest.entity.Userinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestInterfaceImpl implements TestInterface {
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public int testInterface() {
        return 0;
    }

    @Override
    public Userinfo testUser() {
        return new Userinfo();
    }

    @Override
    public int insertUser(Userinfo user) {
        //Map<Integer,Object> map = new HashMap<Integer, Object>();
        return userinfoMapper.insert(user);
    }

    @Override
    public List<Userinfo> findAlluser() {
        return userinfoMapper.findAlluser();
    }
}
