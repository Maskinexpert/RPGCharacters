package heroes.heroPaths;
import heroes.Heroes;
import heroes.heroPaths.PathTypes;
import armor.Armor;


/* The Ranger class is a subclass of the Heroes superclass. It takes a name is input.
   The Ranger type hero is mainly focused on ranged combat and the dexterity attribute. */
public class Ranger extends Heroes {
  
  /* Initializing a Ranger object with the attribute values for a Ranger Hero. */
  public Ranger (String heroName){
    this.heroName = heroName;
    this.heroPath = PathTypes.Ranger;
    this.maxHealth = 120;
    this.strength = 5;
    this.dexterity = 10;
    this.intelligence = 2;
    this.currentExp = 0;
    this.nextLevelExp = 100;
    this.currentLevel = 1;
    this.equippedArmor = new Armor[3];
  }
  
  /* The levelUp abstract method is overwritten, 
     so it can contain attribute changes specific to the Ranger class. */
  @Override
  protected void levelUp(){
    maxHealth = maxHealth + 20;
    strength = strength + 2;
    dexterity = dexterity + 5;
    intelligence = intelligence + 1;
    currentExp = currentExp - nextLevelExp;
    /* The value is floor'ed and cast into an int since the nextLevelExp value can only be a whole number. */
    nextLevelExp = (int) Math.floor(nextLevelExp * 1.1);
    currentLevel = currentLevel + 1;
  }
  
}
