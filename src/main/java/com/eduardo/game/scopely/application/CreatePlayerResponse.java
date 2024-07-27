package com.eduardo.game.scopely.application;

import java.math.BigDecimal;

public class CreatePlayerResponse {
  private final Long id;
  private final String name;
  private final String description;
  private final BigDecimal amountOfGold;
  private final BigDecimal amountOfSilver;
  private final Integer attackValue;
  private final Integer hitPoints;
  private final Integer luckValue;

  public CreatePlayerResponse(Long id,
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
}
