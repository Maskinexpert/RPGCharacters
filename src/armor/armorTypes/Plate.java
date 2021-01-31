package armor.armorTypes;

import armor.Armor;
import armor.armorTypes.EquipmentSlots;

public class Plate extends Armor {
  
  public Plate (int armorLevel, EquipmentSlots armorSlot){
    this.armorLevel = armorLevel;
    this.armorName = "Plate " + armorSlot;
    this.armorSlot = armorSlot;
    //TODO give EquipmentSlots a (double) getStatBoon function to calculate item slot boon  
    double slotBoon = ((5.0-armorSlot.getSlot())/5.0);
    this.hpBonus = (int) Math.floor((30 + (12*(armorLevel-1)))*slotBoon);
    this.dexBonus = (int) Math.floor((1 + (1*(armorLevel-1)))*slotBoon);
    this.strBonus = (int) Math.floor((3 + (2*(armorLevel-1)))*slotBoon);
    
  }
  
}