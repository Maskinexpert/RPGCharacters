package heroes;
import heroes.heroPaths.PathTypes;
import armor.Armor;
import armor.armorTypes.EquipmentSlots;

public abstract class Heroes {
  protected String heroName;
  protected PathTypes heroPath;
  protected int maxHealth, strength, dexterity, intelligence;
  protected int hpBuff, strBuff, dexBuff, intBuff;
  protected int currentExp, nextLvlExp;
  protected int currentLvl;
  protected Armor[] equippedArmor;
  //protected Weapon equippedWeapon;
  

    
  /*public void attack();
    System.out.println(baseDamage + weapon);
  }*/
  
  protected abstract void lvlUp();
  
  public void gainExp(int expAmount){
    currentExp = currentExp + expAmount;
    while(currentExp>=nextLvlExp){
      lvlUp();
    }
  }
  
  public void equipArmor(Armor item){
    if (item.getLvl() <= currentLvl){
      equippedArmor[item.getArmorSlot()] = item;
      hpBuff = strBuff = dexBuff = intBuff = 0;
      for (Armor equipped : equippedArmor) {
        if (equipped != null){
          hpBuff = hpBuff + equipped.getHp();
          strBuff = strBuff + equipped.getStr();
          dexBuff = dexBuff + equipped.getDex();
          intBuff = intBuff + equipped.getInt();
        }
      }
      System.out.println(hpBuff + ", " + strBuff + ", " + dexBuff + ", " + intBuff);
    } else {
      System.out.println("Item too powerful, you need to level up some more");
    }
  }
  
  public void displayEquipment() {
    for (Armor equipped : equippedArmor){
      if (equipped != null){
        System.out.print(equipped.getName() + ", ");
      }
    }
  }
  
  
  public void details(){
    System.out.println(heroName + " details: \nPath: " + heroPath + "\nHp: " + (maxHealth+hpBuff) + 
                       "\nStr: " + (strength + strBuff) + "\nDex: " + (dexterity + dexBuff) + "\nInt: " + (intelligence+intBuff));
  }
  
  /*public String getHeroName(){
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
  }*/

}