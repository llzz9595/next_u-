package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "comments_return")
public class CommentsReturn {
    /**
     * 自生成主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 评论编号
     */
    @Column(name = "client_comment_id")
    private Long clientCommentId;

    /**
     * 用户账号
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * 回复时间
     */
    @Column(name = "return_comment_date")
    private Date returnCommentDate;

    /**
     * 回复内容
     */
    @Column(name = "return_content")
    private String returnContent;

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
     * 获取评论编号
     *
     * @return client_comment_id - 评论编号
     */
    public Long getClientCommentId() {
        return clientCommentId;
    }

    /**
     * 设置评论编号
     *
     * @param clientCommentId 评论编号
     */
    public void setClientCommentId(Long clientCommentId) {
        this.clientCommentId = clientCommentId;
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
     * 获取回复时间
     *
     * @return return_comment_date - 回复时间
     */
    public Date getReturnCommentDate() {
        return returnCommentDate;
    }

    /**
     * 设置回复时间
     *
     * @param returnCommentDate 回复时间
     */
    public void setReturnCommentDate(Date returnCommentDate) {
        this.returnCommentDate = returnCommentDate;
    }

    /**
     * 获取回复内容
     *
     * @return return_content - 回复内容
     */
    public String getReturnContent() {
        return returnContent;
    }

    /**
     * 设置回复内容
     *
     * @param returnContent 回复内容
     */
    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent;
    }
}