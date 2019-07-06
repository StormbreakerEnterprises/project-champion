package com.stormbreakerenterprises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Runner {
  public Runner() {}

  public int dungeonNum;
  public Scanner scanner = new Scanner(System.in);
  public Player player = new Player();

  public void run(String[] args) {
    dungeonNum = 0;
    System.out.println("Welcome to Project Champion, the RPG where you level up in dungeons to defeat challengers in the arena.");
    System.out.println("In the Lobby, there are two things you can do. Fight in the arena, or search for treasure in a dungeon.");
    enterLobby();
  }

  public void enterLobby() {
    System.out.println("Input: \"Enter Arena\", \"Enter Dungeon\", or \"Quit\".");
    String input;

    while (true) {
      input = scanner.nextLine().replaceAll("\\s+", "");
      if (input.equalsIgnoreCase("EnterArena") || input.equalsIgnoreCase("arena")) {
        enterArena();
      } else if (input.equalsIgnoreCase("EnterDungeon") || input.equalsIgnoreCase("dungeon")) {
        enterDungeon();
      } else if (input.equalsIgnoreCase("Quit") || input.equalsIgnoreCase("q")) {
        System.out.println("Quitting");
        System.exit(0);
      } else {
        System.out.println("Input not recognized");
      }
    }
  }

  public void enterDungeon() {
    dungeonNum += 1;
    String dungeonInput;
    System.out.println("Welcome to dungeon number " + dungeonNum + ".");
    System.out.println("Would you like to go \"forward\" or \"out\" of the dungeon?");
    dungeonInput = scanner.nextLine();
    if (dungeonInput.equalsIgnoreCase("Forward")) {
      String encounter;
      Random rand = new Random();
      int randomNum = rand.nextInt(10) + 1;
      if (randomNum < 4) {
        encounter = "Monster";
      } else if (randomNum < 7) {
        encounter = "Trap";
      } else {
        encounter = "Treasure";
      }
      System.out.println("You encounter a " + encounter);
    } else if (dungeonInput.equalsIgnoreCase("out")) {
      return;
    }
  }

  public void enterArena() {
    String arenaInput;
    System.out.println("Welcome to the arena.");
    System.out.println("This round's challenger is Joshua Frostblade");
    System.out.println("In your inventory, you have...");
    player.getItems().removeIf((Item i) -> i == null);
    player.getItems().forEach((Item i) -> System.out.println(i.getName()));
    if (player.getItems().isEmpty()) {
      System.out.println("No items");
    }
    System.out.println("To use a item, input the item's name.");
    arenaInput = scanner.nextLine();
    for (Item item: player.getItems()) {
      if (item == null) {
        break;
      } else {
        if (arenaInput.equalsIgnoreCase(item.getName())) {

        }
      }
    }
  }
}
