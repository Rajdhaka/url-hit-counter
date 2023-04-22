package com.geekster.urlHitCounter.controller;

import ch.qos.logback.core.boolex.EvaluationException;
import com.geekster.urlHitCounter.model.UrlHit;
import com.geekster.urlHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;

    @GetMapping(value = "/count")
    public String getHitCount(){
        int hitCount= urlHitService.getTotalHitCount();
        System.out.println("totalHitCount is: " +hitCount);
        return "totalHitCount is: " +hitCount;
    }
    @GetMapping(value="/username/{username}/count")
    public UrlHit getUserHitCount(@PathVariable String username){
        return urlHitService.getUserHitCount(username);
    }

}
