package com.eduardo.game.scopely.mappers;

import com.eduardo.game.scopely.application.CreatePlayerResponse;
import com.eduardo.game.scopely.domain.Player;
import com.eduardo.game.scopely.application.CreatePlayerRequest;
import com.eduardo.game.scopely.infrastructure.PlayerEntity;
import org.modelmapper.ModelMapper;

public final class PlayerMappers {

  private static ModelMapper modelMapper = new ModelMapper();

  private PlayerMappers() {
    super();
  }

  public static Player toApi(PlayerEntity playerEntity) {
    return modelMapper.map(playerEntity, Player.class);
  }

  public static Player toApi(CreatePlayerRequest createPlayerRequest) {
    return modelMapper.map(createPlayerRequest, Player.class);
  }

  public static CreatePlayerResponse toCreatePlayerResponse(Player player) {
    return modelMapper.map(player, CreatePlayerResponse.class);
  }

  public static PlayerEntity toEntity(Player player) {
    return modelMapper.map(player, PlayerEntity.class);
  }

}
