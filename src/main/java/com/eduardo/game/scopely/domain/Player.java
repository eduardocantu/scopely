package com.eduardo.game.scopely.domain;

import java.math.BigDecimal;

public class Player {
  private final Long id;
  private final String name;
  private final String description;
  private BigDecimal amountOfGold;
  private BigDecimal amountOfSilver;
  private final Integer attackValue;
  private final Integer hitPoints;
  private final Integer luckValue;

  public Player() {
    this(null,
        null,
        null,
        null,
        null,
        null,
        null,
        null);
  }

  public Player(Long id,
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

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void addGold(BigDecimal toAdd) {
    amountOfGold = amountOfGold.add(toAdd);
  }

  public void removeGold(BigDecimal toExtract) {
    amountOfGold = amountOfGold.subtract(toExtract);
  }

  public BigDecimal getAmountOfGold() {
    return amountOfGold;
  }

  public void addSilver(BigDecimal toAdd) {
    amountOfSilver = amountOfSilver.add(toAdd);
  }

  public void removeSilver(BigDecimal toExtract) {
    amountOfSilver = amountOfSilver.subtract(toExtract);
  }

  public BigDecimal getAmountOfSilver() {
    return amountOfSilver;
  }

  public Integer getAttackValue() {
    return attackValue;
  }

  public Integer getHitPoints() {
    return hitPoints;
  }

  public Integer getLuckValue() {
    return luckValue;
  }
}
