package com.nextu.model.sectionshare.reviewroom;

import java.util.ArrayList;

/**
 * Created by SYSTEM on 2016/8/4.
 */
public class Impl_ReviewRoom_Model {

	private String ReviewRoom_id;
    private String ReviewRoom_Poster;
    private String ReviewRoom_Title;
    private String ReviewRoom_Date;
    private String ReviewRoom_Type;
    private String ReviewRoom_Comments;

    
    public String getReviewRoom_id() {
		return ReviewRoom_id;
	}

	public void setReviewRoom_id(String reviewRoom_id) {
		ReviewRoom_id = reviewRoom_id;
	}

	public Impl_ReviewRoom_Model() {
    }

    public String getReviewRoom_Type() {
        return ReviewRoom_Type;
    }

    public void setReviewRoom_Type(String reviewRoom_Type) {
        ReviewRoom_Type = reviewRoom_Type;
    }

    public String getReviewRoom_Poster() {
        return ReviewRoom_Poster;
    }

    public void setReviewRoom_Poster(String reviewRoom_Poster) {
        ReviewRoom_Poster = reviewRoom_Poster;
    }

    public String getReviewRoom_Title() {
        return ReviewRoom_Title;
    }

    public void setReviewRoom_Title(String reviewRoom_Title) {
        ReviewRoom_Title = reviewRoom_Title;
    }

    public String getReviewRoom_Date() {
        return ReviewRoom_Date;
    }

    public void setReviewRoom_Date(String reviewRoom_Date) {
        ReviewRoom_Date = reviewRoom_Date;
    }

    public String getReviewRoom_Comments() {
        return ReviewRoom_Comments;
    }

    public void setReviewRoom_Comments(String reviewRoom_Comments) {
        ReviewRoom_Comments = reviewRoom_Comments;
    }

}
