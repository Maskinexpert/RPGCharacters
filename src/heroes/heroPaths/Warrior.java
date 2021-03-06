package heroes.heroPaths;
import heroes.Heroes;
import heroes.heroPaths.PathTypes;
import armor.Armor;


/* The Warrior class is a subclass of the Heroes superclass. It takes a name is input.
   The Warrior type hero is mainly focused on melee combat and the strength attribute. */
public class Warrior extends Heroes {
  
  /* Initializing a Warrior object with the attribute values for a Warrior Hero. */
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
  }
  
  /* The levelUp abstract method is overwritten, 
     so it can contain attribute changes specific to the Warrior class. */
  @Override
  protected void levelUp(){
    maxHealth = maxHealth + 30;
    strength = strength + 5;
    dexterity = dexterity + 3;
    intelligence = intelligence + 1;
    currentExp = currentExp - nextLevelExp;
    /* The value is floor'ed and cast into an int since the nextLevelExp value can only be a whole number. */
    nextLevelExp = (int) Math.floor(nextLevelExp * 1.1);
    currentLevel = currentLevel + 1;
  }
  
}
