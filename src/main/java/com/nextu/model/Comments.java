package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

public class Comments {
    /**
     * ���۱��
     */
    @Id
    @Column(name = "client_comment_id")
    private Long clientCommentId;

    /**
     * �û��˺�
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * ���۵ط�(ֱ���ȵط�)
     */
    @Column(name = "comment_position")
    private String commentPosition;

    /**
     * ���۵ط��б��(����ֱ����ֱָ������)
     */
    @Column(name = "comment_id")
    private Long commentId;

    /**
     * ��������
     */
    @Column(name = "comment_date")
    private Date commentDate;

    /**
     * ��������
     */
    @Column(name = "comment_content")
    private String commentContent;

    /**
     * ��ȡ���۱��
     *
     * @return client_comment_id - ���۱��
     */
    public Long getClientCommentId() {
        return clientCommentId;
    }

    /**
     * �������۱��
     *
     * @param clientCommentId ���۱��
     */
    public void setClientCommentId(Long clientCommentId) {
        this.clientCommentId = clientCommentId;
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
     * ��ȡ���۵ط�(ֱ���ȵط�)
     *
     * @return comment_position - ���۵ط�(ֱ���ȵط�)
     */
    public String getCommentPosition() {
        return commentPosition;
    }

    /**
     * �������۵ط�(ֱ���ȵط�)
     *
     * @param commentPosition ���۵ط�(ֱ���ȵط�)
     */
    public void setCommentPosition(String commentPosition) {
        this.commentPosition = commentPosition;
    }

    /**
     * ��ȡ���۵ط��б��(����ֱ����ֱָ������)
     *
     * @return comment_id - ���۵ط��б��(����ֱ����ֱָ������)
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * �������۵ط��б��(����ֱ����ֱָ������)
     *
     * @param commentId ���۵ط��б��(����ֱ����ֱָ������)
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * ��ȡ��������
     *
     * @return comment_date - ��������
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * ������������
     *
     * @param commentDate ��������
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * ��ȡ��������
     *
     * @return comment_content - ��������
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * ������������
     *
     * @param commentContent ��������
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}