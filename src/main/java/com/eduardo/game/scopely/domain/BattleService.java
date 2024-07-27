package com.eduardo.game.scopely.domain;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BattleService {

  private final BattleRepository battleRepository;

  public BattleService(BattleRepository battleRepository) {
    this.battleRepository = battleRepository;
  }

  public void addBattle(Battle battle) {
    battleRepository.addBattle(battle);
  }

  public List<Battle> getAvailableBattles() {
    return battleRepository.getBattles();
  }
}
