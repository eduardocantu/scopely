package com.eduardo.game.scopely.application;

import java.util.List;

public class LeaderboardResponse {
  private final List<PlayerView> players;

  public LeaderboardResponse(List<PlayerView> players) {
    this.players = players;
  }

  public static class PlayerView {
    private final Long playerId;
    private final Integer playerPosition;
    private final Integer playerScore;

    public PlayerView(Long playerId,
        Integer playerPosition,
        Integer playerScore) {
      this.playerId = playerId;
      this.playerPosition = playerPosition;
      this.playerScore = playerScore;
    }
  }
}
