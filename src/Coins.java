import java.util.Scanner;

/**
 *This program will calculate the change due to a customer and then show what
 * coins are to be used to give the customer the correct change.
 *
 * @author Thomas Carroll
 */

class Coins {
    void show(){

        // *** Variables ***
        int quarters, dimes, nickels, pennies, total, changeDue;

        // *** Input ***
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount due (Less than $1): ");
        total = input.nextInt();


        // *** Processing ***
        changeDue = 100 - total;
        quarters = changeDue / 25;
        changeDue = changeDue % 25;
        dimes = changeDue / 10;
        changeDue = changeDue % 10;
        nickels = changeDue / 5;
        changeDue = changeDue % 5;
        pennies = changeDue;


        // *** Output ***
        System.out.println("Use the following coins to give the proper change:");
        System.out.println(+ quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }

//    public class Assign1A_ThomasCarroll {
//
//        /**
//         * @param args the command line arguments
//         */
//
//        public static void main(String[] args) {
//
//            Coins change = new Coins();
//            change.show();
//
//        }
//    }
}
