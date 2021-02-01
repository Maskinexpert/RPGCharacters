package armor.armorTypes;

/* ArmorSlots both descripes the location of a piece of armor and its type */
public enum ArmorSlots {
  
  /* Each enum is a location for an armor piece, and the value associated is the location in the Heroes armor array. */
  Body(0),
  Head(1),
  Legs(2);
  
  
  private final int slot;
  
  
  ArmorSlots(int slot) {
    this.slot = slot;
  }    
  
  
  public int getSlot() {
    return this.slot;
  }
  
}