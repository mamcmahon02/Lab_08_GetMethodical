public class PrettyHeader {

    public static void main(String[] args) {

        prettyHeader("Michael McMahon");

    }

    public static void prettyHeader(String msg) {
        int whiteSpace;

        if (msg.length() < 54) {

            for (int x = 0; x <= 60; x++) {
                System.out.print("*");
            }
            System.out.print("\n");

            System.out.print("***");
            whiteSpace = (26 - (msg.length()) / 2);
            for (int x = 0; x <= whiteSpace; x++) {

                System.out.print(" ");
            }

            System.out.print(msg);

            whiteSpace = (27 - (msg.length()) / 2);
            for (int x = 0; x <= whiteSpace; x++) {

                System.out.print(" ");
            }
            System.out.println("***");

            for (int x = 0; x <= 60; x++) {
                System.out.print("*");
            }

        }
    }
}
