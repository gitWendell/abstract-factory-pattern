class Pen implements IProduct {
   String casing;
   String ink;
   
   public Pen setCasing(String casing) {
      this.casing = casing;
      
      return this;
   }
   
   public Pen setInk(String ink) {
      this.ink = ink;
      
      return this;
   }
   
   public void make() {
      System.out.println("Pen casing: " + this.casing);
      System.out.println("Pen ink: " + this.ink);
   }
}