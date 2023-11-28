import java.util.Scanner;

public class Award_Template {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Award Creator");
        String name = "";
        boolean namePassed = false;
        while(!namePassed) {
            System.out.println("Enter the recipient name");
            name = in.nextLine();
            if(lengthVerify(name)) {
                namePassed = true;
            } else {
                System.out.println(tooLong());
            }
        }

        boolean eventPassed = false;
        String event = "";
        while(!eventPassed) {
            System.out.println("Enter the event name");
            event = in.nextLine();
            if(lengthVerify(event)) {
                eventPassed = true;
            } else {
                System.out.println(tooLong());
            }
        }

        boolean awardPassed = false;
        String award = "";
        while(!awardPassed) {
            System.out.println("Enter what they won.");
            award = in.nextLine();
            if(lengthVerify(award)) {
                awardPassed = true;
            } else {
                System.out.println(tooLong());
            }
        }

        String A = "/======================\\\n" +
                "|                      |\n" +
                "|    ";
        String B = "    |\n" +
                "|         won          |\n" +
                "|     ";
        String C = "      |\n" +
                "| ";
        String D = "  |\n" +
                "|                      |\n" +
                "\\======================/";

        String out = String.format("%s%s%s%s%s%s%s",
                A,name,B,award,C,event,D);

        System.out.println(out);
    }

    public static boolean lengthVerify(String input) {
        return input.length() <= 20;
    }

    public static String tooLong() {
        return "Sorry, that's too long. Input must be 20 characters or less";
    }
}
