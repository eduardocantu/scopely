package com.eduardo.game.scopely.infrastructure;

import static com.eduardo.game.scopely.mappers.PlayerMappers.toApi;
import static com.eduardo.game.scopely.mappers.PlayerMappers.toEntity;

import com.eduardo.game.scopely.domain.Player;
import com.eduardo.game.scopely.domain.PlayerRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRedisRepository extends PlayerRepository,
    CrudRepository<PlayerEntity,Long> {

  @Override
  default Player save(Player player) {
    return toApi(
        save(toEntity(player))
    );
  }

  @Override
  default Player get(Long playerId) {
    return toApi(
        findById(playerId)
            .orElseThrow()
    );
  }
}
