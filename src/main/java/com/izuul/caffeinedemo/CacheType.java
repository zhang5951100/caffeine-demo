package com.izuul.caffeinedemo;

public enum CacheType {

    IZUUL(10),

    MUMU(5);

    private int expires;

    CacheType(int expires) {
        this.expires = expires;
    }

    public int getExpires() {
        return expires;
    }
}
