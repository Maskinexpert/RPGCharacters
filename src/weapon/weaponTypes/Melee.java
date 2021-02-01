package weapon.weaponTypes;

import weapon.Weapon;
import weapon.weaponTypes.WeaponTypes;

/* The Melee class is a subclass of the Weapon superclass.
   It takes a weapon level its inputs */
public class Melee extends Weapon {
  
  public Melee (int weaponLevel){
    this.weaponLevel = weaponLevel;
    this.weaponName = "Flaming Axe of Toasting";
    this.weaponType = WeaponTypes.Melee;
    this.weaponDamage = 15 + (2*(weaponLevel-1));
  }
  
}