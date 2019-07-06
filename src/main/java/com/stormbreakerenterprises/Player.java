package com.stormbreakerenterprises;

import java.util.*;

public class Player {
  private int level;
  private int xp;
  private int xpNeeded = GameConstants.FIRST_XP_NEEDED;
  public int getLevel() {
    return level;
  }
  public void levelUp() {
    ++level;
  }
  public void addXP(int add) {
    xp += add;
    if (xp >= xpNeeded) {
      xp -= xpNeeded;
      levelUp();
      xpNeeded += GameConstants.LEVEL_XP_INCREASE_RATE;
    }
  }
  private int money;
  public int getMoney() {
    return money;
  }
  private ArrayList<Item> items;
  public ArrayList<Item> getItems() {
    return items;
  }

  public Player() {
    this.level = 1;
    this.money = 0;
    this.items = new ArrayList<>();
  }
}
