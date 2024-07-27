package com.eduardo.game.scopely.domain;

import java.util.List;

public interface BattleRepository {

  void addBattle(Battle battle);
  List<Battle> getBattles();
}
