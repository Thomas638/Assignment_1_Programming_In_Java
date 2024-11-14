import java.util.Scanner;

/**
 *
 * This class was not part of the original assignment, the "BillsAndCoins" and "Coins" Classes were to submitted
 * separately. This class was added after the assignment was submitted to allow the classes to be run from a single
 * class.
 *
 */
public class Main {

    public static void main(String[] args) {

        boolean isActive = true;
        int choice;

        while(isActive){

            System.out.println("""
                    Choose one:\s
                     1) Coins only or 2) Bills and coins.\s
                    Enter 1 if you want coins only or 2 for bills and coins""");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            if (choice == 1){
                CoinsOnly();
                isActive = false;
            }
            else {
                BillsAndCoins();
                isActive = false;
            }
        }

    }


    private static void CoinsOnly(){
        Coins change = new Coins();
        change.show();
    }

    private static void BillsAndCoins(){
        BillsAndCoins change = new BillsAndCoins();
        change.show();
    }
}
