package com.dare.bookstore.model;

public class Inquiry {

    private String searchInquiry;

    public Inquiry() {
    }
    public Inquiry(String searchInquiry) {
        this.searchInquiry = searchInquiry;
    }

    public String getSearchInquiry() {
        return searchInquiry;
    }

    public void setSearchInquiry(String searchInquiry) {
        this.searchInquiry = searchInquiry;
    }
}
