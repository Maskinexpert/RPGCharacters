package armor.armorTypes;

import armor.Armor;
import armor.armorTypes.ArmorSlots;

/* The Cloth class is a subclass of the Armor superclass.
   It takes a armor piece level and a location to calculate its inputs */
public class Cloth extends Armor {
  
  public Cloth (int armorLevel, ArmorSlots armorSlot){
    this.armorLevel = armorLevel;
    this.armorName = "Cloth " + armorSlot;
    this.armorSlot = armorSlot;
    /* The slotBoon value is the negative effect an armor piece have depending on its location on the hero.
       It is part of calculating each attribute bones of the armor piece. */
    double slotBoon = ((5.0-armorSlot.getSlot())/5.0);
    this.hpBonus = (int) Math.floor((10 + (5*(armorLevel-1)))*slotBoon);
    this.dexBonus = (int) Math.floor((1 + (1*(armorLevel-1)))*slotBoon);
    this.intBonus = (int) Math.floor((3 + (2*(armorLevel-1)))*slotBoon);
  }
  
}