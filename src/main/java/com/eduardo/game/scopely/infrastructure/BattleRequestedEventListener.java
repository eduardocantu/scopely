package com.eduardo.game.scopely.infrastructure;

import com.eduardo.game.scopely.domain.Battle;
import com.eduardo.game.scopely.domain.BattleService;
import org.springframework.stereotype.Service;

@Service
public class BattleRequestedEventListener {
  private final BattleService battleService;

  public BattleRequestedEventListener(BattleService battleService) {
    this.battleService = battleService;
  }

  public void onBattleRequested(Battle battle) {
    battleService.addBattle(battle);
  }
}
