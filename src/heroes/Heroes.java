package heroes;
import heroes.heroPaths.PathTypes;
import armor.Armor;
import armor.armorTypes.ArmorSlots;
import weapon.Weapon;

/* The Heroes abstract class is the superclass to each hero path specific class. */
public abstract class Heroes {
  
  protected String heroName;
  protected PathTypes heroPath;
  protected int maxHealth, strength, dexterity, intelligence;
  protected int hpBuff, strBuff, dexBuff, intBuff;
  protected int currentExp, nextLevelExp;
  protected int currentLevel;
  protected Armor[] equippedArmor;
  protected Weapon equippedWeapon;
  
  /* The levelUp abstract method get triggered by the gainExp method when a certain threshold is met.
     The method has different values based on the class and is therefore defined in each subclass.
     The method is also protected since the only way to level up should be when the threshold is reached. */
  protected abstract void levelUp();

  /* The gainExp method is a way to give the Hero exp which triggers a level up. 
     In a functional game would the Hero not directly gain a level but exp by doing tasks/actions. */
  public void gainExp(int expAmount){
    currentExp = currentExp + expAmount;
    while(currentExp>=nextLevelExp){
      levelUp();
    }
  }

  /* The equipArmor method is how an armor piece is equipped by the Hero if they are a high enough level.
     It places the armor piece in its location, overwriting any existing armor piece, 
     and updates the buff to each hero attribute based on any equipped armor piece. */
  public void equipArmor(Armor item){
    if (item.getLevel() <= currentLevel){
      equippedArmor[item.getSlot()] = item;
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

  /* The equipWeapon method is how a weapon is equipped by the Hero is they are a high enough level.
     It places the weapon in the weapon slot, overwriting the existing weapon. */
  public void equipWeapon(Weapon weapon){
    if (weapon.getLevel() <= currentLevel){
      equippedWeapon = weapon;
    } else {
      System.out.println("Not worthy yet, level up to wield this weapon");
    }
  }

  /* The attack method is how the final attack damage is calculated by adding the base weapon damage to the attribute bonus.
     In a full implementation this would also have a value subtracted from a foe.
     If no weapon has been equipped yet will the character attack with their fists; the damage is calculated is a strength weapon. */
  public void attack(){
    String output;
    if (equippedWeapon != null){
      output = switch (equippedWeapon.getType()) {
        case Melee -> "The level " + equippedWeapon.getLevel() + " \"" + equippedWeapon.getName() + "\" strikes your foe for " 
                                   + (equippedWeapon.getDamage() + (int)Math.floor((strength + strBuff)*1.5)) + " damage.\n(Brutal!)";
        case Ranged -> "The level " + equippedWeapon.getLevel() + " \"" + equippedWeapon.getName() + "\" snipes your foe for " 
                                    + (equippedWeapon.getDamage() + ((dexterity + dexBuff)*2)) + " damage.\n(Radicool!)";
        case Magic -> "The level " + equippedWeapon.getLevel() + " \"" + equippedWeapon.getName() + "\" breaks your foe for " 
                                   + (equippedWeapon.getDamage() + ((intelligence + intBuff)*3)) + " damage.\n(Wicked!)";
      };
    } else {
      output = "You punch your foe for an incredible " + (int)Math.floor((strength + strBuff)*1.5) + " damage.\n(and break your hand)";
    }
    System.out.println(output);
  }
  
  /* The displayEquipment method is for taking each equipped equipment piece and displaying each attribute.
     If the Hero has a weapon equipped then its attributes will be displayed, otherwise it is the Hero's fists which is the weapon. */
  public void displayEquipment() {
    System.out.println("Armor equipped:");
    for (Armor equipped : equippedArmor){
      if (equipped != null){
        System.out.println(equipped.getName() + "\nArmor Level: " + equipped.getLevel() + "\nBonus Hp: " + equipped.getHp() + "\nBonus Str: " + equipped.getStr() + "\nBonus Dex: " + equipped.getDex() + "\nBonus Int: " + equipped.getInt() + "\n");
      }
    }
    System.out.println("Weapon equipped:");
    if (equippedWeapon != null){
      System.out.println(equippedWeapon.getName() + "\nWeapon Type: " + equippedWeapon.getType() + "\nWeapon Level: " + equippedWeapon.getLevel() + "\nDamage: " + equippedWeapon.getDamage() + "\n");
    } else {
      System.out.println("Fists of slapping\nWeapon Type: Melee\nWeapon Level: Dunno, like 1 or maybe 2 if you do a lot of climbing\nDamage: " + (int)Math.floor((strength + strBuff)*1.5));
    }
  }
  
  /* The details method is for displaying the Heros attributes with (if any) armor buffs added */
  public void details(){
    System.out.println(heroName + " details: \nPath: " + heroPath + "\nHp: " + (maxHealth+hpBuff) + 
                       "\nStr: " + (strength + strBuff) + "\nDex: " + (dexterity + dexBuff) + "\nInt: " + (intelligence+intBuff) + "\n");
  }


}