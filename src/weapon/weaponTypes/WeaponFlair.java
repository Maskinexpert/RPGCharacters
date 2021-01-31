package weapon.weaponTypes;

public enum WeaponFlair {
  Melee(0),
  Ranged(1),
  Magic(2);
  
  public final int weaponFlair;
  
  WeaponFlair(int weaponFlair) {
    this.weaponFlair = weaponFlair;
  }    
  
  public int getWeaponFlair() {
    return this.weaponFlair;
  }

}