import java.util.ArrayList;

public class QuestionSix {
    public static void main(String[] args) {
        String one = "Apple";
        ArrayList<String> list = new ArrayList<>();
        boolean copy = false;

        for(int i = 0; i < one.length(); i++) {
            list.add(one.substring(i, i+1));
        }

        for(int j = 0; j < list.size(); j++) {
            for(int k = 0; k < list.size(); k++) {
                if(j == k ) {
                    continue;
                }
                if (list.get(k).equals(list.get(j))) {
                    copy = true;
                    break;
                }
            }
        }

        System.out.println(copy);
    }
}
