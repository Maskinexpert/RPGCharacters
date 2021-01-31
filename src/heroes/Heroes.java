package heroes;
import heroes.heroPaths.PathTypes;
import armor.Armor;
import armor.armorTypes.EquipmentSlots;
import weapon.Weapon;
import weapon.weaponTypes.*;


public abstract class Heroes {
  protected String heroName;
  protected PathTypes heroPath;
  protected int maxHealth, strength, dexterity, intelligence;
  protected int hpBuff, strBuff, dexBuff, intBuff;
  protected int currentExp, nextLevelExp;
  protected int currentLevel;
  protected Armor[] equippedArmor;
  protected Weapon equippedWeapon;
  

    
  protected abstract void levelUp();
  
  public void gainExp(int expAmount){
    currentExp = currentExp + expAmount;
    while(currentExp>=nextLevelExp){
      levelUp();
    }
  }
  
  public void equipArmor(Armor item){
    if (item.getLevel() <= currentLevel){
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
    } else {
      System.out.println("Armor too powerful, you need to level up some more");
    }
  }
  
  public void equipWeapon(Weapon weapon){
    if (weapon.getLevel() <= currentLevel){
      equippedWeapon = weapon;
    } else {
      System.out.println("Not worthy yet, level up to wield this weapon");
    }
  }
  
  public void attack(){
    String output;
    if (equippedWeapon != null){
      output = switch (equippedWeapon.getType()) {
        case Melee -> "The " + equippedWeapon.getName() + " strikes your foe for " + (equippedWeapon.getDamage() + (int)Math.floor((strength + strBuff)*1.5)) + " damage.\n(Brutal!)";
        case Ranged -> "The " + equippedWeapon.getName() + " snipes your foe for " + (equippedWeapon.getDamage() + ((dexterity + dexBuff)*2)) + " damage.\n(Radicool!)";
        case Magic -> "The " + equippedWeapon.getName() + " breaks your foe for " + (equippedWeapon.getDamage() + ((intelligence + intBuff)*3)) + " damage.\n(Wicked!)";
      };
    } else {
      output = "You punch your foe for an incredible " + (int)Math.floor((strength + strBuff)*1.5) + " damage.\n(and break your hand)";
    }
    System.out.println(output);
  }
  
  
  public void displayEquipment() {
    System.out.println("Armor equipped:");
    for (Armor equipped : equippedArmor){
      if (equipped != null){
        System.out.print(equipped.getName() + ", ");
      }
    }
    System.out.println("\nWeapon equipped:");
    if (equippedWeapon != null){
      System.out.println(equippedWeapon.getName() + "\nWeapon Type: " + equippedWeapon.getType() + "\nWeapon Level: " + equippedWeapon.getLevel() + "\nDamage: " + equippedWeapon.getDamage());
    } else {
      System.out.println("Fists of slapping\nWeapon Type: Melee\nWeapon Level: Dunno, like 1 or maybe 2 if you do a lot of climbing\nDamage: " + (int)Math.floor((strength + strBuff)*1.5));
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