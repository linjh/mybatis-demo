package com.cyyun.demo.mybatis.example1.sevice;

import com.cyyun.demo.mybatis.example1.beans.User;

import java.util.List;
import java.util.Map;

/**
 * Created by linjh on 2016/12/26.
 */
public interface UserService {

    public User login(String username,String password);

    public Long insertUser(User user);

    public int batchInserUser(List<User> userList);

    public int batchDeleteUser( List<Long> list) ;

    public List<User> pagerUser(Map<String,Object> params) ;

    public int countUser(Map<String,Object> params) ;

    public User updateUser(User user) ;

    public Long deleteUser(Long id) ;

    public User findById(Long id) ;

    public List<User> findAll();
}
