package com.nextu.model;

import javax.persistence.*;

@Table(name = "clients_concern")
public class ClientsConcern {
    /**
     * 自生成主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 关注用户账号
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * 被关注用户账号
     */
    @Column(name = "concerned_client_id")
    private String concernedClientId;

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
     * 获取关注用户账号
     *
     * @return client_id - 关注用户账号
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * 设置关注用户账号
     *
     * @param clientId 关注用户账号
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取被关注用户账号
     *
     * @return concerned_client_id - 被关注用户账号
     */
    public String getConcernedClientId() {
        return concernedClientId;
    }

    /**
     * 设置被关注用户账号
     *
     * @param concernedClientId 被关注用户账号
     */
    public void setConcernedClientId(String concernedClientId) {
        this.concernedClientId = concernedClientId;
    }
}