import java.util.Scanner;

import heroes.Heroes;
import heroes.heroPaths.Warrior;

import armor.Armor;
import armor.armorTypes.Leather;
import armor.armorTypes.EquipmentSlots;


public class RPGCharacters {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String heroName;
    mainMenuLoop: while(true){
      System.out.println("Input Name:");
      heroName = input.next();
      Heroes hero = new Warrior(heroName);
      Armor armor = new Leather(3,EquipmentSlots.Legs);
      Armor armor2 = new Leather(3,EquipmentSlots.Body);
      hero.gainExp(400);
      hero.equipArmor(armor);
      hero.equipArmor(armor2);
      hero.details();
      hero.displayEquipment();
      break mainMenuLoop;
    }
    
  }
}