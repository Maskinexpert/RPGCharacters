import java.util.Scanner;

import heroes.Heroes;
import heroes.heroPaths.Warrior;

import armor.Armor;
import armor.armorTypes.Leather;
import armor.armorTypes.Cloth;
import armor.armorTypes.EquipmentSlots;

import weapon.Weapon;
import weapon.weaponTypes.Melee;


public class RPGCharacters {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String heroName;
    mainMenuLoop: while(true){
      System.out.println("Input Name:");
      heroName = input.next();
      Heroes hero = new Warrior(heroName);
      Armor armor = new Leather(1,EquipmentSlots.Legs);
      Armor armor2 = new Leather(1,EquipmentSlots.Body);
      Armor armor3 = new Cloth(1,EquipmentSlots.Legs);
      hero.equipArmor(armor);
      hero.equipArmor(armor2);
      hero.details();
      hero.displayEquipment();
      hero.attack();
      //hero.gainExp(400);
      hero.equipArmor(armor3);
      hero.details();
      Weapon weapon = new Melee(1);
      hero.equipWeapon(weapon);
      hero.displayEquipment();
      hero.attack();
      break mainMenuLoop;
    }
    
  }
}