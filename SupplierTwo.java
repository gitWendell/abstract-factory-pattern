class SupplierTwo implements SchoolSupplyFactory {
   String name;
   
   public SupplierTwo() {
      this.name = "Supplier Two";
   }
   
   public void name() {
      System.out.println("Supplier: " + this.name);
   }
   
   @Override
   public void ballpen() {
      Pen pen = new Pen();
      
      pen.setCasing("Army Casing").setInk("Red/Yellow/green Ink").make();
   }
   
   @Override
   public void paper() {
      Paper paper = new Paper();
      
      paper.setColor("White").setSize("9.8 cm").make();
   }
}