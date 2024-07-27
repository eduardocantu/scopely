package com.eduardo.game.scopely.application;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeaderBoardController {

  // TODO: Implement auth
  @GetMapping("/leaders")
  public ResponseEntity<LeaderboardResponse> retrieveLeaderboard() {
    return ResponseEntity.ok().body(new LeaderboardResponse(null));
  }
}
