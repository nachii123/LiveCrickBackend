package com.cricket_Api.cricketScore.services;

import com.cricket_Api.cricketScore.Entity.Matches;

import java.util.List;
import java.util.Map;

public interface MatchService {

    // get all matches

    List<Matches> getAllMatches();

    // get Live matches

    List<Matches> getLiveMatches();

    //get cwc2023 point table
    List<List<String>> getPointTable();
}
