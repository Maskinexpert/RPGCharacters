package weapon.weaponTypes;

import weapon.Weapon;
import weapon.weaponTypes.WeaponFlair;
import weapon.weaponTypes.WeaponTypes;

public class Melee extends Weapon {
  
  public Melee (int weaponLevel){
    this.weaponLevel = weaponLevel;
    this.weaponName = "Melee "; // add flair;
    this.weaponType = WeaponTypes.Melee;
    //TODO give EquipmentSlots a (double) getStatBoon function to calculate item slot boon  
    
    this.weaponDamage = 15 + (2*(weaponLevel-1));
    
  }
  
}