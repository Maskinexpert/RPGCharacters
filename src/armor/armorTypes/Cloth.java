package armor.armorTypes;

import armor.Armor;
import armor.armorTypes.EquipmentSlots;

public class Cloth extends Armor {
  
  public Cloth (int armorLevel, EquipmentSlots armorSlot){
    this.armorLevel = armorLevel;
    this.armorName = "Cloth " + armorSlot;
    this.armorSlot = armorSlot;
    //TODO give EquipmentSlots a (double) getStatBoon function to calculate item slot boon  
    double slotBoon = ((5.0-armorSlot.getSlot())/5.0);
    this.hpBonus = (int) Math.floor((10 + (5*(armorLevel-1)))*slotBoon);
    this.dexBonus = (int) Math.floor((1 + (1*(armorLevel-1)))*slotBoon);
    this.intBonus = (int) Math.floor((3 + (2*(armorLevel-1)))*slotBoon);
    
  }
  
}