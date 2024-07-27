package com.eduardo.game.scopely.application;

import com.eduardo.game.scopely.domain.Battle;
import com.eduardo.game.scopely.domain.BattleRequester;
import com.eduardo.game.scopely.domain.PlayersService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BattleController {

  final BattleRequester battleRequester;
  final PlayersService playersService;

  public BattleController(BattleRequester battleRequester,
      PlayersService playersService) {
    this.battleRequester = battleRequester;
    this.playersService = playersService;
  }

  @PostMapping("/battles")
  public ResponseEntity<String> submitBattle(@RequestBody SubmitBattleRequest submitBattleRequest) {
    battleRequester.request(toBattle(submitBattleRequest));
    return ResponseEntity.accepted().build();
  }

  private Battle toBattle(SubmitBattleRequest submitBattleRequest) {
    var requester = playersService.get(submitBattleRequest.getRequester());
    var opponent = playersService.get(submitBattleRequest.getOpponent());
    return new Battle(requester, opponent);
  }
}
