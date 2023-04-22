package com.geekster.urlHitCounter.service;

import com.geekster.urlHitCounter.model.UrlHit;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UrlHitService{
    static HashMap<String ,Integer>map =  new HashMap<>();
    public UrlHit getUserHitCount(String userName){
       int count=map.getOrDefault(userName,0)+1;
       map.put(userName,count);
       return new UrlHit(userName,count);
    }
    public int getTotalHitCount(){
        return UrlHit.totalHitCount;
    }
}
