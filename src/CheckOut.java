import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0;
        boolean done = false;
        String trash = "";
        boolean continueYN;
        double totalCost = 0;

        continueYN = getYNConfirm(in, "Do you have more items? [Y/N] ");

        while (continueYN) {
            price = getRangedDouble(in, "What is the price of your item? ", .50, 9.99);
            totalCost += price;
            continueYN = getYNConfirm(in, "Do you have more items? [Y/N] ");
        }
        System.out.println("Your total cost is: " + totalCost);

    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        boolean done = false;
        double rangeDouble = 0;
        String trash = "";

        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble()) {
                rangeDouble = pipe.nextDouble();
                pipe.nextLine();

                if (rangeDouble >= low && rangeDouble <= high) {
                    done = true;
                } else {
                    System.out.println("Enter a valid number within the range, not: " + rangeDouble);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a valid number within the range, not: " + trash);
            }
        } while (!done);
        return rangeDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        System.out.print(prompt);
        String continueYN = pipe.nextLine();

        while (!continueYN.equalsIgnoreCase("y") && !continueYN.equalsIgnoreCase("n")) {

            System.out.println("Invalid response. Select [Y/N].");
            continueYN = pipe.next();
        }
        if (continueYN.equalsIgnoreCase("n")) {
            return false;
        } else {
            return true;
        }
    }
}
