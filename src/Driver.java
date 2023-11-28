import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Motorcycle bike;
        Scanner in = new Scanner(System.in);
        System.out.println("[Create Your Motorcycle]");
        System.out.println("Would you input all the values now? 0 or 1");
        int scratchInt = in.nextInt();
        boolean scratch = false;
        if (scratchInt == 1) {scratch = true;};
        in.nextLine();

//        Instructions never make use of get/set methods
        if(!scratch) {
            bike = new Motorcycle();
            bike.displayMotorcycle();
        } else {
            System.out.println("Give your motorcycle an ID");
            int id = in.nextInt();
            in.nextLine();

            int engineSize = -1;
            boolean correctEngineSize = false;
            while(!correctEngineSize) {
                System.out.println("Give your motorcycle an engine size");
                engineSize = in.nextInt();
                in.nextLine();
                if(engineSize == 50 || engineSize == 100 || engineSize == 150) {
                    correctEngineSize = true;
                } else {
                    System.out.println("Invalid Engine Size (50, 100, 150)");
                }
            }

            System.out.println("Does your motorcycle have a spoiler? 0 or 1");
            int hasSpoilerInt = in.nextInt();
            boolean hasSpoiler = false;
            if(hasSpoilerInt == 1) {hasSpoiler = true;}
            in.nextLine();

            bike = new Motorcycle(id, engineSize, hasSpoiler);

            bike.displayMotorcycle();
        }
    }
}
