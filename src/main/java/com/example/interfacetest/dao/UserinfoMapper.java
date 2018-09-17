package com.example.interfacetest.dao;

import com.example.interfacetest.entity.Userinfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserinfoMapper {
    /**
     *根据主键删除
     */
    public int deleteByPrimaryKey(Integer id);
    /**
     *插入用户
     */
    public int insert(Userinfo record);
    /**
     *根据条件插入
     */
    public int insertSelective(Userinfo record);
    /**
     *根据主键查询
     */
    public Userinfo selectByPrimaryKey(Integer id);
    /**
     *根据条件和主键更新
     */
    public int updateByPrimaryKeySelective(Userinfo record);
    /**
     *根据主键更新
     */
    public int updateByPrimaryKey(Userinfo record);
    /**
     * 查询所有用户
     */
     public List<Userinfo> findAlluser();
}