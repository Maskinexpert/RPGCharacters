import java.util.Scanner;

import heroes.Heroes;
import heroes.heroPaths.*;

import armor.Armor;
import armor.armorTypes.*;

import weapon.Weapon;
import weapon.weaponTypes.*;


public class RPGCharacters {

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    String heroName;
    Heroes heroWarrior;
    Heroes heroRanger;
    Heroes heroMage;
    Armor armorCloth;
    Armor armorLeather;
    Armor armorPlate;
    Weapon weapon;
    
    /* Taking user input to name the Heroes as it is required by the Hero classes. */
    System.out.println("--==Demonstration: Setup==--");
    System.out.println("Input Warrior name:");
    heroName = input.next();
    heroWarrior = new Warrior(heroName);
    System.out.println("Input Ranger name:");
    heroName = input.next();
    heroRanger = new Ranger(heroName);
    System.out.println("Input Mage name:");
    heroName = input.next();
    heroMage = new Mage(heroName);
    
    
    System.out.println("--==Demonstration: Level up==--");
    System.out.println("--Warrior:--");
    /* *.details() is the method for returning/displaying the heroes name, type, and attributes. */
    heroWarrior.details();
    System.out.println("Leveling up 3 times.");
    /* *.gainExp(*) is the method for giving exp to the hero, enough of which will level up the hero. 400 exp is just above 3 levels. */
    heroWarrior.gainExp(400);
    heroWarrior.details();
    System.out.println("--Ranger:--");
    heroRanger.details();
    System.out.println("Leveling up 3 times.");
    heroRanger.gainExp(400);
    heroRanger.details();
    System.out.println("--Mage:--");
    heroMage.details();
    System.out.println("Leveling up 3 times.");
    heroMage.gainExp(400);
    heroMage.details();
    
    
    System.out.println("--==Demonstration: Equipping Armor and Weapons==--");
    heroWarrior.details();
    /* Leather, Cloth, and Plate are all armor type classes. 
       Each class takes an int describing its level and a armorSlots enum describing its location. */
    armorLeather = new Leather(3,ArmorSlots.Legs);
    /* *.equipArmor(*) is the method for equipping the Hero with that particular armor piece.
       If another piece of armor exists in the location, then it will be replaced by the new armor piece. */
    heroWarrior.equipArmor(armorLeather);
    armorCloth = new Cloth(3,ArmorSlots.Head);
    heroWarrior.equipArmor(armorCloth);
    armorPlate = new Plate(3,ArmorSlots.Body);
    heroWarrior.equipArmor(armorPlate);
    /* Melee, Ranged, and Magic are all weapon type classes.
       Each class takes an int describing its level. */
    weapon = new Melee(3);
    /* *.equipWeapon puts a Weapon class in the Hero's weapon slot */
    heroWarrior.equipWeapon(weapon);
    /* *.displayEquipment is the method for returning/displaying all currently equipped armor and weapon's name, type, and attributes. */
    heroWarrior.displayEquipment();
    heroWarrior.details();


    System.out.println("--==Demonstration: Changing Equipment==--");
    System.out.println("--Before--");
    heroWarrior.details();
    /* armorPlate.* are all getters for each attribute of a piece of armor.
       The same idea is used as part of the *.displayEquipment method. */
    System.out.println(armorPlate.getName() + "\nArmor Level: " + armorPlate.getLevel() 
                                            + "\nBonus Hp: " + armorPlate.getHp() 
                                            + "\nBonus Str: " + armorPlate.getStr() 
                                            + "\nBonus Dex: " + armorPlate.getDex() 
                                            + "\nBonus Int: " + armorPlate.getInt() + "\n");
    System.out.println("--After--");
    armorCloth = new Cloth(3,ArmorSlots.Body);
    heroWarrior.equipArmor(armorCloth);
    heroWarrior.details();
    System.out.println(armorCloth.getName() + "\nArmor Level: " + armorCloth.getLevel() 
                                            + "\nBonus Hp: " + armorCloth.getHp() 
                                            + "\nBonus Str: " + armorCloth.getStr() 
                                            + "\nBonus Dex: " + armorCloth.getDex() 
                                            + "\nBonus Int: " + armorCloth.getInt() + "\n");


    System.out.println("--==Demonstration: Hero Attacking==--");
    heroWarrior.details();
    System.out.println("--Level 3 Weapons attacking--");
    /* *.attack() is the Hero method for attacking which calculates the total damage from: Base Weapon damage + Attribute damage.
       Currently it just displays that damage. */
    heroWarrior.attack();
    weapon = new Ranged(3);
    heroWarrior.equipWeapon(weapon);
    heroWarrior.attack();
    weapon = new Magic(3);
    heroWarrior.equipWeapon(weapon);
    heroWarrior.attack();
  }
     
}