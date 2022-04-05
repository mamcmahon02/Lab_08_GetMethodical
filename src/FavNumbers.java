import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean done = false;
        int inputInt = 0;
        double inputDouble = 0;
        String trash = "";


        inputInt = getInt(in, "Please enter your favorite integer: ");
        inputDouble = getDouble(in, "Please enter your favorite double: ");
        System.out.println("Your favorite integer is: " + inputInt + " and favorite double is: " + inputDouble);
    }
    public static int getInt (Scanner pipe, String prompt)
    {
        boolean done = false;
        int inputInt = 0;
        String trash = "";

        do {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                inputInt = pipe.nextInt();

                pipe.nextLine();
                done = true;
            } else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not: " + trash);
            }
        }while(!done);

        return inputInt;
    }
    public static double getDouble (Scanner pipe, String prompt)
    {
        boolean done = false;
        double inputDouble = 0;
        String trash = "";

        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble()) {
                inputDouble = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid double not: " + trash);
            }
        }while(!done);

        return inputDouble;
    }
}