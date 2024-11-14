import java.util.Scanner;

/**
 *This program will calculate the change due to a customer and then show what
 * coins and bills are to be used to give the customer the correct change.
 *
 * @author Thomas Carroll
 */

@SuppressWarnings("SpellCheckingInspection") // Java didn't like the spelling of "Toonies"
class BillsAndCoins {
    void show() {

        // *** Variables ***
        double twenties, tenners, fivers, toonies, loonies, quarters, dimes, nickels, pennies, total, changeDue;

        // *** Input ***
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount due: ");
        total = input.nextDouble();

        // *** Processing ***
        changeDue = 100 - total;
        twenties = changeDue / 20;
        changeDue = changeDue % 20;
        tenners = changeDue / 10;
        changeDue = changeDue % 10;
        fivers = changeDue / 5;
        changeDue = changeDue % 5;
        toonies = changeDue / 2;
        changeDue = changeDue % 2;
        loonies = changeDue;
        quarters = changeDue / 25;
        changeDue = changeDue % 25;
        dimes = changeDue / 10;
        changeDue = changeDue % 10;
        nickels = changeDue / 5;
        changeDue = changeDue % 5;
        pennies = changeDue;

        // *** Output ***
        System.out.println("Use the following coins and bills to give the proper change:");
        System.out.println(twenties + " Twenties");
        System.out.println(tenners + " Tens");
        System.out.println(fivers + " Fives");
        System.out.println(toonies + " Toonies");
        System.out.println(loonies + " Loonies");
        System.out.println(quarters + " Quarters");
        System.out.println(dimes + " Dimes");
        System.out.println(nickels + " Nickels");
        System.out.println(pennies + " Pennies");

    }

//public class Assign1B_ThomasCarroll {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//
//        BillsAndCoins change = new BillsAndCoins();
//        change.show();
//
//    }
}