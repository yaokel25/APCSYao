//Receipt.java
import java.util.Scanner;
public class Receipt{
    public static void main(String[] args) {
        //declare variables 
         int apple;
         int banana;
         int pear;
         int orange;

         Scanner scan = new Scanner(System.in);
         System.out.println("Welcome to the store! We sell apples, bananas, pears, and oranges.");
         
         System.out.println("How many apples would you like? ($1.50 each) ");
         apple = scan.nextInt(); 
         System.out.println("How many bananas would you like? ($0.75 each)");
         banana = scan.nextInt();

        
    }

}