package com.nextu.model;

import javax.persistence.*;

@Table(name = "clients_concern")
public class ClientsConcern {
    /**
     * ����������
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ��ע�û��˺�
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * ����ע�û��˺�
     */
    @Column(name = "concerned_client_id")
    private String concernedClientId;

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
     * ��ȡ��ע�û��˺�
     *
     * @return client_id - ��ע�û��˺�
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * ���ù�ע�û��˺�
     *
     * @param clientId ��ע�û��˺�
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * ��ȡ����ע�û��˺�
     *
     * @return concerned_client_id - ����ע�û��˺�
     */
    public String getConcernedClientId() {
        return concernedClientId;
    }

    /**
     * ���ñ���ע�û��˺�
     *
     * @param concernedClientId ����ע�û��˺�
     */
    public void setConcernedClientId(String concernedClientId) {
        this.concernedClientId = concernedClientId;
    }
}