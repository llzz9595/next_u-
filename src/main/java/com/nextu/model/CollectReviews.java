package com.nextu.model;

import javax.persistence.*;

@Table(name = "collect_reviews")
public class CollectReviews {
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
     * ���ڻع˱��
     */
    @Column(name = "review_id")
    private Long reviewId;

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
     * ��ȡ���ڻع˱��
     *
     * @return review_id - ���ڻع˱��
     */
    public Long getReviewId() {
        return reviewId;
    }

    /**
     * �������ڻع˱��
     *
     * @param reviewId ���ڻع˱��
     */
    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }
}