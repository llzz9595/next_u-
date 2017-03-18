package com.nextu.model.sectionshare.videoroom;

import com.nextu.util.Bag;


import java.util.ArrayList;

/**
 * Created by SYSTEM on 2016/8/1.
 */
public class SelfChannelModel {

    private String selfChannel_Poster;
    private String selfChannel_Title;
    private  String selfChannel_Date;

    public SelfChannelModel() {
    }

    public String getSelfChannel_Poster() {
        return selfChannel_Poster;
    }

    public void setSelfChannel_Poster(String selfChannel_Poster) {
        this.selfChannel_Poster = selfChannel_Poster;
    }

    public String getSelfChannel_Title() {
        return selfChannel_Title;
    }

    public void setSelfChannel_Title(String selfChannel_Title) {
        this.selfChannel_Title = selfChannel_Title;
    }

    public String getSelfChannel_Date() {
        return selfChannel_Date;
    }

    public void setSelfChannel_Date(String selfChannel_Date) {
        this.selfChannel_Date = selfChannel_Date;
    }


//    public Bag<SelfChannelModel>[] GetTwoFromList() {
//        Bag<SelfChannelModel>[] bags = (Bag<SelfChannelModel>[])new Bag[8];
//
//
//        return bags;
//    }

   
}
