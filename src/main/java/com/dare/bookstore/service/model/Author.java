package com.dare.bookstore.service.model;

public class Author {

    private int profileId;
    private String name;
    private String profilePicUrl;
    private String description;

    public Author(int profileId, String name, String profilePicUrl, String description) {
        this.profileId = profileId;
        this.name = name;
        this.profilePicUrl = profilePicUrl;
        this.description = description;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
