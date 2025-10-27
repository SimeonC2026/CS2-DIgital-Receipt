public class Main {

   public static void main(String []args) {
      System.out.println("Simeon's Digital RECEIPT");
      
      // CODE FOR PART B STARTS HERE
      String highSchoolName = "Birch Wathen Lenox School";
      double drinkPrice = 1.50;
      double candyPrice = 1.25;
      double HotDogPrice = 2.75;
      double HamburgerPrice = 3.50;
      int OrderNumber = 4;
      int drinkOrdered = 7;
      int candyOrdered = 3;
      int hotdogOrdered = 5;
      int hamburgerOrdered = 2;
      double taxRate = 0.08;
      double subtotal = drinkPrice * quantityDrink + 
      double totalTax = subtotal * taxRate;
      double total = subtotal + totalTax;
      // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice + "        *");                      
     System.out.println("*     Candy ..........$" + candyPrice + "         *");     
     System.out.println("*     Hot Dog ........$" + HotDogPrice + "        *");     
     System.out.println("*     Hamburger ......$" + HamburgerPrice + "        *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
   }
}
