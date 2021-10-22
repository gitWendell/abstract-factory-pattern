class SupplierOne implements SchoolSupplyFactory {
   String name;
   
   public SupplierOne() {
      this.name = "Supplier One";
   }
   
   public void name() {
      System.out.println("Supplier: " + this.name);
   }
   
   @Override
   public void ballpen() {
      Pen pen = new Pen();
      
      pen.setCasing("Comodo Casing").setInk("Black Ink").make();
   }
   
   @Override
   public void paper() {
      Paper paper = new Paper();
      
      paper.setColor("Yellow").setSize("12 cm").make();
   }
}