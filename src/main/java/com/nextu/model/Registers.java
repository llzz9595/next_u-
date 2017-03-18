package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

public class Registers {
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
     * �û���
     */
    private String name;

    /**
     * �û��Ա�
     */
    private String sex;

    /**
     * �û�����
     */
    private String password;

    /**
     * ���֤��
     */
    private String certificate;

    /**
     * ע������
     */
    @Column(name = "register_date")
    private Date registerDate;

    /**
     * ���Ҽ��
     */
    private String resume;

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
     * ��ȡ�û���
     *
     * @return name - �û���
     */
    public String getName() {
        return name;
    }

    /**
     * �����û���
     *
     * @param name �û���
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ�û��Ա�
     *
     * @return sex - �û��Ա�
     */
    public String getSex() {
        return sex;
    }

    /**
     * �����û��Ա�
     *
     * @param sex �û��Ա�
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * ��ȡ�û�����
     *
     * @return password - �û�����
     */
    public String getPassword() {
        return password;
    }

    /**
     * �����û�����
     *
     * @param password �û�����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ���֤��
     *
     * @return certificate - ���֤��
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * �������֤��
     *
     * @param certificate ���֤��
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * ��ȡע������
     *
     * @return register_date - ע������
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * ����ע������
     *
     * @param registerDate ע������
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * ��ȡ���Ҽ��
     *
     * @return resume - ���Ҽ��
     */
    public String getResume() {
        return resume;
    }

    /**
     * �������Ҽ��
     *
     * @param resume ���Ҽ��
     */
    public void setResume(String resume) {
        this.resume = resume;
    }
}