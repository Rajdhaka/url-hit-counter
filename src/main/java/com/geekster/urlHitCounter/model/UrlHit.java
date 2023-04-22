package com.geekster.urlHitCounter.model;

public class UrlHit {
    private String username;
    private int hitCount;
    public static int totalHitCount;

    public UrlHit(String userName,int hitCount) {
        this.username = userName;
        this.hitCount = hitCount;
        totalHitCount++;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}





