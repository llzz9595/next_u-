package com.nextu.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Clients {
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
     * ���۷���
     */
    private Integer rank;

    /**
     * ��������
     */
    @Column(name = "rank_people")
    private Integer rankPeople;

    /**
     * �û�ͷ��
     */
    private String image;

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
     * ��ȡ���۷���
     *
     * @return rank - ���۷���
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * �������۷���
     *
     * @param rank ���۷���
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * ��ȡ��������
     *
     * @return rank_people - ��������
     */
    public Integer getRankPeople() {
        return rankPeople;
    }

    /**
     * ������������
     *
     * @param rankPeople ��������
     */
    public void setRankPeople(Integer rankPeople) {
        this.rankPeople = rankPeople;
    }

    /**
     * ��ȡ�û�ͷ��
     *
     * @return image - �û�ͷ��
     */
    public String getImage() {
        return image;
    }

    /**
     * �����û�ͷ��
     *
     * @param image �û�ͷ��
     */
    public void setImage(String image) {
        this.image = image;
    }
}