package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class LongLink {
    public static LongURLLookup longLinkLookup = new LongURLLookup();
    @GetMapping("/longURL/{shortURL}")
    public String getLongURL(@PathVariable String shortURL)
    {
        String longURL = longLinkLookup.getLongURL(shortURL);
        return "Your original long URL: " + longURL;
    }
}
