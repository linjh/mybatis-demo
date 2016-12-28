package com.cyyun.demo.mybatis.example1.sevice.impl;

import com.cyyun.demo.mybatis.example1.beans.User;
import com.cyyun.demo.mybatis.example1.mapper.UserMapper;
import com.cyyun.demo.mybatis.example1.sevice.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by linjh on 2016/12/26.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }

    @Override
    public Long insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int batchInserUser(List<User> userList) {
        return userMapper.batchInsertUser(userList);
    }

    @Override
    public int batchDeleteUser(List<Long> list) {
         userMapper.batchDeleteUser();
        return 0;
    }

    @Override
    public List<User> pagerUser(Map<String, Object> params) {
        return userMapper.pagerUser(params);
    }

    @Override
    public int countUser(Map<String, Object> params) {
        return userMapper.countUser(params);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public Long deleteUser(Long id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findAll() {
        PageHelper.startPage(2,10);
        return userMapper.findAll();
    }
}
