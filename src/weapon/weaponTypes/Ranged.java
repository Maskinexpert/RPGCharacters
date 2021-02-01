package weapon.weaponTypes;

import weapon.Weapon;
import weapon.weaponTypes.WeaponTypes;

/* The Ranged class is a subclass of the Weapon superclass.
   It takes a weapon level its inputs */
public class Ranged extends Weapon {
  
  public Ranged (int weaponLevel){
    this.weaponLevel = weaponLevel;
    this.weaponName = "Jelly Bow of Sturdiness";
    this.weaponType = WeaponTypes.Ranged;
    this.weaponDamage = 5 + (3*(weaponLevel-1));
  }
  
}