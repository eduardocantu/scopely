package com.eduardo.game.scopely.domain;

import java.math.BigDecimal;

public class Battle {

  private final Player requester;
  private final Player opponent;

  private Player winner;
  private Player looser;

  private BattleResult result;

  public Battle(Player requester,
      Player opponent) {
    this.requester = requester;
    this.opponent = opponent;
  }

  public Battle start() {
    synchronized (requester) {
      synchronized (opponent) {
        // TODO: implement something to wait the user to interact
        //
        finishBattle();
      }
    }
    return this;
  }

  public Player attack(Player attacker, Player defender) {
   Integer damage = attacker.getHitPoints();

   return defender;
  }

  public Player getRequester() {
    return requester;
  }

  public Player getOpponent() {
    return opponent;
  }

  public Player getWinner() {
    return winner;
  }

  public Player getLooser() {
    return looser;
  }

  public BattleResult getResult() {
    return result;
  }

  private void finishBattle() {
    this.winner = requester;
    this.looser = opponent;

    this.result = new BattleResult(new BigDecimal(10), new BigDecimal(10));

    this.looser.removeGold(this.result.getResultingGold());
    this.winner.addGold(this.result.getResultingGold());

    this.looser.removeSilver(this.result.getResultingSilver());
    this.winner.addSilver(this.result.getResultingSilver());
  }
}
