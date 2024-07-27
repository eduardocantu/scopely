package com.eduardo.game.scopely.application;

public class SubmitBattleRequest {

  private final Long requester;
  private final Long opponent;

  public SubmitBattleRequest(Long requester,
      Long opponent) {
    this.requester = requester;
    this.opponent = opponent;
  }

  public Long getRequester() {
    return requester;
  }

  public Long getOpponent() {
    return opponent;
  }
}
