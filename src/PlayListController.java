import java.util.Scanner;

public class PlayListController {
    public static void main(String[] args) {
        PlayList myPlayList = new PlayList();
        boolean quit = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to PlayList");
        while(!quit) {
            System.out.println("Make a selection.");
            System.out.println("" +
                    "1) Add a song\n" +
                    "2) Shuffle songs\n" +
                    "3) Display Songs\n" +
                    "4) Quit");
            int initialChoice = in.nextInt();
            in.nextLine();

            switch (initialChoice) {
                case 1:
                    System.out.println("Enter a song name");
                    String songName = in.nextLine();
                    myPlayList.addToPlayList(songName);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println(myPlayList.toString());
                    break;
                case 4:
                    System.out.println("Thank you for using PlayList");
                    quit = true;
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }
}
