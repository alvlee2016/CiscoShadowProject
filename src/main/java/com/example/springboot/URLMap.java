package com.example.springboot;
import java.util.*;
public class URLMap {
    private static URLMap instance = null;
    private final Map<String, String> urlMap;
    private URLMap()
    {
        urlMap = new HashMap<String, String>();
    }
    public static synchronized URLMap getInstance()
    {
        if(instance == null)
        {
            System.out.println("URL map has been created");
            instance = new URLMap();
        }
        return instance;
    }
    public void putEntry(String key, String link)
    {
        urlMap.put(key, link);
    }
    public String getValue(String key)
    {
//        for (Map.Entry<String, String> entry : urlMap.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
//        }
        return urlMap.get(key);
    }
    public boolean contains(String key)
    {
        return urlMap.containsKey(key);
    }
}
