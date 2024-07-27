package com.eduardo.game.scopely.domain;

import org.springframework.stereotype.Service;

@Service
public class PlayersService {

  PlayerRepository playerRepository;

  public PlayersService(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }

  public Player create(Player player) {
    return playerRepository.save(player);
  }

  public Player get(Long playerId) {
    return playerRepository.get(playerId);
  }
}
