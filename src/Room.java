import java.util.ArrayList;

public class Room {
    private int maxSize;
    private ArrayList<Integer> attributes; //Art - 0, Gym - 1, Music - 2, Tech - 3, Lab - 4, Chemistry Lab - 5
    private String name;

    public Room(){
        attributes = new ArrayList<Integer>();
        name = new String();
    }
    public Room(int m, ArrayList<Integer> a, String n){
        setMaxSize(m);
        setAttributes(a);
        setName(n);
    }

    public void setAttributes(ArrayList<Integer> attributes){
        this.attributes = attributes;
    }

    public ArrayList<Integer> getAttributes() {
        return attributes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }


}
