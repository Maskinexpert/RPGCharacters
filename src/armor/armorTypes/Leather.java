package armor.armorTypes;

import armor.Armor;
import armor.armorTypes.EquipmentSlots;

public class Leather extends Armor {
  
  public Leather (int armorLevel, EquipmentSlots armorSlot){
    this.armorLevel = armorLevel;
    this.armorName = "Leather " + armorSlot;
    this.armorSlot = armorSlot;
    //TODO give EquipmentSlots a (double) getStatBoon function to calculate item slot boon  
    double slotBoon = ((5.0-armorSlot.getSlot())/5.0);
    this.hpBonus = (int) Math.floor((20 + (8*(armorLevel-1)))*slotBoon);
    this.dexBonus = (int) Math.floor((3 + (2*(armorLevel-1)))*slotBoon);
    this.strBonus = (int) Math.floor((1 + (1*(armorLevel-1)))*slotBoon);
    
  }
  
}