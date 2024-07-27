package com.eduardo.game.scopely.domain;

public interface PlayerRepository {

  Player save(Player player);
  Player get(Long playerId);
}
