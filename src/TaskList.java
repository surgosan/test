import java.util.ArrayList;

public class TaskList {
    private final ArrayList<String> list;

    public TaskList() {
        list = new ArrayList<>();
    }

    public void addTask(String str) {
        list.add(str);
    }

    public String getNextTask() {
        //first come first serve
        if(list.isEmpty()) {
            System.out.println("Nothing to do");
            return null;
        } else {
            return list.remove(0);
        }
    }

}
