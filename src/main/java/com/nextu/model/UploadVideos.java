package com.nextu.model;

import javax.persistence.*;

@Table(name = "upload_videos")
public class UploadVideos {
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
     * 自频道编号
     */
    @Column(name = "video_id")
    private Long videoId;

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
}