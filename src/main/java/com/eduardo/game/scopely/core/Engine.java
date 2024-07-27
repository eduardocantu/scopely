package com.eduardo.game.scopely.core;

import com.eduardo.game.scopely.domain.Battle;
import com.eduardo.game.scopely.domain.BattleService;
import com.eduardo.game.scopely.domain.LeaderBoardService;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class Engine {

  private static final Logger logger = Logger.getLogger(Engine.class.getName());
  private final BattleService battleService;
  private final LeaderBoardService leaderBoardService;

  public Engine(BattleService battleService,
      LeaderBoardService leaderBoardService) {
    this.battleService = battleService;
    this.leaderBoardService = leaderBoardService;
  }

  // TODO: Implement using task executors
  void run() {
    while(true) {
      battleService.getAvailableBattles()
          .parallelStream()
          .forEach(battle -> {
            announceStart(battle);
            CompletableFuture
                .supplyAsync(battle::start)
                .thenAccept(finishedBattle -> {
                  leaderBoardService.addResult(finishedBattle.getResult());
                  announceEnd(finishedBattle);
                });
          });
    }
  }

  private static void announceStart(Battle battle) {
    logger.info(
        String.format(
            "Starting battle between %s and %s",
          battle.getRequester().getName(),
          battle.getOpponent().getName())
    );
  }

  private void announceEnd(Battle battle) {
    logger.info(
        String.format(
            "Battle between %s and %s had finished. %s is the winner!",
            battle.getRequester().getName(),
            battle.getOpponent().getName(),
            battle.getWinner().getName())
    );
  }
}
