package com.nextu.model;

import java.util.Date;
import javax.persistence.*;

public class Lives {
    /**
     * ֱ������
     */
//	private Clients clients;
	
	
	
	
   

	@Id
    @Column(name = "live_id")
    private Long liveId;

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
     * ��������
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * ��ע
     */
    private String remark;

    /**
     * ��ȡֱ������
     *
     * @return live_id - ֱ������
     */
    public Long getLiveId() {
        return liveId;
    }

    /**
     * ����ֱ������
     *
     * @param liveId ֱ������
     */
    public void setLiveId(Long liveId) {
        this.liveId = liveId;
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
     * ��ȡ��������
     *
     * @return create_date - ��������
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * ���ô�������
     *
     * @param createDate ��������
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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