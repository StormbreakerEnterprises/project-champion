package com.stormbreakerenterprises;

public class Enemy {
  private int health;
  private int maxHealth;
  private int damage;
  private Armor armor;
  private Weapon weapon;

  public Enemy(int enemyHealth, int enemyMaxHealth, int enemyDamage) {
    health = enemyHealth;
    maxHealth = enemyMaxHealth;
    damage = enemyDamage;
  }

  public int getHealth() {
    return health;
  }
  public void setHealth(int newHealth) {
    health = newHealth;
  }
  public void subtractHealth(int subtract) {
    health -= subtract;
  }
  public void addHealth(int add) {
    health += add;
  }

  public Enemy(Enemy other) {
    // this = other.copy();
  }

  public Enemy copy() {
    return new Enemy(health, maxHealth, damage);
  }

}
