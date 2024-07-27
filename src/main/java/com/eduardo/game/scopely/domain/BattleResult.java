package com.eduardo.game.scopely.domain;

import java.math.BigDecimal;

public class BattleResult {

  private final BigDecimal resultingGold;

  private final BigDecimal resultingSilver;

  public BattleResult(BigDecimal resultingGold, BigDecimal resultingSilver) {
    this.resultingGold = resultingGold;
    this.resultingSilver = resultingSilver;
  }

  public BigDecimal getResultingGold() {
    return resultingGold;
  }

  public BigDecimal getResultingSilver() {
    return resultingSilver;
  }
}
