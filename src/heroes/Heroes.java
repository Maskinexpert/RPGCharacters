package heroes;
import heroes.heroPaths.PathTypes;

public abstract class Heroes {
  protected String heroName;
  protected PathTypes heroPath;
  protected int maxHealth, strength, dexterity, intelligence;
  protected int currentExp, nextLvlExp;
  protected int armor, baseDamage; 
    
  /*public void attack();
    System.out.println(baseDamage + weapon);
  }*/
  
  public abstract void lvlUp();
  
  public void gainExp(int expAmount){
    currentExp = currentExp + expAmount;
    while(currentExp>=nextLvlExp){
      lvlUp();
    }
  }
  public void details(){
    System.out.println(heroName + " details: \nPath: " + heroPath + "\nHp: " + maxHealth + 
                       "\nStr: " + strength + "\nDex: " + dexterity + "\nInt: " + intelligence);
  }
  
  public String getHeroName(){
    return heroName;
  }
  public int getMaxHealth(){
    return maxHealth;
  }
  public int getStrength(){
    return strength;
  }
  public int getDexterity(){
    return dexterity;
  }
  public int getIntelligence(){
    return intelligence;
  }
  public int getCurrentExp(){
    return currentExp;
  }
  public int getNextLvlUp(){
    return nextLvlExp;
  }

}