package armor;
import armor.armorTypes.ArmorSlots;

/* The Armor abstract class is the superclass to each armor type specific class. */
public abstract class Armor{
  
  protected String armorName;
  protected ArmorSlots armorSlot;
  protected int armorLevel;
  protected int hpBonus;
  protected int strBonus;
  protected int dexBonus;
  protected int intBonus;
  
  
  public String getName(){
    return armorName;
  }
  
  
  public int getHp(){
    return hpBonus;
  }
  
  
  public int getStr(){
    return strBonus;
  }
  
  
  public int getDex(){
    return dexBonus;
  }
  
  
  public int getInt(){
    return intBonus;
  }
  
  
  public int getLevel(){
    return armorLevel;
  }
  
  
  public int getSlot(){
    return armorSlot.getSlot();
  }
  
}