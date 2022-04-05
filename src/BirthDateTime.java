import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        int rangeInt = 0;
        String trash = "";
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;

        year = getRangedInt(in, "Enter your year of birth [1950-2010]: ",1950,2010);
        month = getRangedInt(in,"Enter your month of birth [1-12]: ", 1,12);


        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: day = getRangedInt(in,"Enter your day of birth [1-31]: ", 1,31); break;

            case 4:
            case 6:
            case 9:
            case 11: day = getRangedInt(in,"Enter your day of birth [1-30]: ",1,30); break;

            case 2: day = getRangedInt(in,"Enter your day of birth [1-29]: ",1,29); break;

        }
        hours = getRangedInt(in,"Enter your hour of birth [1-24]: ",1,24);
        minutes = getRangedInt(in,"Enter the minute of your birth [1-59]: ", 1,59);

        System.out.println("Your Birthday is: " + month + "/" + day + "/" + year + " at " + hours + ":" + minutes );
    }
    public static int getRangedInt (Scanner pipe, String prompt, int low, int high) {
        boolean done = false;
        int rangeInt = 0;
        String trash = "";

        do {
            System.out.print(prompt);
            if (pipe.hasNextInt())
            {
                rangeInt = pipe.nextInt();
                pipe.nextLine();

                if (rangeInt >= low && rangeInt <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Enter a valid number within the range, not: " + rangeInt);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid number within the range, not: " + trash);
            }
        }while(!done);
        return rangeInt;
    }




}