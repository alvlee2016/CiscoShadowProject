package com.example.springboot;

public class LongURLLookup {
    private static final URLMap urlMap = URLMap.getInstance();

    public String getLongURL(String shortURL)
    {
        return urlMap.getValue(shortURL);
    }
}
