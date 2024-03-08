package com.cricket_Api.cricketScore.controller;


import com.cricket_Api.cricketScore.Entity.Matches;
import com.cricket_Api.cricketScore.services.MatchService;
import org.hibernate.annotations.Comment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService){
        this.matchService = matchService;
    }


    //get Live Matches

    @GetMapping("/live")
    public ResponseEntity<List<Matches>> getAllLiveMatches(){


        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<Matches>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }

    @GetMapping("/point-table")
    public ResponseEntity<List<List<String>>> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }
}
