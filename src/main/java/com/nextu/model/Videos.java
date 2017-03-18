package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

public class Videos {
    /**
     * ��Ƶ�����
     */
    @Id
    @Column(name = "video_id")
    private Long videoId;

    /**
     * ����
     */
    private String theme;

    /**
     * �ϴ���Ƭ
     */
    private String image;

    /**
     * �ϴ�����
     */
    @Column(name = "upload_date")
    private Date uploadDate;

    /**
     * ���
     */
    private String type;

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
     * ��ȡ��Ƶ�����
     *
     * @return video_id - ��Ƶ�����
     */
    public Long getVideoId() {
        return videoId;
    }

    /**
     * ������Ƶ�����
     *
     * @param videoId ��Ƶ�����
     */
    public void setVideoId(Long videoId) {
        this.videoId = videoId;
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
     * ��ȡ�ϴ�����
     *
     * @return upload_date - �ϴ�����
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * �����ϴ�����
     *
     * @param uploadDate �ϴ�����
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
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