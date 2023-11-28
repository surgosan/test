public class Recursive {
    public static void main(String[] args) {
        String num = "012345";
        recurse(num);
    }

    public static void recurse(String num) {
        if(num.length() == 1) {
            System.out.println(num);
            return;
        }
        System.out.println(num.charAt(num.length()-1));
        String newNum = num.substring(0, num.length()-1);
        recurse(newNum);
    }
}
