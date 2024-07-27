package com.eduardo.game.scopely.application;

import static com.eduardo.game.scopely.mappers.PlayerMappers.toApi;
import static com.eduardo.game.scopely.mappers.PlayerMappers.toCreatePlayerResponse;

import com.eduardo.game.scopely.domain.PlayersService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PlayersController {

  public PlayersController(PlayersService playersService) {
    this.playersService = playersService;
  }

  PlayersService playersService;

  @PostMapping("/players")
  public ResponseEntity<CreatePlayerResponse> create(@RequestBody @Valid CreatePlayerRequest player,
      BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      throw new RuntimeException("Validation error!");
    }
    return ResponseEntity.ok(
        toCreatePlayerResponse(
            playersService.create(
                toApi(player)
            )
        )
    );
  }

}
