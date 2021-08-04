package com.example.springboot;
import java.util.*;
public class RandomKeyGenerator {
    public String randomKey(String link)
    {
        if(link.length() == 0 || link == null)
        {
            return null;
        }
        String key = "";
        Random rand = new Random();
        for(int i = 0; i < 8; i++)
        {
            int a = (int)(Math.random() * 26) + 97;
            char b = (char)a;
            key += b;
        }
        return key;
    }
}
