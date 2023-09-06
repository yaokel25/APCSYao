//Receipt.java
import java.util.Scanner;
public class Receipt{
    public static void main(String[] args) {
        //declare variables 
         int apple;
         int banana;
         int pear;
         int orange;
         String end;

         Scanner scan = new Scanner(System.in);
         System.out.println("Welcome to the store! We sell apples, bananas, pears, and oranges.");
         
         //prompt for number of objects
         System.out.println("How many apples would you like? ($1.50 each) ");
         apple = scan.nextInt(); 
         System.out.println("How many bananas would you like? ($0.75 each)");
         banana = scan.nextInt();
         System.out.println("How many pears would you like? ($1.00 each)");
         pear = scan.nextInt();
         System.out.println("How many oranges would you like? ($1.25 each)");
         orange = scan.nextInt();
         System.out.println("Thank you for your purchase!");
         //end = scan.nextLine();
         System.out.println("****************************************");
         System.out.println(apple + " Apple(s)" + "            $1.50 each" + " $" + String.format("%.2f",(apple*1.5));
         System.out.println(banana + " Banana(s)" + "           $0.75 each" + " $" + (banana*0.75));
         System.out.println(pear + " Pear(s)" + "             $1.00 each" + " $" + (pear*1.00));
         System.out.println(orange + " Orange(s)" + "           $1.25 each" + " $" + (orange*1.25));

         //printing receipt
         System.out.println("****************************************");
         double price = apple*1.5;
         /*if (apple != 0) {
            System.out.println(apple + " Apple(s)" + "            $1.50 each" + " $" + price);
         }
         if (banana != 0) {
            System.out.println(banana + " Banana(s)" + "           $0.75 each" + " $" + (banana*0.75));
         }
         if (pear != 0) {
            System.out.println(pear + " Pear(s)" + "             $1.00 each" + " $" + (pear*1.00));
        }
         if (orange != 0) {
            System.out.println(orange + " Orange(s)" + "           $1.25 each" + " $" + (orange*1.25));
         }*/


        
    }

}