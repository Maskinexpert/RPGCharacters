package heroes.heroPaths;
import heroes.Heroes;
import heroes.heroPaths.PathTypes;
import armor.Armor;


/* The Mage class is a subclass of the Heroes superclass. It takes a name is input.
   The Mage type hero is mainly focused on magic combat and the intelligence attribute. */
public class Mage extends Heroes {
  
  /* Initializing a Mage object with the attribute values for a Mage Hero. */
  public Mage (String heroName){
    this.heroName = heroName;
    this.heroPath = PathTypes.Mage;
    this.maxHealth = 100;
    this.strength = 2;
    this.dexterity = 3;
    this.intelligence = 10;
    this.currentExp = 0;
    this.nextLevelExp = 100;
    this.currentLevel = 1;
    this.equippedArmor = new Armor[3];
  }
  
  /* The levelUp abstract method is overwritten, 
     so it can contain attribute changes specific to the Mage class. */
  @Override
  protected void levelUp(){
    maxHealth = maxHealth + 15;
    strength = strength + 1;
    dexterity = dexterity + 2;
    intelligence = intelligence + 5;
    currentExp = currentExp - nextLevelExp;
    /* The value is floor'ed and cast into an int since the nextLevelExp value can only be a whole number. */
    nextLevelExp = (int) Math.floor(nextLevelExp * 1.1);
    currentLevel = currentLevel + 1;
  }
  
}
