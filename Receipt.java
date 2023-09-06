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
         System.out.println("****************************************");
         do{
            System.out.println("How many apples would you like? ($1.50 each, limit: 6) ");
            apple = scan.nextInt();
         }
         while (apple > 6);
         do {
         System.out.println("How many bananas would you like? ($0.75 each, limit: 9)");
         banana = scan.nextInt();
         }
         while (banana > 9);
         
         do {
            System.out.println("How many pears would you like? ($1.00 each, limit: 9)");
            pear = scan.nextInt();
         }
         while (pear > 9);
         do{
         System.out.println("How many oranges would you like? ($1.25 each, limit: 7)");
         orange = scan.nextInt();
         }
         while (orange > 7);

         System.out.println("Thank you for your purchase!");
         //end = scan.nextLine();
         System.out.println("****************************************");
         System.out.println(apple + " Apple(s)" + "            $1.50 each" + " $" + String.format("%.2f",(apple*1.5)));
         System.out.println(banana + " Banana(s)" + "           $0.75 each" + " $" + String.format("%.2f", (banana*0.75)));
         System.out.println(pear + " Pear(s)" + "             $1.00 each" + " $" + String.format("%.2f", (pear*1.00)));
         System.out.println(orange + " Orange(s)" + "           $1.25 each" + " $" + String.format("%.2f", (orange*1.25)));

         //printing receipt
         System.out.println("****************************************");
    }

}