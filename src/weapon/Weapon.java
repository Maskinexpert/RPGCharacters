package weapon;

import weapon.weaponTypes.WeaponTypes;

/* The Weapon abstract class is the superclass to each weapon type specific class. */
public abstract class Weapon{
  
  protected String weaponName;
  protected WeaponTypes weaponType;
  protected int weaponLevel;
  protected int weaponDamage;
  
  
  public String getName(){
    return weaponName;
  }
  
  
  public WeaponTypes getType(){
    return weaponType;
  }
  
  
  public int getDamage(){
    return weaponDamage;
  }
  
  
  public int getLevel(){
    return weaponLevel;
  }
  
}