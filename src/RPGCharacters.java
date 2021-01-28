import java.util.Scanner;

import heroes.heroPaths.Warrior;
import heroes.Heroes;



public class RPGCharacters {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String heroName;
    mainMenuLoop: while(true){
      System.out.println("Input Name:");
      heroName = input.next();
      Heroes hero = new Warrior(heroName);
      hero.details();
      break mainMenuLoop;
    }
  }
}