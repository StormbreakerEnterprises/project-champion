package com.stormbreakerenterprises;

public class Weapon implements Item {
  private int value;
  private int damage;
  private String description;
  private String name;

  public Weapon(int weaponValue, int weaponDamage, String weaponDescription) {
    value = weaponValue;
    damage = weaponDamage;
    description = weaponDescription;
  }

  public int getDamage() {
    return damage;
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
