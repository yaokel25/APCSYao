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
         System.out.println("How many oranges would you like? ($1.00 each)");
         orange = scan.nextInt();
         System.out.println("Are you finished with you purchase?");
         end = scan.nextLine();

         System.out.println("****************************************");
         System.out.println(apple + "Apple(s)" + "                   $1.50 each" + "$"apple*1.5);

        
    }

}