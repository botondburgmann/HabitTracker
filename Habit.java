import java.util.ArrayList;

public class Habit {
    private String name;
    private ArrayList<Integer> records;

    public Habit(String name) {
        this.name = name;
        this.records = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> showRecords() {
        return records;
    }

    public void addToRecords(int time) {
        records.add(time);
    }

}
