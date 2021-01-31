package heroes.heroPaths;
import heroes.Heroes;
import heroes.heroPaths.PathTypes;
import armor.Armor;

public class Warrior extends Heroes {
  
  public Warrior (String heroName){
    this.heroName = heroName;
    this.heroPath = PathTypes.Warrior;
    this.maxHealth = 150;
    this.strength = 10;
    this.dexterity = 3;
    this.intelligence = 1;
    this.currentExp = 0;
    this.nextLevelExp = 100;
    this.currentLevel = 1;
    this.equippedArmor = new Armor[3];
    //this.equippedWeapon = ;
  }
  @Override
  protected void levelUp(){
    maxHealth = maxHealth + 30;
    strength = strength + 5;
    dexterity = dexterity + 3;
    intelligence = intelligence + 1;
    currentExp = currentExp - nextLevelExp;
    nextLevelExp = (int) Math.floor(nextLevelExp * 1.1);
    System.out.println("LEVEL UP!");
    currentLevel = currentLevel + 1;
    
  }
}
