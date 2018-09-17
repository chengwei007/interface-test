package com.example.interfacetest.service;

import com.example.interfacetest.entity.Userinfo;

import javax.validation.constraints.Size;
import java.util.List;


public interface TestInterface {
    public int testInterface();
    public Userinfo testUser();
    public int insertUser(Userinfo user);
    public List<Userinfo> findAlluser();
}
