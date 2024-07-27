package com.eduardo.game.scopely.application;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

public class CreatePlayerRequest {
  @Positive
  private final Long id;
  @Size(min=1, max=20)
  @NotBlank
  private final String name;
  @Size(min=1, max=1000)
  @NotBlank
  private final String description;
  @Max(1000000000)
  private final BigDecimal amountOfGold;
  @Max(1000000000)
  private final BigDecimal amountOfSilver;
  private final Integer attackValue;
  private final Integer hitPoints;
  private final Integer luckValue;

  public CreatePlayerRequest(Long id,
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
