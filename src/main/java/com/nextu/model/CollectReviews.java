package com.nextu.model;

import javax.persistence.*;

@Table(name = "collect_reviews")
public class CollectReviews {
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
     * 往期回顾编号
     */
    @Column(name = "review_id")
    private Long reviewId;

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
     * 获取往期回顾编号
     *
     * @return review_id - 往期回顾编号
     */
    public Long getReviewId() {
        return reviewId;
    }

    /**
     * 设置往期回顾编号
     *
     * @param reviewId 往期回顾编号
     */
    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }
}