package com.nextu.model;

import javax.persistence.*;

public class MyMap {
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
     * ����
     */
    private Double longitude;

    /**
     * γ��
     */
    private Double latitude;

    /**
     * �û�����
     */
    @Column(name = "client_area")
    private Integer clientArea;

    /**
     * ���
     */
    private String type;

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
     * ��ȡ����
     *
     * @return longitude - ����
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * ���þ���
     *
     * @param longitude ����
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * ��ȡγ��
     *
     * @return latitude - γ��
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * ����γ��
     *
     * @param latitude γ��
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * ��ȡ�û�����
     *
     * @return client_area - �û�����
     */
    public Integer getClientArea() {
        return clientArea;
    }

    /**
     * �����û�����
     *
     * @param clientArea �û�����
     */
    public void setClientArea(Integer clientArea) {
        this.clientArea = clientArea;
    }

    /**
     * ��ȡ���
     *
     * @return type - ���
     */
    public String getType() {
        return type;
    }

    /**
     * �������
     *
     * @param type ���
     */
    public void setType(String type) {
        this.type = type;
    }
}