import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        String retVal = "";
        String social = "";
        String mNumber = "";
        String menuChoice = "";


        social = getRegExString(in, "Please enter your SSN as: xxx-xx-xxxx ","\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + social);

        mNumber = getRegExString(in, "Please enter your UC student M number as: Mxxxxxxxx ","(M|m)\\d{8}");
        System.out.println("Your Mnumber is: " + mNumber);

        menuChoice = getRegExString(in, "Please select your menu choice: O)pen S)ave V)iew Q)uit. ", "[OoSsVvQq]");
        System.out.println("Your menu choice is: " + menuChoice);




    }
    public static String getRegExString (Scanner pipe, String prompt, String regEx) {
        boolean done = false;
        String trash = "";
        String retVal = "";

        do {

            System.out.print(prompt);
            retVal = pipe.nextLine();
            if (retVal.matches(regEx)) {
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a matching pattern.");
            }
        } while (!done);
        return retVal;

    }


}