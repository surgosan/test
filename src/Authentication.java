import java.util.Random;
import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        String[] usernames = {"One", "Two", "Three"};
        boolean firstAuthentication = false;
        String[] passwords = {"pass1", "pass2", "pass3"};
        int usernameIndex = -1;
        int passwordIndex = -1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = in.nextLine();
        System.out.println("Enter your password");
        String password = in.nextLine();

        if(checkLogin(usernames, username) == -1 || checkLogin(passwords, password) == -1) {
            wrong();
        } else {
            firstAuthentication = true;
        }

        int randomNumber = generate_number();
        if(firstAuthentication) {
            System.out.printf("Please enter the following number: %d%n", randomNumber);
            int inNum = in.nextInt();
            in.nextLine();
            if(randomNumber == inNum) {
                System.out.println("Congratulations, you're logged in!");
            } else {
                System.out.println("Sorry, your input was invalid");
            }
        }
    }

    public static int checkLogin(String[] arr, String line) {
        int out = -1;
        if(arr.length > 3) {
            return -1;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(line)) {
                out = i;
                break;
            }
        }
        return out;
    }

    public static int generate_number() {
        Random r = new Random();
        return r.nextInt(9);
    }

    public static void wrong() {
        System.out.println("Sorry, your username and/or password is incorrect");
    }
}
