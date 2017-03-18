package com.nextu.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "clients_lives")
public class ClientsLives {
    /**
     * ����������
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �û��˺�
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * ֱ������
     */
    @Column(name = "live_id")
    private Long liveId;

  



	/**
     * ֱ��������
     */
    private Integer people;

    /**
     * ��ȡ����������
     *
     * @return ID - ����������
     */
    public Long getId() {
        return id;
    }

    /**
     * ��������������
     *
     * @param id ����������
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ�û��˺�
     *
     * @return client_id - �û��˺�
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * �����û��˺�
     *
     * @param clientId �û��˺�
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * ��ȡֱ������
     *
     * @return live_id - ֱ������
     */
    public Long getLiveId() {
        return liveId;
    }

    /**
     * ����ֱ������
     *
     * @param liveId ֱ������
     */
    public void setLiveId(Long liveId) {
        this.liveId = liveId;
    }

    /**
     * ��ȡֱ��������
     *
     * @return people - ֱ��������
     */
    public Integer getPeople() {
        return people;
    }

    /**
     * ����ֱ��������
     *
     * @param people ֱ��������
     */
    public void setPeople(Integer people) {
        this.people = people;
    }
}