package com.rilaby.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sword implements Weapon {

  private static final Logger logger = LoggerFactory.getLogger(Sword.class);

  private final Enchantment enchantment;

  public Sword(Enchantment enchantment) {
    this.enchantment = enchantment;
  }

  @Override
  public void wield() {
    logger.info("The sword is wielded.");
    enchantment.onActivate();
  }

  @Override
  public void swing() {
    logger.info("The sword is swinged.");
    enchantment.apply();
  }

  @Override
  public void unwield() {
    logger.info("The sword is unwielded.");
    enchantment.onDeactivate();
  }

  @Override
  public Enchantment getEnchantment() {
    return enchantment;
  }
}
