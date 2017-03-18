package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "comments_return")
public class CommentsReturn {
    /**
     * ����������
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ���۱��
     */
    @Column(name = "client_comment_id")
    private Long clientCommentId;

    /**
     * �û��˺�
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * �ظ�ʱ��
     */
    @Column(name = "return_comment_date")
    private Date returnCommentDate;

    /**
     * �ظ�����
     */
    @Column(name = "return_content")
    private String returnContent;

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
     * ��ȡ�ظ�ʱ��
     *
     * @return return_comment_date - �ظ�ʱ��
     */
    public Date getReturnCommentDate() {
        return returnCommentDate;
    }

    /**
     * ���ûظ�ʱ��
     *
     * @param returnCommentDate �ظ�ʱ��
     */
    public void setReturnCommentDate(Date returnCommentDate) {
        this.returnCommentDate = returnCommentDate;
    }

    /**
     * ��ȡ�ظ�����
     *
     * @return return_content - �ظ�����
     */
    public String getReturnContent() {
        return returnContent;
    }

    /**
     * ���ûظ�����
     *
     * @param returnContent �ظ�����
     */
    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent;
    }
}