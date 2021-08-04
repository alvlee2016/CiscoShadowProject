package com.example.springboot;

public class URLShorten {
    private static final RandomKeyGenerator randomKeyGenerator = new RandomKeyGenerator();
    private static final URLMap urlMap = URLMap.getInstance();
    public static String generateShortURL(String link)
    {
        String key = randomKeyGenerator.randomKey(link);
        while(urlMap.contains(key))
        {
            key = randomKeyGenerator.randomKey(link);
        }
        urlMap.putEntry(key, link);
        return key;
    }
}
