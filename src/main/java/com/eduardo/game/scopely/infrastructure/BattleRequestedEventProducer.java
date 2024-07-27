package com.eduardo.game.scopely.infrastructure;

import com.eduardo.game.scopely.domain.Battle;
import com.eduardo.game.scopely.domain.BattleRequester;
import org.springframework.stereotype.Service;

@Service
public class BattleRequestedEventProducer implements BattleRequester {

  private final BattleRequestedEventListener battleRequestedEventListener;

  public BattleRequestedEventProducer(BattleRequestedEventListener battleRequestedEventListener) {
    this.battleRequestedEventListener = battleRequestedEventListener;
  }

  @Override
  public void request(Battle battle) {
    // TODO: implement with kafka
    battleRequestedEventListener.onBattleRequested(battle);
  }
}
