import java.util.ArrayList;

public class Student {
    private ArrayList<String> names; //first, middle, last
    private ArrayList<Subject> classes;//index - subject, 0 - 1st period, 1 - 2nd period, 2 - 3rd period...
    private int grade;
    private String homeroom;


    public Student() {
        names = new ArrayList<String>();
        classes = new ArrayList<Subject>();
        grade = 0;
        homeroom = new String();
    }

    public void initClasses(){
       for(int i = 0; i<6; i++){
           classes.add(new Subject());
       }
    }

    public void addClass(Subject subject){
        classes.add(subject);
    }

    public void setNames(ArrayList<String> names){
        this.names = names;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public ArrayList<Subject> getClasses() {
        return classes;
    }
}
