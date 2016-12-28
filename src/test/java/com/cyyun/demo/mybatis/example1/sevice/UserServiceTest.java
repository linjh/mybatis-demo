package com.cyyun.demo.mybatis.example1.sevice;

import com.cyyun.demo.mybatis.AbstractSpringTest;
import com.cyyun.demo.mybatis.example1.beans.User;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by linjh on 2016/12/27.
 */
public class UserServiceTest extends AbstractSpringTest{

    @Resource UserService userService;



    @Test
    public void testLogin() throws Exception {

    }

    @Test
    public void testInsert() throws Exception{
        User user = new User();
        user.setUsername("测试用户2");
        user.setPassword("123456");
        user.setAccount("test"+System.currentTimeMillis());
        Long id = userService.insertUser(user);

        assertNotNull(id);
        System.out.println(id);
    }

    @Test
    public void testBatchInserUser() throws Exception {
        List<User> list = new ArrayList<>();
        for(int i = 0;i<10;i++) {
            User user = new User();
            user.setUsername("测试用户2-"+i);
            user.setPassword("123456");
            user.setAccount("test2-"+i);
            user.setCreateUid(Long.valueOf(i));
            list.add(user);
        }
        int id = userService.batchInserUser(list);

        assertNotNull(id);
        System.out.println(id);
    }

    @Test
    public void testBatchDeleteUser() throws Exception {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        Integer result = userService.batchDeleteUser(list);
        assertNotNull(result);
    }

    @Test
    public void testPagerUser() throws Exception {
        Map<String,Object> params = new HashMap<>();
//        params.put("username",1);
        params.put("pageSize",10);
        params.put("index",2);
        List<User> list = userService.pagerUser(params);
        assertNotNull(list);
        for(User u : list){
            System.out.println(u);
        }
    }

    @Test
    public void testCountUser() throws Exception {
        Map<String,Object> params = new HashMap<>();
        params.put("pageSize",5);
        params.put("index",0);
        int size = userService.countUser(params);
        assertNotNull(size);
        System.out.println(size);
    }

    @Test
    public void testUpdateUser() throws Exception {
        User user = userService.findById(5L);
        user.setPassword("11111");
        int i = userService.updateUser(user);
        System.out.println(user);
        System.out.println(i);
    }

    @Test
    public void testDeleteUser() throws Exception {

    }

    @Test
    public void testFindById() throws Exception {

    }

    @Test
    public void testFindAll() throws Exception {
        List<User> list = userService.findAll();
        for(User u : list){
            System.out.println(u);
        }
    }
}