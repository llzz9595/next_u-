package com.nextu.model.sectionshare.liveroom;

/**
 * Created by SYSTEM on 2016/7/20.
 */
public class impl_LiveRoom_Model  {

    private String user_Name ;
    private String user_Count;
    private String user_Image;
    private String user_Poster;
    private String user_Title;

public impl_LiveRoom_Model(){}

    public impl_LiveRoom_Model(String user_Count, String user_Image, String user_Name, String user_Poster, String user_Title) {
        this.user_Name = user_Name;
        this.user_Count = user_Count;
        this.user_Image = user_Image;
        this.user_Poster = user_Poster;
        this.user_Title = user_Title;
    }

   

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Count() {
        return user_Count;
    }

    public void setUser_Count(String user_Count) {
        this.user_Count = user_Count;
    }

    public String getUser_Image() {
        return user_Image;
    }

    public void setUser_Image(String user_Image) {
        this.user_Image = user_Image;
    }

    public String getUser_Poster() {
        return user_Poster;
    }

    public void setUser_Poster(String user_Poster) {
        this.user_Poster = user_Poster;
    }

    public String getUser_Title() {
        return user_Title;
    }

    public void setUser_Title(String user_Title) {
        this.user_Title = user_Title;
    }

    
  
}