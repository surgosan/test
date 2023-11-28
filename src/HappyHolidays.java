import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HappyHolidays {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        System.out.println("Enter a number");
        int num = in.nextInt();
        in.nextLine();

        String output = "";

        for(int i = 0; i < num; i++) {
            output = String.format("%s%n%s", output, str);
        }

        System.out.println(output);

        try {
            FileWriter out = new FileWriter("labfinal.txt");
            out.write(output);
        } catch (FileNotFoundException e) {
           System.out.println("uh oh");
        }
    }
}
