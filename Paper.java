class Paper implements IProduct{
   String color;
   String size;
   
   public Paper setColor(String color) {
      this.color = color;
      
      return this;
   }
   
   public Paper setSize(String size) {
      this.size = size;
      
      return this;
   }
   
   public void make() {
      System.out.println("Paper color: " + this.color);
      System.out.println("Paper size: " + this.size);
   }
}