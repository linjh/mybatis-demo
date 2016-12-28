package com.cyyun.demo.mybatis.example1.mapper;

import com.cyyun.demo.mybatis.example1.beans.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by linjh on 2016/12/26.
 */
public interface UserMapper {

    @Select("select * from t_demo_user where username = #{username} and password= #{password}")
    @Results({
            @Result(id = true,property = "id",column = "id",javaType = Integer.class),
            @Result(property = "username",column = "username",javaType = String.class),
            @Result(property = "password",column = "password",javaType = String.class),
            @Result(property = "account",column = "account",javaType = String.class)
    })
    public User login(String username,String password) ;

    @Insert("insert into t_demo_user(username,password,account) values (#{user.username},#{user.password},#{user.account})")
    @Options(useGeneratedKeys = true,keyProperty = "user.id")
    public Long insertUser(@Param("user") User user) ;

    @Update("update t_demo_user set username=#{u.username},password=#{u.password},account=#{u.account} where id = #{u.id}")
    public int updateUser(@Param("u") User user) ;

    @Delete(("delete from t_demo_user where id = #{id}"))
    public Long deleteUser(Long id) ;

    @Select("select * from t_demo_user where id = #{id}")
    @ResultType(User.class)
    public User findById(Long id) ;

    @Select("select * from t_demo_user")
    @ResultType(User.class)
    public List<User> findAll();

    public int batchInsertUser(@Param("users") List<User> list) ;

    public void batchDeleteUser() ;

    public List<User> pagerUser(Map<String,Object> params) ;

    public int countUser(Map<String,Object> params) ;
}
