package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

public class Reviews {
    /**
     * 往期回顾编号
     */
    @Id
    @Column(name = "review_id")
    private Long reviewId;

    /**
     * 主题
     */
    private String theme;

    /**
     * 上传照片
     */
    private String image;

    /**
     * 类别
     */
    private String type;

    /**
     * 上传时间
     */
    @Column(name = "upload_date")
    private Date uploadDate;

    /**
     * 下载次数
     */
    @Column(name = "download_time")
    private Long downloadTime;

    /**
     * 备注
     */
    private String remark;

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

    /**
     * 获取主题
     *
     * @return theme - 主题
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 设置主题
     *
     * @param theme 主题
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * 获取上传照片
     *
     * @return image - 上传照片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置上传照片
     *
     * @param image 上传照片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取类别
     *
     * @return type - 类别
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类别
     *
     * @param type 类别
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取上传时间
     *
     * @return upload_date - 上传时间
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * 设置上传时间
     *
     * @param uploadDate 上传时间
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * 获取下载次数
     *
     * @return download_time - 下载次数
     */
    public Long getDownloadTime() {
        return downloadTime;
    }

    /**
     * 设置下载次数
     *
     * @param downloadTime 下载次数
     */
    public void setDownloadTime(Long downloadTime) {
        this.downloadTime = downloadTime;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}