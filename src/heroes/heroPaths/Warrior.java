package heroes.heroPaths;
import heroes.Heroes;
import heroes.heroPaths.PathTypes;

public class Warrior extends Heroes {
  
  public Warrior (String heroName){
    this.heroName = heroName;
    this.heroPath = PathTypes.Warrior;
    this.maxHealth   = 150;
    this.strength = 10;
    this.dexterity = 3;
    this.intelligence = 1;
    this.currentExp = 0;
    this.nextLvlExp = 100;
  }
  @Override
  public void lvlUp(){
    maxHealth = maxHealth + 30;
    strength = strength + 5;
    dexterity = dexterity + 3;
    intelligence = intelligence + 1;
    nextLvlExp = (int) Math.floor(nextLvlExp * 1.1);
    System.out.println("LEVEL UP!");
    currentExp = 0;
  }
}
