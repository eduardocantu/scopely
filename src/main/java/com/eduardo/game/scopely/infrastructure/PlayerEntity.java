package com.eduardo.game.scopely.infrastructure;

import java.math.BigDecimal;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Player")
public class PlayerEntity {

  private Long id;
  private final String name;
  private final String description;
  private final BigDecimal amountOfGold;
  private final BigDecimal amountOfSilver;
  private final Integer attackValue;
  private final Integer hitPoints;
  private final Integer luckValue;

  public PlayerEntity() {
    this(null,
        null,
        null,
        null,
        null,
        null,
        null,
        null);
  }

  public PlayerEntity(Long id,
      final String name,
      final String description,
      final BigDecimal amountOfGold,
      final BigDecimal amountOfSilver,
      final Integer attackValue,
      final Integer hitPoints,
      final Integer luckValue) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.amountOfGold = amountOfGold;
    this.amountOfSilver = amountOfSilver;
    this.attackValue = attackValue;
    this.hitPoints = hitPoints;
    this.luckValue = luckValue;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
