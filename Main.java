import java.util.Scanner;
public class Main {

   public static void main(String []args) {
      System.out.println("Simeon's Digital RECEIPT");
      
      // CODE FOR PART B STARTS HERE
      String highSchoolName = "Birch Wathen Lenox School";
      double drinkPrice = 1.50;
      double candyPrice = 1.25;
      double HotDogPrice = 2.75;
      double HamburgerPrice = 3.50;
      int OrderNumber = (int) (Math.random()*10);
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the drink quantity: ");
      String drinkQuantity = input.nextLine();
      int drinkOrdered = (int) (Math.random()*10);
      System.out.print("Enter the candy quantity: ");
      String candyQuantity = input.nextLine();
      int candyOrdered = (int) (Math.random()*10);
      System.out.print("Enter the hot dog quantity: ");
      String hotdogQuantity = input.nextLine();
      int hotdogOrdered = (int) (Math.random()*10);
      System.out.print("Enter the hamburger quantity: ");
      String hamburgerQuantity = input.nextLine();
      int hamburgerOrdered = (int) (Math.random()*10);
      double taxRate = 0.08;
      double subtotal = drinkPrice * drinkOrdered + candyPrice * candyOrdered + HotDogPrice * hotdogOrdered + HamburgerPrice * hamburgerOrdered;
      double totalTax = subtotal * taxRate;
      double total = subtotal + totalTax;
      // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice +" " + drinkOrdered + "        *");                      
     System.out.println("*     Candy ..........$" + candyPrice +" " + candyOrdered + "         *");     
     System.out.println("*     Hot Dog ........$" + HotDogPrice +" " + hotdogOrdered + "        *");     
     System.out.println("*     Hamburger ......$" + HamburgerPrice +" " + hamburgerOrdered + "        *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
     System.out.println(total);
   }
}
