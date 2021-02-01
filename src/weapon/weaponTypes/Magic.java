package weapon.weaponTypes;

import weapon.Weapon;
import weapon.weaponTypes.WeaponTypes;

/* The Magic class is a subclass of the Weapon superclass.
   It takes a weapon level its inputs */
public class Magic extends Weapon {
  
  public Magic (int weaponLevel){
    this.weaponLevel = weaponLevel;
    this.weaponName = "Tether Essence";
    this.weaponType = WeaponTypes.Magic;
    this.weaponDamage = 25 + (2*(weaponLevel-1));
  }
  
}