package com.stormbreakerenterprises;

public class Armor implements Item {
  private int damageReduction;
  private int value;
  private String description;
  private String name;

  public Armor(String name, String description, int value, int damageReduction) {
    this.name = name;
    this.description = description;
    this.value = value;
    this.damageReduction = damageReduction;
  }

  public int reduceDamage(int damage) {
    return Math.min(0, damage - damageReduction);
  }

  public int getDamageReduction() {
    return damageReduction;
  }
  public int getValue() {
    return value;
  }
  public String getDescription() {
    return description;
  }
  public String getName() {
    return name;
  }
}
