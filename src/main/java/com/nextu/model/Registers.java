package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

public class Registers {
    /**
     * 自生成主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户账号
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 相关证件
     */
    private String certificate;

    /**
     * 注册日期
     */
    @Column(name = "register_date")
    private Date registerDate;

    /**
     * 自我简介
     */
    private String resume;

    /**
     * 获取自生成主键
     *
     * @return ID - 自生成主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自生成主键
     *
     * @param id 自生成主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户账号
     *
     * @return client_id - 用户账号
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * 设置用户账号
     *
     * @param clientId 用户账号
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取用户名
     *
     * @return name - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户性别
     *
     * @return sex - 用户性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置用户性别
     *
     * @param sex 用户性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取相关证件
     *
     * @return certificate - 相关证件
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * 设置相关证件
     *
     * @param certificate 相关证件
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * 获取注册日期
     *
     * @return register_date - 注册日期
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * 设置注册日期
     *
     * @param registerDate 注册日期
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * 获取自我简介
     *
     * @return resume - 自我简介
     */
    public String getResume() {
        return resume;
    }

    /**
     * 设置自我简介
     *
     * @param resume 自我简介
     */
    public void setResume(String resume) {
        this.resume = resume;
    }
}