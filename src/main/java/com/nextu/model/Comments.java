package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

public class Comments {
    /**
     * 评论编号
     */
    @Id
    @Column(name = "client_comment_id")
    private Long clientCommentId;

    /**
     * 用户账号
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * 评论地方(直播等地方)
     */
    @Column(name = "comment_position")
    private String commentPosition;

    /**
     * 评论地方中编号(比如直播就指直播间编号)
     */
    @Column(name = "comment_id")
    private Long commentId;

    /**
     * 评论日期
     */
    @Column(name = "comment_date")
    private Date commentDate;

    /**
     * 评论内容
     */
    @Column(name = "comment_content")
    private String commentContent;

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
     * 获取评论地方(直播等地方)
     *
     * @return comment_position - 评论地方(直播等地方)
     */
    public String getCommentPosition() {
        return commentPosition;
    }

    /**
     * 设置评论地方(直播等地方)
     *
     * @param commentPosition 评论地方(直播等地方)
     */
    public void setCommentPosition(String commentPosition) {
        this.commentPosition = commentPosition;
    }

    /**
     * 获取评论地方中编号(比如直播就指直播间编号)
     *
     * @return comment_id - 评论地方中编号(比如直播就指直播间编号)
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 设置评论地方中编号(比如直播就指直播间编号)
     *
     * @param commentId 评论地方中编号(比如直播就指直播间编号)
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取评论日期
     *
     * @return comment_date - 评论日期
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * 设置评论日期
     *
     * @param commentDate 评论日期
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * 获取评论内容
     *
     * @return comment_content - 评论内容
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * 设置评论内容
     *
     * @param commentContent 评论内容
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}