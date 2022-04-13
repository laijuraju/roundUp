package com.starling.apis.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionFeedResponse {
	
	private List<FeedItem> feedItems = null;

    public List<FeedItem> getFeedItems() {
        return feedItems;
    }

    public void setFeedItems(List<FeedItem> feedItems) {
        this.feedItems = feedItems;
    }

}
