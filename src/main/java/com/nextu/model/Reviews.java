package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

public class Reviews {
    /**
     * ���ڻع˱��
     */
    @Id
    @Column(name = "review_id")
    private Long reviewId;

    /**
     * ����
     */
    private String theme;

    /**
     * �ϴ���Ƭ
     */
    private String image;

    /**
     * ���
     */
    private String type;

    /**
     * �ϴ�ʱ��
     */
    @Column(name = "upload_date")
    private Date uploadDate;

    /**
     * ���ش���
     */
    @Column(name = "download_time")
    private Long downloadTime;

    /**
     * ��ע
     */
    private String remark;

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

    /**
     * ��ȡ����
     *
     * @return theme - ����
     */
    public String getTheme() {
        return theme;
    }

    /**
     * ��������
     *
     * @param theme ����
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * ��ȡ�ϴ���Ƭ
     *
     * @return image - �ϴ���Ƭ
     */
    public String getImage() {
        return image;
    }

    /**
     * �����ϴ���Ƭ
     *
     * @param image �ϴ���Ƭ
     */
    public void setImage(String image) {
        this.image = image;
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

    /**
     * ��ȡ�ϴ�ʱ��
     *
     * @return upload_date - �ϴ�ʱ��
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * �����ϴ�ʱ��
     *
     * @param uploadDate �ϴ�ʱ��
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * ��ȡ���ش���
     *
     * @return download_time - ���ش���
     */
    public Long getDownloadTime() {
        return downloadTime;
    }

    /**
     * �������ش���
     *
     * @param downloadTime ���ش���
     */
    public void setDownloadTime(Long downloadTime) {
        this.downloadTime = downloadTime;
    }

    /**
     * ��ȡ��ע
     *
     * @return remark - ��ע
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ���ñ�ע
     *
     * @param remark ��ע
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}