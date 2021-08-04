package com.example.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ShortLink {
    public static URLShorten shortener = new URLShorten();
    @GetMapping("/shortURL/{longURL}")
    public String getShortURL(@PathVariable String longURL) {
        String key = shortener.generateShortURL(longURL);
        return "Your shortened URL: " + key;
    }
    public static LongURLLookup longLinkLookup = new LongURLLookup();
    @GetMapping("/longURLTest/{shortURL}")
    public String getLongURL(@PathVariable String shortURL)
    {
        String longURL = longLinkLookup.getLongURL(shortURL);
        return "Your original long URL: " + longURL;
    }
}
