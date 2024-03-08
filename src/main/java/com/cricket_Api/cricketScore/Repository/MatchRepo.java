package com.cricket_Api.cricketScore.Repository;

import com.cricket_Api.cricketScore.Entity.Matches;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Matches,Integer> {

    //Match fetch karna chahta hoon -->
    // provide kar de --> teamHeading

    Optional<Matches> findByTeamHeading(String teamHeading);
}
