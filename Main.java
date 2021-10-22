import java.io.*;

class Main {

   public static void main(String[] args) {
      SupplierOne suppOnePen = new SupplierOne();
      SupplierTwo suppTwoPen = new SupplierTwo();
      
      System.out.println("First");
      suppOnePen.name();
      suppOnePen.ballpen();
      suppOnePen.paper();
      
      System.out.println("Second");
      suppTwoPen.name();
      suppTwoPen.ballpen();
      suppTwoPen.paper();
   }
}