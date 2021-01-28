package armor.armorTypes;

//EquipmentSlots both descripes the location of a piece of armor and its type
public enum EquipmentSlots {
  Body(0),
  Head(1),
  Legs(2);
  
  public final int slot;
  
  EquipmentSlots(int slot) {
    this.slot = slot;
  }    
  
  public int getSlot() {
    return this.slot;
  }
  
}