package com.nextu.model;

import javax.persistence.*;

@Table(name = "upload_videos")
public class UploadVideos {
    /**
     * ����������
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �û��˺�
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * ��Ƶ�����
     */
    @Column(name = "video_id")
    private Long videoId;

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
}