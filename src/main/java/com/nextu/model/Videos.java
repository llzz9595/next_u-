package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

public class Videos {
    /**
     * 自频道编号
     */
    @Id
    @Column(name = "video_id")
    private Long videoId;

    /**
     * 主题
     */
    private String theme;

    /**
     * 上传照片
     */
    private String image;

    /**
     * 上传日期
     */
    @Column(name = "upload_date")
    private Date uploadDate;

    /**
     * 类别
     */
    private String type;

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
     * 获取自频道编号
     *
     * @return video_id - 自频道编号
     */
    public Long getVideoId() {
        return videoId;
    }

    /**
     * 设置自频道编号
     *
     * @param videoId 自频道编号
     */
    public void setVideoId(Long videoId) {
        this.videoId = videoId;
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
     * 获取上传日期
     *
     * @return upload_date - 上传日期
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * 设置上传日期
     *
     * @param uploadDate 上传日期
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
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