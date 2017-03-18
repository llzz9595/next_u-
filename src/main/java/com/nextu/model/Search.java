package com.nextu.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Search {
	 @Id
	    @Column(name = "search_id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int searchId;

	    /**
	     * ��ע�û��˺�
	     */
	    @Column(name = "search_content")
	    private String searchContent;

	    /**
	     * ����ע�û��˺�
	     */
	    @Column(name = "search_time")
	    private String searchTime;

		public int getSearchId() {
			return searchId;
		}

		public void setSearchId(int searchId) {
			this.searchId = searchId;
		}

		public String getSearchContent() {
			return searchContent;
		}

		public void setSearchContent(String searchContent) {
			this.searchContent = searchContent;
		}

		public String getSearchTime() {
			return searchTime;
		}

		public void setSearchTime(String searchTime) {
			this.searchTime = searchTime;
		}

	    
}
