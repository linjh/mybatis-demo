package com.cyyun.demo.mybatis.example1.beans;

import java.io.Serializable;

/**
 * Created by linjh on 2016/12/26.
 */
public class User implements Serializable{

    private Long id;
    private String username;
    private String password;
    private String account;

    private Long createUid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Long getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Long createUid) {
        this.createUid = createUid;
    }

    @Override
    public String toString() {
        return "User[id="+id+",username="+username+",password="+password+",account="+account+",createUid="+createUid+"]";
    }
}
